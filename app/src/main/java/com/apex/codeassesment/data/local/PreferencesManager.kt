package com.apex.codeassesment.data.local

import android.content.Context
import android.content.SharedPreferences
import com.apex.codeassesment.ui.main.MainActivity

// TODO (2 point): Add tests
class PreferencesManager {

  private var sharedPreferences: SharedPreferences? = null

  fun setSharedPreferences(sharedPreferences: SharedPreferences) {
    this.sharedPreferences = sharedPreferences
  }

  fun saveUser(user: String) {
    val sharedPreferences = MainActivity.sharedContext?.getSharedPreferences("random-user-preferences", Context.MODE_PRIVATE)
    sharedPreferences?.edit()?.putString("saved-user", user)?.apply()
  }

  fun loadUser(): String? {
    val sharedPreferences = MainActivity.sharedContext?.getSharedPreferences("random-user-preferences", Context.MODE_PRIVATE)
    return sharedPreferences?.getString("saved-user", null)
  }
}
