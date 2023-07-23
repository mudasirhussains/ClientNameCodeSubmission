package com.apex.codeassesment.data.remote.retrofit;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J!\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0007\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\n"}, d2 = {"Lcom/apex/codeassesment/data/remote/retrofit/UserApiService;", "", "getRandomUser", "Lretrofit2/Response;", "Lcom/apex/codeassesment/data/model/RemoteData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRandomUsers", "count", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserApiService {
    
    @retrofit2.http.GET(value = "api")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRandomUser(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.apex.codeassesment.data.model.RemoteData>> $completion);
    
    @retrofit2.http.GET(value = "api")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getRandomUsers(@retrofit2.http.Query(value = "results")
    int count, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.apex.codeassesment.data.model.RemoteData>> $completion);
}