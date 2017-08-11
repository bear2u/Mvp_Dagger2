package pe.kth.boilerplate.mvp.main.presenter;

import javax.inject.Inject;

import pe.kth.boilerplate.mvp.main.model.MainModel;
import pe.kth.boilerplate.mvp.main.view.MainView;

/**
 * Created by dev on 2017-08-10.
 */

public class MainPresenterImpl implements MainPresenter{
    MainView mainView;

    @Inject
    public MainPresenterImpl(MainView view){
        this.mainView = view;
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
