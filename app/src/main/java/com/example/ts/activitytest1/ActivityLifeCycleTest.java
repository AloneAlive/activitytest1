package com.example.ts.activitytest1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class ActivityLifeCycleTest extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Mylog", "ActivityLifeCycleTest onCreate");
        setContentView(R.layout.activity_life_cycle_test_layout);

        if (savedInstanceState != null) {
            String tempData = savedInstanceState.getString("data_key");
            Log.d("Mylog", tempData);
        }

        Button startNormalActivity = findViewById(R.id.start_normal_activity);
        Button startDislpgActivity = findViewById(R.id.start_dialog_activity);

        //text view
        startNormalActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLifeCycleTest.this, NormalActivity.class);
                startActivity(intent);
            }
        });

        //dialog
        startDislpgActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ActivityLifeCycleTest.this, DislogActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Mylog", "onstart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Mylog", "onResume");
    }

    @Override
    protected void onPause() {

        super.onPause();
        Log.d("Mylog", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Mylog", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Mylog", "onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Mylog", "onRestart");
    }

    //携带一个Bundle类型的参数，用于保存数据
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        String tempData = "Something you just typed";
        outState.putString("data_key", tempData);  //Bundle可以结合intent一起传递数据
    }
}
