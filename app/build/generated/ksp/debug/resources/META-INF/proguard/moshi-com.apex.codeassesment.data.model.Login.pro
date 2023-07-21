-if class com.apex.codeassesment.data.model.Login
-keepnames class com.apex.codeassesment.data.model.Login
-if class com.apex.codeassesment.data.model.Login
-keep class com.apex.codeassesment.data.model.LoginJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.apex.codeassesment.data.model.Login
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.apex.codeassesment.data.model.Login
-keepclassmembers class com.apex.codeassesment.data.model.Login {
    public synthetic <init>(java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
