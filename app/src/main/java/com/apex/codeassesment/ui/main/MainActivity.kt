package com.apex.codeassesment.ui.main

import android.content.Context
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.apex.codeassesment.R
import com.apex.codeassesment.RandomUserApplication
import com.apex.codeassesment.data.model.RemoteData
import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.data.viewmodels.MainActivityViewModel
import com.apex.codeassesment.databinding.ActivityMainBinding
import com.apex.codeassesment.di.MainComponent
import com.apex.codeassesment.ui.adapters.OnItemClickListener
import com.apex.codeassesment.ui.adapters.UserListAdapter
import com.apex.codeassesment.utils.navigateDetails
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import javax.inject.Inject

// TODO (5 points): Move calls to repository to Presenter or ViewModel. -done
// TODO (5 points): Use combination of sealed/Dataclasses for exposing the data required by the view from viewModel . -done
// TODO (3 points): Add tests for viewmodel or presenter. -done
// TODO (1 point): Add content description to images - done
// TODO (3 points): Add tests -done
// TODO (Optional Bonus 10 points): Make a copy of this activity with different name and convert the current layout it is using in
//  Jetpack Compose. : -done on a separate class ComposeUI.kt

/**
 * ComposeUI.kt is separate compose class. The compose UI is tested on a separate project and it's working fine. For the
 * time being it is commented.
 */

class MainActivity : AppCompatActivity(), OnItemClickListener {

  private lateinit var mViewBinding: ActivityMainBinding

  // TODO (2 points): Convert to view binding -done

  @Inject
  lateinit var mViewModel: MainActivityViewModel

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setBinding()
    setViewModel()

    sharedContext = this

    mViewModel.usersList.observe(this) { users ->
      if (users != null) {
        val adapter =UserListAdapter(users, this)
        mViewBinding.mainUserRv.layoutManager = LinearLayoutManager(this)
        mViewBinding.mainUserRv.adapter = adapter
      }
    }

    // TODO (1 point): Use Glide to load images after getting the data from endpoints mentioned in RemoteDataSource

    mViewModel.randomUser.observe(this) { user ->
      user?.let {
        mViewBinding.mainName.text = it.name?.first
        mViewBinding.mainEmail.text = it.email
        Glide.with(this)
          .load(user.picture)
          .placeholder(R.drawable.ic_launcher_background)
          .diskCacheStrategy(DiskCacheStrategy.ALL) // Caches the image both in memory and on disk
          .into(mViewBinding.mainImage)
        mViewBinding.mainImage.contentDescription = getString(R.string.description_user_image)
      }
    }

    mViewBinding.mainSeeDetailsButton.setOnClickListener {
      mViewModel.randomUser.value?.let { userValue ->
        navigateDetails(userValue) }
    }

    mViewBinding.mainRefreshButton.setOnClickListener {
      mViewModel.refreshRandomUser() }

    mViewBinding.mainUserListButton.setOnClickListener {
      mViewModel.loadUsersList()
    }


  }

  private fun setBinding() {
    mViewBinding = ActivityMainBinding.inflate(layoutInflater)
    setContentView(mViewBinding.root)
    (applicationContext as MainComponent.Injector).mainComponent.inject(this)
  }
  private fun setViewModel() {
    mViewModel = (application as RandomUserApplication).mainComponent.getMainActivityModel()
  }

  // TODO (2 points): Convert to extenstion function. - done

  companion object {
    var sharedContext: Context? = null
  }


  override fun onItemClick(user: RemoteData) {
    navigateDetails(user as User)

  }
}
