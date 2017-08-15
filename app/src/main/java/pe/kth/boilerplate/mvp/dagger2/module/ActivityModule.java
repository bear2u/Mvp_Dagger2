package pe.kth.boilerplate.mvp.dagger2.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import pe.kth.boilerplate.mvp.main.MainModule;
import pe.kth.boilerplate.mvp.main.view.MainActivity;
import pe.kth.boilerplate.mvp.sub.SubModule;
import pe.kth.boilerplate.mvp.sub.view.SubActivity;

@Module
public abstract class ActivityModule {
    @ContributesAndroidInjector(modules = MainModule.class )
    public abstract MainActivity contributeMainActivityInjector();

    @ContributesAndroidInjector(modules = SubModule.class )
    public abstract SubActivity contributeSubActivityInjector();
}
