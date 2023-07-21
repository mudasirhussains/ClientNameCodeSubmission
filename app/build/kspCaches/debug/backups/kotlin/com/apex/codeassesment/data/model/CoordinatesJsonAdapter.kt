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

public class CoordinatesJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Coordinates>() {
  private val options: JsonReader.Options = JsonReader.Options.of("latitude", "longitude")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "latitude")

  @Volatile
  private var constructorRef: Constructor<Coordinates>? = null

  public override fun toString(): String = buildString(33) {
      append("GeneratedJsonAdapter(").append("Coordinates").append(')') }

  public override fun fromJson(reader: JsonReader): Coordinates {
    var latitude: String? = null
    var longitude: String? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          latitude = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          longitude = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xfffffffc.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  Coordinates(
          latitude = latitude,
          longitude = longitude
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<Coordinates> = this.constructorRef ?:
          Coordinates::class.java.getDeclaredConstructor(String::class.java, String::class.java,
          Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {
          this.constructorRef = it }
      return localConstructor.newInstance(
          latitude,
          longitude,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: Coordinates?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("latitude")
    nullableStringAdapter.toJson(writer, value_.latitude)
    writer.name("longitude")
    nullableStringAdapter.toJson(writer, value_.longitude)
    writer.endObject()
  }
}