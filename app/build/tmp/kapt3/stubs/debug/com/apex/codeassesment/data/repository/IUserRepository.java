package com.apex.codeassesment.data.repository;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u001f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\n0\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/apex/codeassesment/data/repository/IUserRepository;", "", "getSavedUser", "Lcom/apex/codeassesment/data/model/User;", "getUser", "Lcom/apex/codeassesment/data/remote/DataResult;", "forceUpdate", "", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUsersList", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface IUserRepository {
    
    @org.jetbrains.annotations.NotNull
    public abstract com.apex.codeassesment.data.model.User getSavedUser();
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUser(boolean forceUpdate, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.apex.codeassesment.data.remote.DataResult<com.apex.codeassesment.data.model.User>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getUsersList(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.apex.codeassesment.data.remote.DataResult<? extends java.util.List<com.apex.codeassesment.data.model.User>>> $completion);
}