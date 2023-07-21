package com.apex.codeassesment.data.model;

@com.squareup.moshi.JsonClass(generateAdapter = true)
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u0000 C2\u00020\u0001:\u0001CB\u0095\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0015J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0013H\u00c6\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\nH\u00c6\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0099\u0001\u00105\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\t\u00106\u001a\u000207H\u00d6\u0001J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;H\u00d6\u0003J\t\u0010<\u001a\u000207H\u00d6\u0001J\t\u0010=\u001a\u00020\u0003H\u00d6\u0001J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u000207H\u00d6\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0017R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\n\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0017R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0017R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'R\u0013\u0010\r\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u0019\u00a8\u0006D"}, d2 = {"Lcom/apex/codeassesment/data/model/User;", "Landroid/os/Parcelable;", "gender", "", "name", "Lcom/apex/codeassesment/data/model/Name;", "location", "Lcom/apex/codeassesment/data/model/Location;", "email", "login", "Lcom/apex/codeassesment/data/model/Login;", "dob", "Lcom/apex/codeassesment/data/model/Dob;", "registered", "phone", "cell", "id", "Lcom/apex/codeassesment/data/model/Id;", "picture", "Lcom/apex/codeassesment/data/model/Picture;", "nat", "(Ljava/lang/String;Lcom/apex/codeassesment/data/model/Name;Lcom/apex/codeassesment/data/model/Location;Ljava/lang/String;Lcom/apex/codeassesment/data/model/Login;Lcom/apex/codeassesment/data/model/Dob;Lcom/apex/codeassesment/data/model/Dob;Ljava/lang/String;Ljava/lang/String;Lcom/apex/codeassesment/data/model/Id;Lcom/apex/codeassesment/data/model/Picture;Ljava/lang/String;)V", "getCell", "()Ljava/lang/String;", "getDob", "()Lcom/apex/codeassesment/data/model/Dob;", "getEmail", "getGender", "getId", "()Lcom/apex/codeassesment/data/model/Id;", "getLocation", "()Lcom/apex/codeassesment/data/model/Location;", "getLogin", "()Lcom/apex/codeassesment/data/model/Login;", "getName", "()Lcom/apex/codeassesment/data/model/Name;", "getNat", "getPhone", "getPicture", "()Lcom/apex/codeassesment/data/model/Picture;", "getRegistered", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Companion", "app_debug"})
@kotlinx.parcelize.Parcelize
public final class User implements android.os.Parcelable {
    @org.jetbrains.annotations.Nullable
    private final java.lang.String gender = null;
    @org.jetbrains.annotations.Nullable
    private final com.apex.codeassesment.data.model.Name name = null;
    @org.jetbrains.annotations.Nullable
    private final com.apex.codeassesment.data.model.Location location = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable
    private final com.apex.codeassesment.data.model.Login login = null;
    @org.jetbrains.annotations.Nullable
    private final com.apex.codeassesment.data.model.Dob dob = null;
    @org.jetbrains.annotations.Nullable
    private final com.apex.codeassesment.data.model.Dob registered = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String phone = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String cell = null;
    @org.jetbrains.annotations.Nullable
    private final com.apex.codeassesment.data.model.Id id = null;
    @org.jetbrains.annotations.Nullable
    private final com.apex.codeassesment.data.model.Picture picture = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String nat = null;
    @org.jetbrains.annotations.NotNull
    public static final com.apex.codeassesment.data.model.User.Companion Companion = null;
    
    public User(@org.jetbrains.annotations.Nullable
    java.lang.String gender, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Name name, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Location location, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Login login, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Dob dob, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Dob registered, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    java.lang.String cell, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Id id, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Picture picture, @org.jetbrains.annotations.Nullable
    java.lang.String nat) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Name getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Location getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Login getLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Dob getDob() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Dob getRegistered() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPhone() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getCell() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Id getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Picture getPicture() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getNat() {
        return null;
    }
    
    public User() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Id component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Picture component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Name component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Location component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Login component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Dob component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final com.apex.codeassesment.data.model.Dob component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apex.codeassesment.data.model.User copy(@org.jetbrains.annotations.Nullable
    java.lang.String gender, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Name name, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Location location, @org.jetbrains.annotations.Nullable
    java.lang.String email, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Login login, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Dob dob, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Dob registered, @org.jetbrains.annotations.Nullable
    java.lang.String phone, @org.jetbrains.annotations.Nullable
    java.lang.String cell, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Id id, @org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.model.Picture picture, @org.jetbrains.annotations.Nullable
    java.lang.String nat) {
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
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\bH\u0002\u00a8\u0006\t"}, d2 = {"Lcom/apex/codeassesment/data/model/User$Companion;", "", "()V", "createRandom", "Lcom/apex/codeassesment/data/model/User;", "randomDouble", "", "randomString", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final com.apex.codeassesment.data.model.User createRandom() {
            return null;
        }
        
        private final java.lang.String randomString() {
            return null;
        }
        
        private final double randomDouble() {
            return 0.0;
        }
    }
}