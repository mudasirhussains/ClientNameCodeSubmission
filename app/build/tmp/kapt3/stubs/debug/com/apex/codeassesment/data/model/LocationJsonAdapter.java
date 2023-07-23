package com.apex.codeassesment.data.model;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u001a\u001a\u00020\rH\u0016R\u0016\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0001X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/apex/codeassesment/data/model/LocationJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lcom/apex/codeassesment/data/model/Location;", "moshi", "Lcom/squareup/moshi/Moshi;", "(Lcom/squareup/moshi/Moshi;)V", "constructorRef", "Ljava/lang/reflect/Constructor;", "nullableCoordinatesAdapter", "Lcom/apex/codeassesment/data/model/Coordinates;", "nullableStreetAdapter", "Lcom/apex/codeassesment/data/model/Street;", "nullableStringAdapter", "", "nullableTimezoneAdapter", "Lcom/apex/codeassesment/data/model/Timezone;", "options", "Lcom/squareup/moshi/JsonReader$Options;", "fromJson", "reader", "Lcom/squareup/moshi/JsonReader;", "toJson", "", "writer", "Lcom/squareup/moshi/JsonWriter;", "value_", "toString", "app_debug"})
public final class LocationJsonAdapter extends com.squareup.moshi.JsonAdapter<com.apex.codeassesment.data.model.Location> {
    @org.jetbrains.annotations.NotNull
    private final com.squareup.moshi.JsonReader.Options options = null;
    @org.jetbrains.annotations.NotNull
    private final com.squareup.moshi.JsonAdapter<com.apex.codeassesment.data.model.Street> nullableStreetAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final com.squareup.moshi.JsonAdapter<java.lang.String> nullableStringAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final com.squareup.moshi.JsonAdapter<com.apex.codeassesment.data.model.Coordinates> nullableCoordinatesAdapter = null;
    @org.jetbrains.annotations.NotNull
    private final com.squareup.moshi.JsonAdapter<com.apex.codeassesment.data.model.Timezone> nullableTimezoneAdapter = null;
    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.reflect.Constructor<com.apex.codeassesment.data.model.Location> constructorRef;
    
    public LocationJsonAdapter(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.Moshi moshi) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.apex.codeassesment.data.model.Location fromJson(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.JsonReader reader) {
        return null;
    }
    
    @java.lang.Override
    public void toJson(@org.jetbrains.annotations.NotNull
    com.squareup.moshi.JsonWriter writer, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Location value_) {
    }
}