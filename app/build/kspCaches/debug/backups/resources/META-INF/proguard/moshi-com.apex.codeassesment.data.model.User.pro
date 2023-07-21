-if class com.apex.codeassesment.data.model.User
-keepnames class com.apex.codeassesment.data.model.User
-if class com.apex.codeassesment.data.model.User
-keep class com.apex.codeassesment.data.model.UserJsonAdapter {
    public <init>(com.squareup.moshi.Moshi);
}
-if class com.apex.codeassesment.data.model.User
-keepnames class kotlin.jvm.internal.DefaultConstructorMarker
-if class com.apex.codeassesment.data.model.User
-keepclassmembers class com.apex.codeassesment.data.model.User {
    public synthetic <init>(java.lang.String,com.apex.codeassesment.data.model.Name,com.apex.codeassesment.data.model.Location,java.lang.String,com.apex.codeassesment.data.model.Login,com.apex.codeassesment.data.model.Dob,com.apex.codeassesment.data.model.Dob,java.lang.String,java.lang.String,com.apex.codeassesment.data.model.Id,com.apex.codeassesment.data.model.Picture,java.lang.String,int,kotlin.jvm.internal.DefaultConstructorMarker);
}
