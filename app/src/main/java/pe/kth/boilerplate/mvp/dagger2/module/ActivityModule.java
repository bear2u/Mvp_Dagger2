package pe.kth.boilerplate.mvp.dagger2.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import pe.kth.boilerplate.mvp.dagger2.scope.ActivityScope;
import pe.kth.boilerplate.mvp.main.MainModule;
import pe.kth.boilerplate.mvp.main.view.MainActivity;
import pe.kth.boilerplate.mvp.sub.SubFragProvideModule;
import pe.kth.boilerplate.mvp.sub.SubActivityModule;
import pe.kth.boilerplate.mvp.sub.view.SubActivity;

@Module
public abstract class ActivityModule {
    @ActivityScope
    @ContributesAndroidInjector(modules = MainModule.class )
    public abstract MainActivity bindMainActivityInjector();

//    @ActivityScope
//    @ContributesAndroidInjector(modules = {DetailActivityModule.class, DetailsFragmentProviderModule.class})
//    abstract DetailActivity bindDeatilActivity();

    @ActivityScope
    @ContributesAndroidInjector(modules = { SubActivityModule.class , SubFragProvideModule.class})
    public abstract SubActivity bindSubActivity();
}
