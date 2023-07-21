package com.apex.codeassesment.utils

import android.content.Context
import android.content.Intent
import android.location.LocationManager
import com.apex.codeassesment.data.model.User
import com.apex.codeassesment.ui.details.DetailsActivity

fun Context.navigateDetails(user: User) {
    val putExtra = Intent(this, DetailsActivity::class.java).putExtra("saved-user-key", user)
    startActivity(putExtra)
}

fun Context.isLocationEnabled(): Boolean {
    val locationManager = getSystemService(Context.LOCATION_SERVICE) as LocationManager
    return locationManager.isProviderEnabled(LocationManager.GPS_PROVIDER) ||
            locationManager.isProviderEnabled(LocationManager.NETWORK_PROVIDER)
}