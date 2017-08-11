package pe.kth.boilerplate.mvp.main.view;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;
import pe.kth.boilerplate.mvp.R;
import pe.kth.boilerplate.mvp.main.presenter.MainPresenterImpl;
import pe.kth.boilerplate.mvp.main.view.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainView {

    //Binding
    @BindView(R.id.btnAddNumber)
    Button btnAddNumber;

    //Injection
    @Inject
    MainPresenterImpl mainPresenter = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

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
