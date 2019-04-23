package com.example.ts.activitytest1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/*
  主页面,首先運行

 */
public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);   //创建活动
        Log.d("Mylog", this.toString() + ", TaskId=" + getTaskId());   //查看启动方式，默认是Standrad
        setContentView(R.layout.first_layout); //add layout file

        //触碰按钮增加提醒方式
        Button button1 = findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FirstActivity.this, "Send intent to ThirdActivity", Toast.LENGTH_SHORT).show();
                //显示Intent
                //Intent intent1 = new Intent(FirstActivity.this, SecondActivity.class);
                //startActivity(intent1);

                //隐式Intent
                //Intent intent2 = new Intent("com.example.ts.activitytest1.ACTION_START");
                //intent2.addCategory("com.example.ts.activitytest1.MY_CATEGORY");
                //startActivity(intent2);

                //跳转到指定界面
//                Intent intent3 = new Intent(Intent.ACTION_VIEW);
//                intent3.setData(Uri.parse("http://www.baidu.com"));
//                startActivity(intent3);

                //拨打电话
//                Intent intent = new Intent(Intent.ACTION_DIAL);
//                intent.setData(Uri.parse("tel:10086"));
//                startActivity(intent);

                Intent intent = new Intent(FirstActivity.this, ThirdActivity.class);
                startActivityForResult(intent, 1);
            }
        });

        //销毁活动
        Button button2 = findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(FirstActivity.this, "Destory this activity", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

        //发送显示intent数据到second activity
        Button button3 = findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = "Hello Second Activity,This is First Activity!";
                Intent intent = new Intent(FirstActivity.this, SecondActivity.class);
                intent.putExtra("integer_data", 1018);
                intent.putExtra("boolean_data", true);
                intent.putExtra("extra_data", data);
                startActivity(intent);
            }
        });

        Button button4 = findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View view) {
                                           Intent intent4 = new Intent(FirstActivity.this, ActivityLifeCycleTest.class);
                                            startActivity(intent4);
                                       }
                                   }
        );

        //TODO
        //Log.d("Mylog", this.toString());   //查看启动方式，默认是Standrad
        Button button5 = findViewById(R.id.button5);
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(FirstActivity.this, FirstActivity.class);
                startActivity(intent);
            }
        });

        Button button6 = findViewById(R.id.button6);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ThirdActivity.actionStart(FirstActivity.this, "data1", "data2");
            }
        });
    }

    //重写方法，获取thirdActivity返回的data
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode) {
            case 1:
                if (resultCode == RESULT_OK) {
                    String returnData = data.getStringExtra("data_return");
                    Log.d("Mylog1: FirstActivity", "Get return data:" + returnData);
                }
                break;
            default:
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);  //创建菜单
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch(item.getItemId()) {            //点击菜单项发送提醒
            case R.id.add_item:
                Toast.makeText(this, "You clicked Add", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "You clicked remove", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
