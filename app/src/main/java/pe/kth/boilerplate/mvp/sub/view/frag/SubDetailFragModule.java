package pe.kth.boilerplate.mvp.sub.view.frag;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import pe.kth.boilerplate.mvp.dagger2.scope.FragmentScope;
import pe.kth.boilerplate.mvp.sub.presenter.frag.SubDetailFragPresenter;

@Module
public class SubDetailFragModule {

    @FragmentScope
    @Provides
    SubDetailFragView provideSubDetailFragView(SubDetailFrag subDetailFrag){
        return subDetailFrag;
    }

    @FragmentScope
    @Provides
    SubDetailFragPresenter SubDetailFragPresenter(SubDetailFragView view){
        return new SubDetailFragPresenter(view);
    }

}
