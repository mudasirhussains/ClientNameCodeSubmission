package com.apex.codeassesment.data.viewmodels;

import com.apex.codeassesment.data.repository.IUserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
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
public final class MainActivityViewModel_Factory implements Factory<MainActivityViewModel> {
  private final Provider<IUserRepository> userRepositoryProvider;

  public MainActivityViewModel_Factory(Provider<IUserRepository> userRepositoryProvider) {
    this.userRepositoryProvider = userRepositoryProvider;
  }

  @Override
  public MainActivityViewModel get() {
    return newInstance(userRepositoryProvider.get());
  }

  public static MainActivityViewModel_Factory create(
      Provider<IUserRepository> userRepositoryProvider) {
    return new MainActivityViewModel_Factory(userRepositoryProvider);
  }

  public static MainActivityViewModel newInstance(IUserRepository userRepository) {
    return new MainActivityViewModel(userRepository);
  }
}
