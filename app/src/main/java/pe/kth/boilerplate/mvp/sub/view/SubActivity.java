package pe.kth.boilerplate.mvp.sub.view;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import dagger.android.AndroidInjection;
import pe.kth.boilerplate.mvp.R;
import pe.kth.boilerplate.mvp.sub.presenter.SubPresenter;
import pe.kth.boilerplate.mvp.sub.presenter.SubPresenterImpl;

public class SubActivity extends AppCompatActivity implements SubView{
    @Inject
    SubPresenterImpl subPresenter;
    @BindView(R.id.subText)
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);
        ButterKnife.bind(this);

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
        tv.setText("ok dagger2");
    }
}
