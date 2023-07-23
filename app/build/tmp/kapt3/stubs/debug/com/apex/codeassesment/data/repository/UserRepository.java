package com.apex.codeassesment.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0007\u001a\u00020\bH\u0016J\u001f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n2\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u000f0\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/apex/codeassesment/data/repository/UserRepository;", "Lcom/apex/codeassesment/data/repository/IUserRepository;", "localDataSource", "Lcom/apex/codeassesment/data/local/LocalDataSource;", "remoteDataSource", "Lcom/apex/codeassesment/data/remote/RemoteDataSource;", "(Lcom/apex/codeassesment/data/local/LocalDataSource;Lcom/apex/codeassesment/data/remote/RemoteDataSource;)V", "getSavedUser", "Lcom/apex/codeassesment/data/model/User;", "getUser", "Lcom/apex/codeassesment/data/remote/DataResult;", "forceUpdate", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsersList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepository implements com.apex.codeassesment.data.repository.IUserRepository {
    @org.jetbrains.annotations.NotNull
    private final com.apex.codeassesment.data.local.LocalDataSource localDataSource = null;
    @org.jetbrains.annotations.NotNull
    private final com.apex.codeassesment.data.remote.RemoteDataSource remoteDataSource = null;
    
    @javax.inject.Inject
    public UserRepository(@org.jetbrains.annotations.NotNull
    com.apex.codeassesment.data.local.LocalDataSource localDataSource, @org.jetbrains.annotations.NotNull
    com.apex.codeassesment.data.remote.RemoteDataSource remoteDataSource) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.apex.codeassesment.data.model.User getSavedUser() {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getUser(boolean forceUpdate, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.apex.codeassesment.data.remote.DataResult<com.apex.codeassesment.data.model.User>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getUsersList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.apex.codeassesment.data.remote.DataResult<? extends java.util.List<com.apex.codeassesment.data.model.User>>> $completion) {
        return null;
    }
}