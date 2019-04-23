package com.example.ts.activitytest1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ThirdActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("Mylog", this.toString() + ", TaskId=" + getTaskId());   //查看启动方式，默认是Standrad
        setContentView(R.layout.third_layout);

//        Intent intent = new Intent(Intent.ACTION_DIAL);
//        intent.setData(Uri.parse("tel:10086"));
//        startActivity(intent);

        Button button1 = findViewById(R.id.third_button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.putExtra("data_return", "Hello FirstlyActivity from third");
                setResult(RESULT_OK, intent);
                finish();
            }
        });


        Button button2 = findViewById(R.id.third_button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ThirdActivity.this, "Return first activity", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(ThirdActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });
    }

    //接收数据
    public static void actionStart(Context context, String data1, String data2) {
        Intent intent = new Intent(context, ThirdActivity.class);
        intent.putExtra("param1", data1);
        intent.putExtra("param2", data2);
        context.startActivity(intent);
    }

    //按虚拟键位返回，也通知intnent
    @Override
    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("data_return", "Hello firstActivity from third");
        setResult(RESULT_OK, intent);
        finish();
    }
}
