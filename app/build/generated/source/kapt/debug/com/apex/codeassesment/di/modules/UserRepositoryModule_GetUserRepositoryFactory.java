package com.apex.codeassesment.di.modules;

import com.apex.codeassesment.data.repository.IUserRepository;
import com.apex.codeassesment.data.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UserRepositoryModule_GetUserRepositoryFactory implements Factory<IUserRepository> {
  private final UserRepositoryModule module;

  private final Provider<UserRepository> userRepositoryProvider;

  public UserRepositoryModule_GetUserRepositoryFactory(UserRepositoryModule module,
      Provider<UserRepository> userRepositoryProvider) {
    this.module = module;
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public IUserRepository get() {
    return getUserRepository(module, userRepositoryProvider.get());
  }

  public static UserRepositoryModule_GetUserRepositoryFactory create(UserRepositoryModule module,
      Provider<UserRepository> userRepositoryProvider) {
    return new UserRepositoryModule_GetUserRepositoryFactory(module, userRepositoryProvider);
  }

  public static IUserRepository getUserRepository(UserRepositoryModule instance,
      UserRepository userRepository) {
    return Preconditions.checkNotNullFromProvides(instance.getUserRepository(userRepository));
  }
}
