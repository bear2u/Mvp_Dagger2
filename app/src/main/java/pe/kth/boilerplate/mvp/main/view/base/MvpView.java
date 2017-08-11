package pe.kth.boilerplate.mvp.main.view.base;

import android.content.Context;

public interface MvpView {

    Context getContext();

    void notConnectNetworking();

}