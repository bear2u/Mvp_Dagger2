package pe.kth.boilerplate.mvp.sub;


import dagger.Module;
import dagger.android.ContributesAndroidInjector;
import pe.kth.boilerplate.mvp.dagger2.scope.FragmentScope;
import pe.kth.boilerplate.mvp.sub.view.frag.SubDetailFragModule;
import pe.kth.boilerplate.mvp.sub.view.frag.SubDetailFrag;

@Module
public abstract class SubFragProvideModule {
    @FragmentScope
    @ContributesAndroidInjector(modules = SubDetailFragModule.class)
    abstract SubDetailFrag bindSubDetailFrag();
}
