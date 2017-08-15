package pe.kth.boilerplate.mvp.sub.view.frag;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import javax.inject.Inject;

import dagger.android.support.AndroidSupportInjection;
import pe.kth.boilerplate.mvp.R;
import pe.kth.boilerplate.mvp.sub.presenter.frag.SubDetailFragPresenter;

/**
 * Created by dev on 2017-08-15.
 */

public class SubDetailFrag extends android.support.v4.app.Fragment implements SubDetailFragView{
    @Inject
    SubDetailFragPresenter subDetailFragPresenter;

    public static SubDetailFrag newInstance() {

        Bundle args = new Bundle();
        SubDetailFrag fragment = new SubDetailFrag();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_sub_detail , container , false);
        return view;
    }

    @Override
    public void onAttach(Context context) {
        AndroidSupportInjection.inject(this);
        super.onAttach(context);
    }

    @Override
    public void notConnectNetworking() {

    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        Log.d("KTH" , "ok onActivityCreated !!");
//        subDetailFragPresenter.workFrag();
    }
}
