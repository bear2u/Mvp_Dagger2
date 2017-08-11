package pe.kth.boilerplate.mvp.dagger2.module;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import pe.kth.boilerplate.mvp.main.dagger2.MainModule;
import pe.kth.boilerplate.mvp.main.view.MainActivity;

@Module
public abstract class BuildersModule {
    @ContributesAndroidInjector(modules = {MainModule.class})
    public abstract MainActivity contributeFeatureActivityInjector();
}