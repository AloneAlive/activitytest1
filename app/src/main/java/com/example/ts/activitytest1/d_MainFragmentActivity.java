package com.example.ts.activitytest1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class d_MainFragmentActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.d_main_fragment);

        Button button = findViewById(R.id.left_button);
        button.setOnClickListener(this);
        replaceFragment(new d_RightFragment());


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.left_button:
                Toast.makeText(d_MainFragmentActivity.this, "Change fragment", Toast.LENGTH_SHORT).show();
                replaceFragment(new d_AnotherTightFragment());
                break;
            default:
                break;
        }
    }

    //FIXME 标记需要修复的地方（问题）
    //TODO 待完成、优化...
    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();   //碎片实例
        FragmentTransaction transaction = fragmentManager.beginTransaction();    //FIXME 开启一个事务
        transaction.replace(R.id.right_fragment, fragment);    //替换碎片
        transaction.addToBackStack(null);   //TODO 返回栈,如此点击返回键会先取消事务
        transaction.commit();   //提交事务
    }
}