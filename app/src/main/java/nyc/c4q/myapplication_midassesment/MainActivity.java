package nyc.c4q.myapplication_midassesment;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import nyc.c4q.myapplication_midassesment.Fragments.ButtonFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButtonFragment mbuttonFragment = new ButtonFragment();
        FragmentManager mfragmentManager = getSupportFragmentManager();
        FragmentTransaction mfragmentTransaction = mfragmentManager.beginTransaction();
        mfragmentTransaction.replace(R.id.main_container, mbuttonFragment);
        mfragmentTransaction.commit();
    }
}
