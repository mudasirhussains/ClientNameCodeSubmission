package com.apex.codeassesment.ui.details

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.apex.codeassesment.R
import com.apex.codeassesment.data.model.Coordinates
import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.databinding.ActivityDetailsBinding
import com.apex.codeassesment.ui.location.LocationActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy


// TODO (3 points): Convert to Kotlin - done
// TODO (3 points): Remove bugs or crashes if any -done
// TODO (2 points): Add tests

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding : ActivityDetailsBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val user = intent.getParcelableExtra<User>("saved-user-key")

        user?.let {
            val name = user.name
            binding.detailsName.text = getString(R.string.details_name, name?.first, name?.last)
            binding.detailsEmail.text = getString(R.string.details_email, user.gender)
            user.dob?.age?.let { age -> binding.detailsAge.text = getString(R.string.age) + age.toString() }
            val coordinates = user.location?.coordinates
            binding.detailsLocation.text =
                getString(R.string.details_location, coordinates?.latitude, coordinates?.longitude)

            // TODO (1 point): Use Glide to load images
            Glide.with(this)
                .load(user.picture)
                .placeholder(R.drawable.ic_launcher_background)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .into(binding.detailsImage)
            // TODO (1 point): Add content description to images
            binding.detailsImage.contentDescription = getString(R.string.user_detail_image_view)

            binding.detailsLocationButton.setOnClickListener {
                if (coordinates != null){
                    navigateLocation(coordinates)
                }
            }
        }
    }

    private fun navigateLocation(coordinates: Coordinates) {
        val intent = Intent(this, LocationActivity::class.java)
            .putExtra("user-latitude-key", coordinates.latitude)
            .putExtra("user-longitude-key", coordinates.longitude)
        startActivity(intent)
    }
}