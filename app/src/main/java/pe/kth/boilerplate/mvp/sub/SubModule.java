package pe.kth.boilerplate.mvp.sub;

import dagger.Module;
import dagger.Provides;
import pe.kth.boilerplate.mvp.main.presenter.MainPresenter;
import pe.kth.boilerplate.mvp.main.presenter.MainPresenterImpl;
import pe.kth.boilerplate.mvp.main.view.MainActivity;
import pe.kth.boilerplate.mvp.main.view.MainView;
import pe.kth.boilerplate.mvp.sub.presenter.SubPresenter;
import pe.kth.boilerplate.mvp.sub.presenter.SubPresenterImpl;
import pe.kth.boilerplate.mvp.sub.view.SubActivity;
import pe.kth.boilerplate.mvp.sub.view.SubView;


@Module
public class SubModule {

    @Provides
    SubView provideSubView(SubActivity subActivity){
        return subActivity;
    }

    @Provides
    SubPresenter providesSubPresenter(SubView subView) {
        return new SubPresenterImpl(subView);
    }
}
