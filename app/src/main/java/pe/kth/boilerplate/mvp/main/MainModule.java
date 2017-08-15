package pe.kth.boilerplate.mvp.main;

import dagger.Module;
import dagger.Provides;
import pe.kth.boilerplate.mvp.dagger2.scope.ActivityScope;
import pe.kth.boilerplate.mvp.main.presenter.MainPresenter;
import pe.kth.boilerplate.mvp.main.presenter.MainPresenterImpl;
import pe.kth.boilerplate.mvp.main.view.MainActivity;
import pe.kth.boilerplate.mvp.main.view.MainView;


@Module
public class MainModule {

//    @Binds
//    abstract MainView provideMainView(MainActivity mainActivity);

    @ActivityScope
    @Provides
    MainView provideMainView(MainActivity mainActivity){
        return mainActivity;
    }

    @ActivityScope
    @Provides
    MainPresenter providesMainPresenter(MainView mainView) {
        return new MainPresenterImpl(mainView);
    }
}
