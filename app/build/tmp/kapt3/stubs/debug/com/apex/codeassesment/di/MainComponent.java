package com.apex.codeassesment.di;

@javax.inject.Singleton
@dagger.Component(modules = {com.apex.codeassesment.di.modules.MainModule.class, com.apex.codeassesment.di.modules.UserRepositoryModule.class, com.apex.codeassesment.di.modules.NetworkModule.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001:\u0002\b\tJ\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\n"}, d2 = {"Lcom/apex/codeassesment/di/MainComponent;", "", "getMainActivityModel", "Lcom/apex/codeassesment/data/viewmodels/MainActivityViewModel;", "inject", "", "mainActivity", "Lcom/apex/codeassesment/ui/main/MainActivity;", "Factory", "Injector", "app_debug"})
public abstract interface MainComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull
    com.apex.codeassesment.ui.main.MainActivity mainActivity);
    
    @org.jetbrains.annotations.NotNull
    public abstract com.apex.codeassesment.data.viewmodels.MainActivityViewModel getMainActivityModel();
    
    @dagger.Component.Factory
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/apex/codeassesment/di/MainComponent$Factory;", "", "create", "Lcom/apex/codeassesment/di/MainComponent;", "applicationContext", "Landroid/content/Context;", "app_debug"})
    public static abstract interface Factory {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.apex.codeassesment.di.MainComponent create(@dagger.BindsInstance
        @org.jetbrains.annotations.NotNull
        android.content.Context applicationContext);
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/apex/codeassesment/di/MainComponent$Injector;", "", "mainComponent", "Lcom/apex/codeassesment/di/MainComponent;", "getMainComponent", "()Lcom/apex/codeassesment/di/MainComponent;", "app_debug"})
    public static abstract interface Injector {
        
        @org.jetbrains.annotations.NotNull
        public abstract com.apex.codeassesment.di.MainComponent getMainComponent();
    }
}