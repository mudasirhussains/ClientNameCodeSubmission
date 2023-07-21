package com.apex.codeassesment.di.modules;

@dagger.Module
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/apex/codeassesment/di/modules/UserRepositoryModule;", "", "()V", "getUserRepository", "Lcom/apex/codeassesment/data/repository/IUserRepository;", "userRepository", "Lcom/apex/codeassesment/data/repository/UserRepository;", "app_debug"})
public final class UserRepositoryModule {
    
    public UserRepositoryModule() {
        super();
    }
    
    @dagger.Provides
    @org.jetbrains.annotations.NotNull
    public final com.apex.codeassesment.data.repository.IUserRepository getUserRepository(@org.jetbrains.annotations.NotNull
    com.apex.codeassesment.data.repository.UserRepository userRepository) {
        return null;
    }
}