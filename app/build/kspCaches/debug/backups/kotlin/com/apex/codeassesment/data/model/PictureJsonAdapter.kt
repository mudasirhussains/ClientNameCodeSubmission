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

public class PictureJsonAdapter(
  moshi: Moshi
) : JsonAdapter<Picture>() {
  private val options: JsonReader.Options = JsonReader.Options.of("large", "medium", "thumbnail")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "large")

  @Volatile
  private var constructorRef: Constructor<Picture>? = null

  public override fun toString(): String = buildString(29) {
      append("GeneratedJsonAdapter(").append("Picture").append(')') }

  public override fun fromJson(reader: JsonReader): Picture {
    var large: String? = null
    var medium: String? = null
    var thumbnail: String? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          large = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          medium = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          thumbnail = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xfffffff8.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  Picture(
          large = large,
          medium = medium,
          thumbnail = thumbnail
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<Picture> = this.constructorRef ?:
          Picture::class.java.getDeclaredConstructor(String::class.java, String::class.java,
          String::class.java, Int::class.javaPrimitiveType, Util.DEFAULT_CONSTRUCTOR_MARKER).also {
          this.constructorRef = it }
      return localConstructor.newInstance(
          large,
          medium,
          thumbnail,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: Picture?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("large")
    nullableStringAdapter.toJson(writer, value_.large)
    writer.name("medium")
    nullableStringAdapter.toJson(writer, value_.medium)
    writer.name("thumbnail")
    nullableStringAdapter.toJson(writer, value_.thumbnail)
    writer.endObject()
  }
}
