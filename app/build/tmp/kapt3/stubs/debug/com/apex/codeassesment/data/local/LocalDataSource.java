package com.apex.codeassesment.data.local;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\b\u001a\u00020\tJ\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\u000e\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\tR\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/apex/codeassesment/data/local/LocalDataSource;", "", "()V", "moshi", "Lcom/squareup/moshi/Moshi;", "kotlin.jvm.PlatformType", "preferencesManager", "Lcom/apex/codeassesment/data/local/PreferencesManager;", "loadUser", "Lcom/apex/codeassesment/data/model/User;", "localDataSource", "", "saveUser", "user", "app_debug"})
public final class LocalDataSource {
    @org.jetbrains.annotations.Nullable
    private com.apex.codeassesment.data.local.PreferencesManager preferencesManager;
    private final com.squareup.moshi.Moshi moshi = null;
    
    @javax.inject.Inject
    public LocalDataSource() {
        super();
    }
    
    @javax.inject.Inject
    public final void localDataSource(@org.jetbrains.annotations.Nullable
    com.apex.codeassesment.data.local.PreferencesManager preferencesManager) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apex.codeassesment.data.model.User loadUser() {
        return null;
    }
    
    public final void saveUser(@org.jetbrains.annotations.NotNull
    com.apex.codeassesment.data.model.User user) {
    }
}