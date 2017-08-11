package pe.kth.boilerplate.mvp.main.dagger2;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;
import pe.kth.boilerplate.mvp.main.view.MainActivity;


@Module(subcomponents = MainSubComponent.class)
public abstract class MainModule {

    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>
        bindYourActivityInjectorFactory(MainSubComponent.Builder builder);

//    @Binds
//    @IntoMap
//    @ActivityKey(YourActivity.class)
//    abstract AndroidInjector.Factory<? extends Activity>
//    bindYourActivityInjectorFactory(YourActivitySubcomponent.Builder builder);

}
