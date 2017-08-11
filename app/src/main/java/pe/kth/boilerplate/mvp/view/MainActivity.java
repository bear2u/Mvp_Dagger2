package pe.kth.boilerplate.mvp.view;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import pe.kth.boilerplate.mvp.R;
import pe.kth.boilerplate.mvp.presenter.MainPresenter;
import pe.kth.boilerplate.mvp.view.base.BaseActivity;

public class MainActivity extends BaseActivity implements MainView {

    MainPresenter mainPresenter = null;
    @BindView(R.id.btnAddNumber)
    Button btnAddNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        initPresenter();
    }

    @OnClick(R.id.btnAddNumber)
    public void addNumber(){
        mainPresenter.addNumberProc();
    }

    private void initPresenter(){
        mainPresenter = new MainPresenter();
        mainPresenter.attachView(this);
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
