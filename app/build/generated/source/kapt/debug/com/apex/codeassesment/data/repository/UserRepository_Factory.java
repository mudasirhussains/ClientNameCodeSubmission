package com.apex.codeassesment.data.repository;

import com.apex.codeassesment.data.local.LocalDataSource;
import com.apex.codeassesment.data.remote.RemoteDataSource;
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
public final class UserRepository_Factory implements Factory<UserRepository> {
  private final Provider<LocalDataSource> localDataSourceProvider;

  private final Provider<RemoteDataSource> remoteDataSourceProvider;

  public UserRepository_Factory(Provider<LocalDataSource> localDataSourceProvider,
      Provider<RemoteDataSource> remoteDataSourceProvider) {
    this.localDataSourceProvider = localDataSourceProvider;
    this.remoteDataSourceProvider = remoteDataSourceProvider;
  }

  @Override
  public UserRepository get() {
    return newInstance(localDataSourceProvider.get(), remoteDataSourceProvider.get());
  }

  public static UserRepository_Factory create(Provider<LocalDataSource> localDataSourceProvider,
      Provider<RemoteDataSource> remoteDataSourceProvider) {
    return new UserRepository_Factory(localDataSourceProvider, remoteDataSourceProvider);
  }

  public static UserRepository newInstance(LocalDataSource localDataSource,
      RemoteDataSource remoteDataSource) {
    return new UserRepository(localDataSource, remoteDataSource);
  }
}
