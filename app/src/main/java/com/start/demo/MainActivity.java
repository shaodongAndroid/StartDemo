package com.start.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }


    private void initView() {
        findViewById(R.id.btn_onclick).setOnClickListener(this);
    }


    @Override public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_onclick:
                Toast.makeText(this, "Success", Toast.LENGTH_SHORT).show();
                break;

            default:
                Toast.makeText(this, "Fail", Toast.LENGTH_SHORT).show();
                break;
        }
    }

    public void test(){

    }

    public void test2(){

    }
    public void test3(){

    }
    public void test4(){

    }
    public void test5(){

    }
}
