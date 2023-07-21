package com.apex.codeassesment.data.remote;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ%\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00062\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/apex/codeassesment/data/remote/RemoteDataSource;", "", "userApiService", "Lcom/apex/codeassesment/data/remote/retrofit/UserApiService;", "(Lcom/apex/codeassesment/data/remote/retrofit/UserApiService;)V", "loadUser", "Lcom/apex/codeassesment/data/remote/DataResult;", "Lcom/apex/codeassesment/data/model/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadUsersWithGivenCount", "", "Lcom/apex/codeassesment/data/model/RemoteData;", "count", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class RemoteDataSource {
    @org.jetbrains.annotations.NotNull
    private final com.apex.codeassesment.data.remote.retrofit.UserApiService userApiService = null;
    
    @javax.inject.Inject
    public RemoteDataSource(@org.jetbrains.annotations.NotNull
    com.apex.codeassesment.data.remote.retrofit.UserApiService userApiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadUser(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.apex.codeassesment.data.remote.DataResult<com.apex.codeassesment.data.model.User>> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object loadUsersWithGivenCount(int count, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.apex.codeassesment.data.remote.DataResult<? extends java.util.List<com.apex.codeassesment.data.model.RemoteData>>> $completion) {
        return null;
    }
}