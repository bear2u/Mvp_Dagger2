package pe.kth.boilerplate.mvp.dagger2.component;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.support.AndroidSupportInjectionModule;
import pe.kth.boilerplate.mvp.MyApp;
import pe.kth.boilerplate.mvp.dagger2.module.AppModule;
import pe.kth.boilerplate.mvp.dagger2.module.BuildersModule;
import pe.kth.boilerplate.mvp.main.dagger2.MainModule;

@Component( modules = {
        /* Use AndroidInjectionModule.class if you're not using support library */
        AndroidSupportInjectionModule.class,
        AppModule.class ,
        BuildersModule.class ,
        MainModule.class
})
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance Builder application(MyApp app);
        AppComponent build();
    }

    void inject(MyApp app);
}
