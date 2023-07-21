package com.apex.codeassesment.di

import android.content.Context
import com.apex.codeassesment.data.viewmodels.MainActivityViewModel
import com.apex.codeassesment.di.modules.MainModule
import com.apex.codeassesment.di.modules.NetworkModule
import com.apex.codeassesment.di.modules.UserRepositoryModule
import com.apex.codeassesment.ui.main.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MainModule::class, UserRepositoryModule::class, NetworkModule::class])
interface MainComponent {

  @Component.Factory
  interface Factory {
    fun create(@BindsInstance applicationContext: Context): MainComponent
  }

  interface Injector {
    val mainComponent: MainComponent
  }

  fun inject(mainActivity: MainActivity)

  fun getMainActivityModel(): MainActivityViewModel

}