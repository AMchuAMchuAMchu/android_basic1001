package com.inori.a_textview;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class A00ctivity_TextView1001 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aactivity_textview1001);
        TextView tv = findViewById(R.id.tv_view);
        tv.setText("你好!我是雪乃..");
    }
}
