package pe.kth.boilerplate.mvp.presenter.base;

public interface Presenter<T> {

    void attachView(T view);

    void detachView();

    void notConnectNetworking();

}