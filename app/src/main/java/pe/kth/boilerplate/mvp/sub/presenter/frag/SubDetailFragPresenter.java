package pe.kth.boilerplate.mvp.sub.presenter.frag;

import android.util.Log;

import pe.kth.boilerplate.mvp.sub.view.frag.SubDetailFragView;

/**
 * Created by dev on 2017-08-15.
 */

public class SubDetailFragPresenter {
    SubDetailFragView detailFragView;

    public SubDetailFragPresenter(SubDetailFragView detailFragView){
        this.detailFragView = detailFragView;
    }

    public void workFrag() {
        Log.d("KTH" , "present workFrag!");
    }
}
