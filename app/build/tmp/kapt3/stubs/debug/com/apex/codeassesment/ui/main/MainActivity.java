package com.apex.codeassesment.ui.main;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u00012\u00020\u0002:\u0001\u0015B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\rH\u0002J\b\u0010\u0014\u001a\u00020\rH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0016"}, d2 = {"Lcom/apex/codeassesment/ui/main/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/apex/codeassesment/ui/adapters/OnItemClickListener;", "()V", "mViewBinding", "Lcom/apex/codeassesment/databinding/ActivityMainBinding;", "mViewModel", "Lcom/apex/codeassesment/data/viewmodels/MainActivityViewModel;", "getMViewModel", "()Lcom/apex/codeassesment/data/viewmodels/MainActivityViewModel;", "setMViewModel", "(Lcom/apex/codeassesment/data/viewmodels/MainActivityViewModel;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onItemClick", "user", "Lcom/apex/codeassesment/data/model/RemoteData;", "setBinding", "setViewModel", "Companion", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity implements com.apex.codeassesment.ui.adapters.OnItemClickListener {
    private com.apex.codeassesment.databinding.ActivityMainBinding mViewBinding;
    @javax.inject.Inject
    public com.apex.codeassesment.data.viewmodels.MainActivityViewModel mViewModel;
    @org.jetbrains.annotations.Nullable
    private static android.content.Context sharedContext;
    @org.jetbrains.annotations.NotNull
    public static final com.apex.codeassesment.ui.main.MainActivity.Companion Companion = null;
    
    public MainActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.apex.codeassesment.data.viewmodels.MainActivityViewModel getMViewModel() {
        return null;
    }
    
    public final void setMViewModel(@org.jetbrains.annotations.NotNull
    com.apex.codeassesment.data.viewmodels.MainActivityViewModel p0) {
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void setBinding() {
    }
    
    private final void setViewModel() {
    }
    
    @java.lang.Override
    public void onItemClick(@org.jetbrains.annotations.NotNull
    com.apex.codeassesment.data.model.RemoteData user) {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b\u00a8\u0006\t"}, d2 = {"Lcom/apex/codeassesment/ui/main/MainActivity$Companion;", "", "()V", "sharedContext", "Landroid/content/Context;", "getSharedContext", "()Landroid/content/Context;", "setSharedContext", "(Landroid/content/Context;)V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.Nullable
        public final android.content.Context getSharedContext() {
            return null;
        }
        
        public final void setSharedContext(@org.jetbrains.annotations.Nullable
        android.content.Context p0) {
        }
    }
}