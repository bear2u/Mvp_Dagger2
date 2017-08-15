package pe.kth.boilerplate.mvp.base;

import android.content.Context;

public interface MvpView {

    Context getContext();

    void notConnectNetworking();

}