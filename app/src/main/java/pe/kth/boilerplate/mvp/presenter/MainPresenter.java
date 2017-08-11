package pe.kth.boilerplate.mvp.presenter;

import android.content.Context;

import pe.kth.boilerplate.mvp.MyApp;
import pe.kth.boilerplate.mvp.model.MainModel;
import pe.kth.boilerplate.mvp.presenter.base.Presenter;
import pe.kth.boilerplate.mvp.view.MainView;

/**
 * Created by dev on 2017-08-10.
 */

public class MainPresenter implements Presenter<MainView>{
    MainView mainView;
    // 컨텍스트는 정말 필요할때만 사용하기!!
    private Context ctx;

    @Override
    public void attachView(MainView view) {
        this.mainView = view;
        this.ctx = MyApp.get(mainView.getContext());
    }

    @Override
    public void detachView() {
        MainModel.getInstance().reset();
        this.mainView = null;
    }

    @Override
    public void notConnectNetworking() {
        mainView.notConnectNetworking();
    }

    public void addNumberProc(){
        int number = MainModel.getInstance().addNum();
        mainView.addNumberDone(number);
    }
}
