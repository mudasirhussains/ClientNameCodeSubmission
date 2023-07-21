package com.apex.codeassesment.di;

import android.content.Context;
import com.apex.codeassesment.data.local.LocalDataSource;
import com.apex.codeassesment.data.local.LocalDataSource_Factory;
import com.apex.codeassesment.data.local.LocalDataSource_MembersInjector;
import com.apex.codeassesment.data.remote.RemoteDataSource;
import com.apex.codeassesment.data.remote.retrofit.UserApiService;
import com.apex.codeassesment.data.repository.IUserRepository;
import com.apex.codeassesment.data.repository.UserRepository;
import com.apex.codeassesment.data.viewmodels.MainActivityViewModel;
import com.apex.codeassesment.di.modules.MainModule_ProvidePreferencesManagerFactory;
import com.apex.codeassesment.di.modules.NetworkModule;
import com.apex.codeassesment.di.modules.NetworkModule_ProvidesRetrofitFactory;
import com.apex.codeassesment.di.modules.NetworkModule_ProvidesUserApiServiceFactory;
import com.apex.codeassesment.di.modules.UserRepositoryModule;
import com.apex.codeassesment.di.modules.UserRepositoryModule_GetUserRepositoryFactory;
import com.apex.codeassesment.ui.main.MainActivity;
import com.apex.codeassesment.ui.main.MainActivity_MembersInjector;
import dagger.internal.DaggerGenerated;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import retrofit2.Retrofit;

@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class DaggerMainComponent {
  private DaggerMainComponent() {
  }

  public static MainComponent.Factory factory() {
    return new Factory();
  }

  private static final class Factory implements MainComponent.Factory {
    @Override
    public MainComponent create(Context applicationContext) {
      Preconditions.checkNotNull(applicationContext);
      return new MainComponentImpl(new UserRepositoryModule(), new NetworkModule(), applicationContext);
    }
  }

  private static final class MainComponentImpl implements MainComponent {
    private final UserRepositoryModule userRepositoryModule;

    private final MainComponentImpl mainComponentImpl = this;

    private Provider<Retrofit> providesRetrofitProvider;

    private Provider<UserApiService> providesUserApiServiceProvider;

    private MainComponentImpl(UserRepositoryModule userRepositoryModuleParam,
        NetworkModule networkModuleParam, Context applicationContextParam) {
      this.userRepositoryModule = userRepositoryModuleParam;
      initialize(userRepositoryModuleParam, networkModuleParam, applicationContextParam);

    }

    private LocalDataSource localDataSource() {
      return injectLocalDataSource(LocalDataSource_Factory.newInstance());
    }

    private RemoteDataSource remoteDataSource() {
      return new RemoteDataSource(providesUserApiServiceProvider.get());
    }

    private UserRepository userRepository() {
      return new UserRepository(localDataSource(), remoteDataSource());
    }

    private IUserRepository iUserRepository() {
      return UserRepositoryModule_GetUserRepositoryFactory.getUserRepository(userRepositoryModule, userRepository());
    }

    @SuppressWarnings("unchecked")
    private void initialize(final UserRepositoryModule userRepositoryModuleParam,
        final NetworkModule networkModuleParam, final Context applicationContextParam) {
      this.providesRetrofitProvider = DoubleCheck.provider(NetworkModule_ProvidesRetrofitFactory.create(networkModuleParam));
      this.providesUserApiServiceProvider = DoubleCheck.provider(NetworkModule_ProvidesUserApiServiceFactory.create(networkModuleParam, providesRetrofitProvider));
    }

    @Override
    public void inject(MainActivity mainActivity) {
      injectMainActivity(mainActivity);
    }

    @Override
    public MainActivityViewModel getMainActivityModel() {
      return new MainActivityViewModel(iUserRepository());
    }

    private MainActivity injectMainActivity(MainActivity instance) {
      MainActivity_MembersInjector.injectMViewModel(instance, getMainActivityModel());
      return instance;
    }

    private LocalDataSource injectLocalDataSource(LocalDataSource instance) {
      LocalDataSource_MembersInjector.injectLocalDataSource(instance, MainModule_ProvidePreferencesManagerFactory.providePreferencesManager());
      return instance;
    }
  }
}
