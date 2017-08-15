package pe.kth.boilerplate.mvp.sub.presenter;

import javax.inject.Inject;

import pe.kth.boilerplate.mvp.sub.view.SubView;

/**
 * Created by dev on 2017-08-15.
 */

public class SubPresenterImpl implements SubPresenter{
    SubView subView;

    @Inject
    public SubPresenterImpl(SubView subView) {
        this.subView = subView;
    }

    @Override
    public void detachView() {
        this.subView = null;
    }

    @Override
    public void notConnectNetworking() {

    }

    @Override
    public void subWork() {
        subView.doSubWorkDone();
    }
}
