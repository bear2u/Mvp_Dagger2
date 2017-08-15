package pe.kth.boilerplate.mvp.sub.view;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.support.HasSupportFragmentInjector;
import pe.kth.boilerplate.mvp.R;
import pe.kth.boilerplate.mvp.sub.presenter.SubPresenterImpl;
import pe.kth.boilerplate.mvp.sub.view.frag.SubDetailFrag;

public class SubActivity extends AppCompatActivity implements SubView , HasSupportFragmentInjector{
    @Inject
    DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;

    @Inject
    SubPresenterImpl subPresenter;
    //@BindView(R.id.sub_container)
    Bundle savedInstanceState;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        ButterKnife.bind(this);

        this.savedInstanceState = savedInstanceState;

        subPresenter.subWork();
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void notConnectNetworking() {

    }

    @Override
    public void workSub() {

    }

    @Override
    public void doSubWorkDone() {
        Log.d("KTH" , "doSubWorkDone ok");
        if (savedInstanceState == null)
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.sub_container , SubDetailFrag.newInstance()).commitAllowingStateLoss();
    }

    @Override
    protected void onDestroy() {
        subPresenter.detachView();
        super.onDestroy();
    }

    @Override
    public AndroidInjector<Fragment> supportFragmentInjector() {
        return fragmentDispatchingAndroidInjector;
    }
}
