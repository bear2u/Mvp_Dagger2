package pe.kth.boilerplate.mvp.dagger2.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import pe.kth.boilerplate.mvp.main.MainModule;
import pe.kth.boilerplate.mvp.main.view.MainActivity;

/**
 * Created by dev on 2017-08-15.
 */
@Module
public abstract class ActivityModule {
    @ContributesAndroidInjector(modules = MainModule.class )
    public abstract MainActivity contributeMainActivityInjector();
}
