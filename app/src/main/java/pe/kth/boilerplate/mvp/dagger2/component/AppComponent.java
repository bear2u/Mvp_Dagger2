package pe.kth.boilerplate.mvp.dagger2.component;

import javax.inject.Singleton;

import dagger.Component;
import pe.kth.boilerplate.mvp.dagger2.module.AppModule;
import pe.kth.boilerplate.mvp.dagger2.module.PresenterModule;
import pe.kth.boilerplate.mvp.presenter.MainPresenter;
import pe.kth.boilerplate.mvp.view.MainActivity;

/**
 * Created by dev on 2017-08-11.
 */

@Singleton
@Component( modules = {AppModule.class , PresenterModule.class})
public interface AppComponent {
    void inject(MainActivity target);
    void inject(MainPresenter target);
}
