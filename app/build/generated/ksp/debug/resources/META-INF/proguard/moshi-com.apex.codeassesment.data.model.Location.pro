-if class com.apex.codeassesment.data.model.Location
-keepnames class com.apex.codeassesment.data.model.Location
-if class com.apex.codeassesment.data.model.Location
-keep class com.apex.codeassesment.data.model.LocationJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.apex.codeassesment.data.model.Location
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.apex.codeassesment.data.model.Location
-keepclassmembers class com.apex.codeassesment.data.model.Location {
    public synthetic <init>(com.apex.codeassesment.data.model.Street,java.lang.String,java.lang.String,java.lang.String,com.apex.codeassesment.data.model.Coordinates,com.apex.codeassesment.data.model.Timezone,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
