package pe.kth.boilerplate.mvp;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import pe.kth.boilerplate.mvp.dagger2.component.DaggerAppComponent;

/**
 * Created by dev on 2017-08-10.
 */

public class MyApp extends Application implements HasActivityInjector{
    @Inject
    DispatchingAndroidInjector<Activity> androidInjector;

    private static volatile MyApp instance = null;
    private static volatile Activity currentActivity = null;

    public static MyApp get(Context context){
        return (MyApp) context.getApplicationContext();
    }

    public static Activity getCurrentActivity() {
        return currentActivity;
    }

    public static void setCurrentActivity(Activity currentActivity) {
        MyApp.currentActivity = currentActivity;
    }
    @Override
    public Context getApplicationContext() {
        return super.getApplicationContext();
    }

    public static MyApp getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();

        initDagger2();
    }

    private void initDagger2(){
        DaggerAppComponent
                .builder()
                .application(this)
                .build()
                .inject(this);
    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return androidInjector;
    }
}
