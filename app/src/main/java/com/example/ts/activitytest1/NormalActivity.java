package com.example.ts.activitytest1;

import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

/*
    使用实现OnClickListener方法
    包含：
    编辑输入框
    图片view（包含改变图片）
    加载进度条
 */
public class NormalActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText editText;

    private ImageView imageView;

    private ProgressBar progressBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.normal_layout);

        Button button1 = findViewById(R.id.CycyleButton1);    //按钮是取消大写
        Button button2 = findViewById(R.id.CycyleButton2);
        Button button3 = findViewById(R.id.CycyleButton3);
        Button button4 = findViewById(R.id.CycyleButton4);

        editText = findViewById(R.id.edit_text);
        imageView = findViewById(R.id.image_view);
        progressBar = findViewById(R.id.progress_bar);

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.CycyleButton1:
                imageView.setImageResource(R.drawable.img1);  //改变图片显示
                String inputText = editText.getText().toString();
                Toast.makeText(NormalActivity.this, inputText, Toast.LENGTH_SHORT).show();
                break;
            case R.id.CycyleButton2:
//                if (progressBar.getVisibility() == View.GONE) {   //判断进度条是否可见，此处点击则切换是否可见
//                    progressBar.setVisibility(View.VISIBLE);
//                } else {
//                    progressBar.setVisibility(View.GONE);
//                }
                Toast.makeText(NormalActivity.this, "Add 10 progress", Toast.LENGTH_SHORT).show();
                int progress = progressBar.getProgress();    //点击增加进度+10
                progress = progress + 10;
                progressBar.setProgress(progress);
                break;
            case R.id.CycyleButton3:
                AlertDialog.Builder dialog = new AlertDialog.Builder(NormalActivity.this);
                dialog.setTitle("This is a Dialog");
                dialog.setMessage("Something important");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });
                dialog.show();
                break;
            case R.id.CycyleButton4:
                ProgressDialog progressDialog = new ProgressDialog(NormalActivity.this);
                progressDialog.setTitle("This is ProgressDialog");
                progressDialog.setCancelable(true);  //弹框可以点击他处取消，如果是false则不能取消
                progressDialog.show();
                break;
            default:
                break;
        }
    }
}
