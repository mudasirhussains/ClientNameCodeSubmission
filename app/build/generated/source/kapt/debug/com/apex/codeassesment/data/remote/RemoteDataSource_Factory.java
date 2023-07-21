package com.apex.codeassesment.data.remote;

import com.apex.codeassesment.data.remote.retrofit.UserApiService;
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
public final class RemoteDataSource_Factory implements Factory<RemoteDataSource> {
  private final Provider<UserApiService> userApiServiceProvider;

  public RemoteDataSource_Factory(Provider<UserApiService> userApiServiceProvider) {
    this.userApiServiceProvider = userApiServiceProvider;
  }

  @Override
  public RemoteDataSource get() {
    return newInstance(userApiServiceProvider.get());
  }

  public static RemoteDataSource_Factory create(Provider<UserApiService> userApiServiceProvider) {
    return new RemoteDataSource_Factory(userApiServiceProvider);
  }

  public static RemoteDataSource newInstance(UserApiService userApiService) {
    return new RemoteDataSource(userApiService);
  }
}
