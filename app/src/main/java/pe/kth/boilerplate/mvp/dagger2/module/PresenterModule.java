package pe.kth.boilerplate.mvp.dagger2.module;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import pe.kth.boilerplate.mvp.presenter.MainPresenter;

@Module
public class PresenterModule {

    @Provides
    @Singleton
    MainPresenter provideMainPresenter(Context context){
        return new MainPresenter(context);
    }
}
