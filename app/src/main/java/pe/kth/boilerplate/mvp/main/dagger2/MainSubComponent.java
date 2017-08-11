package pe.kth.boilerplate.mvp.main.dagger2;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import pe.kth.boilerplate.mvp.main.view.MainActivity;

/**
 * Created by dev on 2017-08-11.
 */
@Subcomponent()
public interface MainSubComponent extends AndroidInjector<MainActivity>{
    @Subcomponent.Builder
    public abstract class Builder extends AndroidInjector.Builder<MainActivity> {}

}
