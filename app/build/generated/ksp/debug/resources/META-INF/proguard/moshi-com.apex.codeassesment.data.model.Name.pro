-if class com.apex.codeassesment.data.model.Name
-keepnames class com.apex.codeassesment.data.model.Name
-if class com.apex.codeassesment.data.model.Name
-keep class com.apex.codeassesment.data.model.NameJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.apex.codeassesment.data.model.Name
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.apex.codeassesment.data.model.Name
-keepclassmembers class com.apex.codeassesment.data.model.Name {
    public synthetic <init>(java.lang.String,java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
