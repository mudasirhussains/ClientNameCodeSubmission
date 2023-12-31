// Code generated by moshi-kotlin-codegen. Do not edit.
@file:Suppress("DEPRECATION", "unused", "ClassName", "REDUNDANT_PROJECTION",
    "RedundantExplicitType", "LocalVariableName", "RedundantVisibilityModifier",
    "PLATFORM_CLASS_MAPPED_TO_KOTLIN", "IMPLICIT_NOTHING_TYPE_ARGUMENT_IN_RETURN_POSITION")

package com.apex.codeassesment.`data`.model

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.JsonReader
import com.squareup.moshi.JsonWriter
import com.squareup.moshi.Moshi
import com.squareup.moshi.`internal`.Util
import java.lang.NullPointerException
import java.lang.reflect.Constructor
import kotlin.Int
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.emptySet
import kotlin.jvm.Volatile
import kotlin.text.buildString

public class LocationJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Location>() {
  private val options: JsonReader.Options = JsonReader.Options.of("street", "city", "state",
      "country", "coordinates", "timezone")

  private val nullableStreetAdapter: JsonAdapter<Street?> = moshi.adapter(Street::class.java,
      emptySet(), "street")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "city")

  private val nullableCoordinatesAdapter: JsonAdapter<Coordinates?> =
      moshi.adapter(Coordinates::class.java, emptySet(), "coordinates")

  private val nullableTimezoneAdapter: JsonAdapter<Timezone?> = moshi.adapter(Timezone::class.java,
      emptySet(), "timezone")

  @Volatile
  private var constructorRef: Constructor<Location>? = null

  public override fun toString(): String = buildString(30) {
      append("GeneratedJsonAdapter(").append("Location").append(')') }

  public override fun fromJson(reader: JsonReader): Location {
    var street: Street? = null
    var city: String? = null
    var state: String? = null
    var country: String? = null
    var coordinates: Coordinates? = null
    var timezone: Timezone? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          street = nullableStreetAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          city = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          state = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        3 -> {
          country = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 3).inv()
          mask0 = mask0 and 0xfffffff7.toInt()
        }
        4 -> {
          coordinates = nullableCoordinatesAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 4).inv()
          mask0 = mask0 and 0xffffffef.toInt()
        }
        5 -> {
          timezone = nullableTimezoneAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 5).inv()
          mask0 = mask0 and 0xffffffdf.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xffffffc0.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  Location(
          street = street,
          city = city,
          state = state,
          country = country,
          coordinates = coordinates,
          timezone = timezone
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<Location> = this.constructorRef ?:
          Location::class.java.getDeclaredConstructor(Street::class.java, String::class.java,
          String::class.java, String::class.java, Coordinates::class.java, Timezone::class.java,
          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {
          this.constructorRef = it }
      return localConstructor.newInstance(
          street,
          city,
          state,
          country,
          coordinates,
          timezone,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: Location?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("street")
    nullableStreetAdapter.toJson(writer, value_.street)
    writer.name("city")
    nullableStringAdapter.toJson(writer, value_.city)
    writer.name("state")
    nullableStringAdapter.toJson(writer, value_.state)
    writer.name("country")
    nullableStringAdapter.toJson(writer, value_.country)
    writer.name("coordinates")
    nullableCoordinatesAdapter.toJson(writer, value_.coordinates)
    writer.name("timezone")
    nullableTimezoneAdapter.toJson(writer, value_.timezone)
    writer.endObject()
  }
}
