package com.apex.codeassesment.ui.location

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.apex.codeassesment.R
import com.apex.codeassesment.databinding.ActivityLocationBinding
import com.apex.codeassesment.utils.GPSTracker
import kotlin.math.atan2
import kotlin.math.cos
import kotlin.math.sin
import kotlin.math.sqrt


// TODO (Optional Bonus 8 points): Calculate distance between 2 coordinates using phone's location
class LocationActivity : AppCompatActivity() {
  private lateinit var binding: ActivityLocationBinding
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    binding = ActivityLocationBinding.inflate(layoutInflater)
    setContentView(binding.root)

    val gps = GPSTracker(this@LocationActivity)
    binding.locationPhone.text = getString(R.string.location_phone, gps.latitude.toString(), gps.longitude.toString())

    val latitudeRandomUser = intent.getStringExtra("user-latitude-key")
    val longitudeRandomUser = intent.getStringExtra("user-longitude-key")

    if (latitudeRandomUser.isNullOrEmpty().not() && longitudeRandomUser.isNullOrEmpty().not()){
      binding.locationRandomUser.text = getString(R.string.location_random_user, latitudeRandomUser, longitudeRandomUser)
      binding.locationCalculateButton.setOnClickListener {
        //confirm using online source https://www.calculator.net/distance-calculator.html
        val distanceInMiles= latitudeRandomUser?.let { it1 -> longitudeRandomUser?.let { it2 -> haversineDistance(it1.toDouble(), it2.toDouble(), gps.latitude, gps.longitude) } }
        binding.locationDistance.text = getString(R.string.location_result_miles, distanceInMiles)
      }
    }
  }

  private fun haversineDistance(lat1: Double, lon1: Double, lat2: Double, lon2: Double): Double {
    val earthRadiusKm = 6371.0
    val dLat = Math.toRadians(lat2 - lat1)
    val dLon = Math.toRadians(lon2 - lon1)
    val a = sin(dLat / 2) * sin(dLat / 2) +
            cos(Math.toRadians(lat1)) * cos(Math.toRadians(lat2)) *
            sin(dLon / 2) * sin(dLon / 2)
    val c = 2 * atan2(sqrt(a), sqrt(1 - a))
    val distanceKm = earthRadiusKm * c
    return distanceKm * 0.621371
  }
}
