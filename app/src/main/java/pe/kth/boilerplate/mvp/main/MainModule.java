package pe.kth.boilerplate.mvp.main;

import dagger.Binds;
import dagger.Module;
import pe.kth.boilerplate.mvp.main.view.MainActivity;
import pe.kth.boilerplate.mvp.main.view.MainView;


@Module
public abstract class MainModule {

    @Binds
    abstract MainView provideMainView(MainActivity mainActivity);

}
