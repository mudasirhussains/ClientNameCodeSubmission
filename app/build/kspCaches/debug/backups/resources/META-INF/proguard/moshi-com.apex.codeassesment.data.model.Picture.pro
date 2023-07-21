-if class com.apex.codeassesment.data.model.Picture
-keepnames class com.apex.codeassesment.data.model.Picture
-if class com.apex.codeassesment.data.model.Picture
-keep class com.apex.codeassesment.data.model.PictureJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.apex.codeassesment.data.model.Picture
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.apex.codeassesment.data.model.Picture
-keepclassmembers class com.apex.codeassesment.data.model.Picture {
    public synthetic <init>(java.lang.String,java.lang.String,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
