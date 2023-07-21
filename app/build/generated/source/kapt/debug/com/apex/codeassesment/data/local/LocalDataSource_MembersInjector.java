package com.apex.codeassesment.data.local;

import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.QualifierMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

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
public final class LocalDataSource_MembersInjector implements MembersInjector<LocalDataSource> {
  private final Provider<PreferencesManager> preferencesManagerProvider;

  public LocalDataSource_MembersInjector(Provider<PreferencesManager> preferencesManagerProvider) {
    this.preferencesManagerProvider = preferencesManagerProvider;
  }

  public static MembersInjector<LocalDataSource> create(
      Provider<PreferencesManager> preferencesManagerProvider) {
    return new LocalDataSource_MembersInjector(preferencesManagerProvider);
  }

  @Override
  public void injectMembers(LocalDataSource instance) {
    injectLocalDataSource(instance, preferencesManagerProvider.get());
  }

  public static void injectLocalDataSource(LocalDataSource instance,
      PreferencesManager preferencesManager) {
    instance.localDataSource(preferencesManager);
  }
}
