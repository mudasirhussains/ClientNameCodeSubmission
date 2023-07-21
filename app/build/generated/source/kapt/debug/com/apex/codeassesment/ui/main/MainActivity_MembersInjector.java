package com.apex.codeassesment.ui.main;

import com.apex.codeassesment.data.viewmodels.MainActivityViewModel;
import dagger.MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.InjectedFieldSignature;
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
public final class MainActivity_MembersInjector implements MembersInjector<MainActivity> {
  private final Provider<MainActivityViewModel> mViewModelProvider;

  public MainActivity_MembersInjector(Provider<MainActivityViewModel> mViewModelProvider) {
    this.mViewModelProvider = mViewModelProvider;
  }

  public static MembersInjector<MainActivity> create(
      Provider<MainActivityViewModel> mViewModelProvider) {
    return new MainActivity_MembersInjector(mViewModelProvider);
  }

  @Override
  public void injectMembers(MainActivity instance) {
    injectMViewModel(instance, mViewModelProvider.get());
  }

  @InjectedFieldSignature("com.apex.codeassesment.ui.main.MainActivity.mViewModel")
  public static void injectMViewModel(MainActivity instance, MainActivityViewModel mViewModel) {
    instance.mViewModel = mViewModel;
  }
}
