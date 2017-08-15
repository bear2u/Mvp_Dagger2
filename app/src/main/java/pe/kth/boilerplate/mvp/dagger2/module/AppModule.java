package pe.kth.boilerplate.mvp.dagger2.module;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pe.kth.boilerplate.mvp.MyApp;

@Module
public class AppModule {
    @Singleton
    @Provides
    Context providesContext(Application application) {
        return application;
    }

    // Add application level bindings here, e.g.: RestClientApi, Repository, etc.
}
