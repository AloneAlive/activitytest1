package com.example.ts.activitytest1;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SecondActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_layout);

        //获取First activity发送的intent
        Intent intent = getIntent();
        String data1 = intent.getStringExtra("extra_data");
        int data2 = intent.getIntExtra("integer_data", 0);
        boolean data3 = intent.getBooleanExtra("boolean_data", false);

        Log.d("Mylog: Second activity", "data1=" + data1);
        Log.d("Mylog: Second activity", "data2=" + data2);
        Log.d("Mylog: Second activity", "data3=" + data3);

        Button button1 = findViewById(R.id.second_button);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SecondActivity.this, "Destory all activities", Toast.LENGTH_SHORT).show();
                ActivityCollector.finishAll();
            }
        });
    }
}
