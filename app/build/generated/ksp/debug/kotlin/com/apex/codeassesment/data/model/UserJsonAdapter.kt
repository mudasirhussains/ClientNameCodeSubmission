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

public class UserJsonAdapter(
  moshi: Moshi
) : JsonAdapter<User>() {
  private val options: JsonReader.Options = JsonReader.Options.of("gender", "name", "location",
      "email", "login", "dob", "registered", "phone", "cell", "id", "picture", "nat")

  private val nullableStringAdapter: JsonAdapter<String?> = moshi.adapter(String::class.java,
      emptySet(), "gender")

  private val nullableNameAdapter: JsonAdapter<Name?> = moshi.adapter(Name::class.java, emptySet(),
      "name")

  private val nullableLocationAdapter: JsonAdapter<Location?> = moshi.adapter(Location::class.java,
      emptySet(), "location")

  private val nullableLoginAdapter: JsonAdapter<Login?> = moshi.adapter(Login::class.java,
      emptySet(), "login")

  private val nullableDobAdapter: JsonAdapter<Dob?> = moshi.adapter(Dob::class.java, emptySet(),
      "dob")

  private val nullableIdAdapter: JsonAdapter<Id?> = moshi.adapter(Id::class.java, emptySet(), "id")

  private val nullablePictureAdapter: JsonAdapter<Picture?> = moshi.adapter(Picture::class.java,
      emptySet(), "picture")

  @Volatile
  private var constructorRef: Constructor<User>? = null

  public override fun toString(): String = buildString(26) {
      append("GeneratedJsonAdapter(").append("User").append(')') }

  public override fun fromJson(reader: JsonReader): User {
    var gender: String? = null
    var name: Name? = null
    var location: Location? = null
    var email: String? = null
    var login: Login? = null
    var dob: Dob? = null
    var registered: Dob? = null
    var phone: String? = null
    var cell: String? = null
    var id: Id? = null
    var picture: Picture? = null
    var nat: String? = null
    var mask0 = -1
    reader.beginObject()
    while (reader.hasNext()) {
      when (reader.selectName(options)) {
        0 -> {
          gender = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 0).inv()
          mask0 = mask0 and 0xfffffffe.toInt()
        }
        1 -> {
          name = nullableNameAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 1).inv()
          mask0 = mask0 and 0xfffffffd.toInt()
        }
        2 -> {
          location = nullableLocationAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 2).inv()
          mask0 = mask0 and 0xfffffffb.toInt()
        }
        3 -> {
          email = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 3).inv()
          mask0 = mask0 and 0xfffffff7.toInt()
        }
        4 -> {
          login = nullableLoginAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 4).inv()
          mask0 = mask0 and 0xffffffef.toInt()
        }
        5 -> {
          dob = nullableDobAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 5).inv()
          mask0 = mask0 and 0xffffffdf.toInt()
        }
        6 -> {
          registered = nullableDobAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 6).inv()
          mask0 = mask0 and 0xffffffbf.toInt()
        }
        7 -> {
          phone = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 7).inv()
          mask0 = mask0 and 0xffffff7f.toInt()
        }
        8 -> {
          cell = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 8).inv()
          mask0 = mask0 and 0xfffffeff.toInt()
        }
        9 -> {
          id = nullableIdAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 9).inv()
          mask0 = mask0 and 0xfffffdff.toInt()
        }
        10 -> {
          picture = nullablePictureAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 10).inv()
          mask0 = mask0 and 0xfffffbff.toInt()
        }
        11 -> {
          nat = nullableStringAdapter.fromJson(reader)
          // $mask = $mask and (1 shl 11).inv()
          mask0 = mask0 and 0xfffff7ff.toInt()
        }
        -1 -> {
          // Unknown name, skip it.
          reader.skipName()
          reader.skipValue()
        }
      }
    }
    reader.endObject()
    if (mask0 == 0xfffff000.toInt()) {
      // All parameters with defaults are set, invoke the constructor directly
      return  User(
          gender = gender,
          name = name,
          location = location,
          email = email,
          login = login,
          dob = dob,
          registered = registered,
          phone = phone,
          cell = cell,
          id = id,
          picture = picture,
          nat = nat
      )
    } else {
      // Reflectively invoke the synthetic defaults constructor
      @Suppress("UNCHECKED_CAST")
      val localConstructor: Constructor<User> = this.constructorRef ?:
          User::class.java.getDeclaredConstructor(String::class.java, Name::class.java,
          Location::class.java, String::class.java, Login::class.java, Dob::class.java,
          Dob::class.java, String::class.java, String::class.java, Id::class.java,
          Picture::class.java, String::class.java, Int::class.javaPrimitiveType,
          Util.DEFAULT_CONSTRUCTOR_MARKER).also { this.constructorRef = it }
      return localConstructor.newInstance(
          gender,
          name,
          location,
          email,
          login,
          dob,
          registered,
          phone,
          cell,
          id,
          picture,
          nat,
          mask0,
          /* DefaultConstructorMarker */ null
      )
    }
  }

  public override fun toJson(writer: JsonWriter, value_: User?): Unit {
    if (value_ == null) {
      throw NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.")
    }
    writer.beginObject()
    writer.name("gender")
    nullableStringAdapter.toJson(writer, value_.gender)
    writer.name("name")
    nullableNameAdapter.toJson(writer, value_.name)
    writer.name("location")
    nullableLocationAdapter.toJson(writer, value_.location)
    writer.name("email")
    nullableStringAdapter.toJson(writer, value_.email)
    writer.name("login")
    nullableLoginAdapter.toJson(writer, value_.login)
    writer.name("dob")
    nullableDobAdapter.toJson(writer, value_.dob)
    writer.name("registered")
    nullableDobAdapter.toJson(writer, value_.registered)
    writer.name("phone")
    nullableStringAdapter.toJson(writer, value_.phone)
    writer.name("cell")
    nullableStringAdapter.toJson(writer, value_.cell)
    writer.name("id")
    nullableIdAdapter.toJson(writer, value_.id)
    writer.name("picture")
    nullablePictureAdapter.toJson(writer, value_.picture)
    writer.name("nat")
    nullableStringAdapter.toJson(writer, value_.nat)
    writer.endObject()
  }
}
