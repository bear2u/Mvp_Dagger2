package pe.kth.boilerplate.mvp.model;

/**
 * Created by dev on 2017-08-10.
 */

public class MainModel {
    private static MainModel instance;
    private MainModel () {}

    private int num = 0;

    public static synchronized MainModel getInstance () {
        if (instance == null)
            instance = new MainModel();
        return instance;
    }

    public int addNum(){
        return ++num;
    }

    public void reset() {
        num = 0;
    }
}
