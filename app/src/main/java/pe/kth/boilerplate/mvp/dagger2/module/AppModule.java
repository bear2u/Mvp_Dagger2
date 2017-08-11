package pe.kth.boilerplate.mvp.dagger2.module;

import android.content.Context;

import dagger.Module;
import dagger.Provides;
import pe.kth.boilerplate.mvp.MyApp;

@Module
public class AppModule {
    @Provides
    public Context provideContext(MyApp app){
        return app.getApplicationContext();
    }

    // Add application level bindings here, e.g.: RestClientApi, Repository, etc.
}
