package com.example.ts.activitytest1;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class BaseActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Mylog:BaseActivity", getClass().getSimpleName());
        ActivityCollector.addActivity(this);
        Log.d("Mylog:BaseActivity", "Add activity " + getClass().getSimpleName());
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityCollector.removeActivity(this);
        Log.d("Mylog:BaseActivity", "Remove activity " + getClass().getSimpleName());
    }

}
