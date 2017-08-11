package pe.kth.boilerplate.mvp.view;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pe.kth.boilerplate.mvp.MyApp;
import pe.kth.boilerplate.mvp.R;
import pe.kth.boilerplate.mvp.presenter.MainPresenter;
import pe.kth.boilerplate.mvp.view.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainView {

    //Binding
    @BindView(R.id.btnAddNumber)
    Button btnAddNumber;

    //Injection
    @Inject
    MainPresenter mainPresenter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((MyApp) getApplication()).getAppComponent().inject(this);

        ButterKnife.bind(this);

        mainPresenter.attachView(this);

    }

    @OnClick(R.id.btnAddNumber)
    public void addNumber(){
        mainPresenter.addNumberProc();
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void notConnectNetworking() {
        showErrorMsg( R.string.not_connect_internet );
    }

    @Override
    protected void onDestroy() {
        mainPresenter.detachView();
        super.onDestroy();
    }

    @Override
    public void addNumberDone(int number) {
        btnAddNumber.setText( number + "");
    }
}
