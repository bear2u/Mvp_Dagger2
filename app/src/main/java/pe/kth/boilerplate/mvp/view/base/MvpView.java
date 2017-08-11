package pe.kth.boilerplate.mvp.view.base;

import android.content.Context;

public interface MvpView {

    Context getContext();

    void notConnectNetworking();

}