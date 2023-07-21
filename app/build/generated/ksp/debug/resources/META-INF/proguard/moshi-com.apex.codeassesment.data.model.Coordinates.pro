-if class com.apex.codeassesment.data.model.Coordinates
-keepnames class com.apex.codeassesment.data.model.Coordinates
-if class com.apex.codeassesment.data.model.Coordinates
-keep class com.apex.codeassesment.data.model.CoordinatesJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.apex.codeassesment.data.model.Coordinates
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.apex.codeassesment.data.model.Coordinates
-keepclassmembers class com.apex.codeassesment.data.model.Coordinates {
    public synthetic <init>(java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
