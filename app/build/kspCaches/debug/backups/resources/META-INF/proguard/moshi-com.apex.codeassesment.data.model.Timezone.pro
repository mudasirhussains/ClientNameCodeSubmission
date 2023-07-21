-if class com.apex.codeassesment.data.model.Timezone
-keepnames class com.apex.codeassesment.data.model.Timezone
-if class com.apex.codeassesment.data.model.Timezone
-keep class com.apex.codeassesment.data.model.TimezoneJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.apex.codeassesment.data.model.Timezone
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.apex.codeassesment.data.model.Timezone
-keepclassmembers class com.apex.codeassesment.data.model.Timezone {
    public synthetic <init>(java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
