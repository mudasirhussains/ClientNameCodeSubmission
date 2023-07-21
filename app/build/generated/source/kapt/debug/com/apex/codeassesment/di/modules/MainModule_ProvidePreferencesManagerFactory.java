package com.apex.codeassesment.di.modules;

import com.apex.codeassesment.data.local.PreferencesManager;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class MainModule_ProvidePreferencesManagerFactory implements Factory<PreferencesManager> {
  @Override
  public PreferencesManager get() {
    return providePreferencesManager();
  }

  public static MainModule_ProvidePreferencesManagerFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static PreferencesManager providePreferencesManager() {
    return Preconditions.checkNotNullFromProvides(MainModule.INSTANCE.providePreferencesManager());
  }

  private static final class InstanceHolder {
    private static final MainModule_ProvidePreferencesManagerFactory INSTANCE = new MainModule_ProvidePreferencesManagerFactory();
  }
}
