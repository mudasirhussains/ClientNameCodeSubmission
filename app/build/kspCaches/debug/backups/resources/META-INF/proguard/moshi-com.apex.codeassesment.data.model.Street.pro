-if class com.apex.codeassesment.data.model.Street
-keepnames class com.apex.codeassesment.data.model.Street
-if class com.apex.codeassesment.data.model.Street
-keep class com.apex.codeassesment.data.model.StreetJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.apex.codeassesment.data.model.Street
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.apex.codeassesment.data.model.Street
-keepclassmembers class com.apex.codeassesment.data.model.Street {
    public synthetic <init>(java.lang.Long,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
