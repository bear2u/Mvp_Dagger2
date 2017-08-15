package pe.kth.boilerplate.mvp.dagger2.component;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import pe.kth.boilerplate.mvp.MyApp;
import pe.kth.boilerplate.mvp.dagger2.module.ActivityModule;
import pe.kth.boilerplate.mvp.dagger2.module.AppModule;

@Component( modules = {
        /* Use AndroidInjectionModule.class if you're not using support library */
        AppModule.class ,
        ActivityModule.class,
        AndroidInjectionModule.class
})
public interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance Builder application(MyApp app);
        AppComponent build();
    }

    void inject(MyApp app);
}
