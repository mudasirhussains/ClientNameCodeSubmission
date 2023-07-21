package com.apex.codeassesment.data.model;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\u0002\u0010\u000eJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\tH\u00c6\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010!\u001a\u0004\u0018\u00010\u000bH\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\rH\u00c6\u0003Jb\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u00c6\u0001\u00a2\u0006\u0002\u0010$J\t\u0010%\u001a\u00020&H\u00d6\u0001J\u0013\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*H\u00d6\u0003J\t\u0010+\u001a\u00020&H\u00d6\u0001J\t\u0010,\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020&H\u00d6\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0015\u0010\b\u001a\u0004\u0018\u00010\t\u00a2\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00062"}, d2 = {"Lcom/apex/codeassesment/data/model/Location;", "Landroid/os/Parcelable;", "street", "Lcom/apex/codeassesment/data/model/Street;", "city", "", "state", "country", "postcode", "", "coordinates", "Lcom/apex/codeassesment/data/model/Coordinates;", "timezone", "Lcom/apex/codeassesment/data/model/Timezone;", "(Lcom/apex/codeassesment/data/model/Street;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/apex/codeassesment/data/model/Coordinates;Lcom/apex/codeassesment/data/model/Timezone;)V", "getCity", "()Ljava/lang/String;", "getCoordinates", "()Lcom/apex/codeassesment/data/model/Coordinates;", "getCountry", "getPostcode", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getState", "getStreet", "()Lcom/apex/codeassesment/data/model/Street;", "getTimezone", "()Lcom/apex/codeassesment/data/model/Timezone;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/apex/codeassesment/data/model/Street;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Lcom/apex/codeassesment/data/model/Coordinates;Lcom/apex/codeassesment/data/model/Timezone;)Lcom/apex/codeassesment/data/model/Location;", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
@kotlinx.parcelize.Parcelize
public final class Location implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private final com.apex.codeassesment.data.model.Street street = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String city = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String state = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String country = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.Long postcode = null;
    @org.jetbrains.annotations.Nullable
    private final com.apex.codeassesment.data.model.Coordinates coordinates = null;
    @org.jetbrains.annotations.Nullable
    private final com.apex.codeassesment.data.model.Timezone timezone = null;
    
    public Location(@org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Street street, @org.jetbrains.annotations.Nullable
    java.lang.String city, @org.jetbrains.annotations.Nullable
    java.lang.String state, @org.jetbrains.annotations.Nullable
    java.lang.String country, @org.jetbrains.annotations.Nullable
    java.lang.Long postcode, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Coordinates coordinates, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Timezone timezone) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Street getStreet() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCity() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCountry() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long getPostcode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Coordinates getCoordinates() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Timezone getTimezone() {
        return null;
    }
    
    public Location() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Street component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Long component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Coordinates component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Timezone component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apex.codeassesment.data.model.Location copy(@org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Street street, @org.jetbrains.annotations.Nullable
    java.lang.String city, @org.jetbrains.annotations.Nullable
    java.lang.String state, @org.jetbrains.annotations.Nullable
    java.lang.String country, @org.jetbrains.annotations.Nullable
    java.lang.Long postcode, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Coordinates coordinates, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Timezone timezone) {
        return null;
    }
    
    @java.lang.Override
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override
    public void writeToParcel(@org.jetbrains.annotations.NotNull
    android.os.Parcel parcel, int flags) {
    }
}