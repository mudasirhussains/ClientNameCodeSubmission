package com.apex.codeassesment.data.viewmodels;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011R\u0016\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00068F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001f\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t0\u00068F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\r\u00a8\u0006\u0013"}, d2 = {"Lcom/apex/codeassesment/data/viewmodels/MainActivityViewModel;", "Landroidx/lifecycle/ViewModel;", "userRepository", "Lcom/apex/codeassesment/data/repository/IUserRepository;", "(Lcom/apex/codeassesment/data/repository/IUserRepository;)V", "_randomUser", "Landroidx/lifecycle/MutableLiveData;", "Lcom/apex/codeassesment/data/model/User;", "_usersList", "", "Lcom/apex/codeassesment/data/model/RemoteData;", "randomUser", "getRandomUser", "()Landroidx/lifecycle/MutableLiveData;", "usersList", "getUsersList", "loadUsers", "", "refreshRandomUser", "app_debug"})
public final class MainActivityViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.apex.codeassesment.data.repository.IUserRepository userRepository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.apex.codeassesment.data.model.User> _randomUser = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.apex.codeassesment.data.model.RemoteData>> _usersList = null;
    
    @javax.inject.Inject
    public MainActivityViewModel(@org.jetbrains.annotations.NotNull
    com.apex.codeassesment.data.repository.IUserRepository userRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<com.apex.codeassesment.data.model.User> getRandomUser() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.apex.codeassesment.data.model.RemoteData>> getUsersList() {
        return null;
    }
    
    public final void refreshRandomUser() {
    }
    
    public final void loadUsers() {
    }
}