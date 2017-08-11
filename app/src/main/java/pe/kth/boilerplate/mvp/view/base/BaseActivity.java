package pe.kth.boilerplate.mvp.view.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

/**
 * Created by dev on 2017-08-10.
 */

public class BaseActivity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    protected void showErrorMsg(int msg) {
        Toast.makeText(this , msg , Toast.LENGTH_SHORT).show();
    }
}
