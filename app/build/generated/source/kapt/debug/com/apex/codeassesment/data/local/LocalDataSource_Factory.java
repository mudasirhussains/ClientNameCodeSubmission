package com.apex.codeassesment.data.local;

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
public final class LocalDataSource_Factory implements Factory<LocalDataSource> {
  private final Provider<PreferencesManager> preferencesManagerProvider;

  public LocalDataSource_Factory(Provider<PreferencesManager> preferencesManagerProvider) {
    this.preferencesManagerProvider = preferencesManagerProvider;
  }

  @Override
  public LocalDataSource get() {
    LocalDataSource instance = newInstance();
    LocalDataSource_MembersInjector.injectLocalDataSource(instance, preferencesManagerProvider.get());
    return instance;
  }

  public static LocalDataSource_Factory create(
      Provider<PreferencesManager> preferencesManagerProvider) {
    return new LocalDataSource_Factory(preferencesManagerProvider);
  }

  public static LocalDataSource newInstance() {
    return new LocalDataSource();
  }
}
