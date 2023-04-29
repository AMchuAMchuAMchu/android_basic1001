package com.inori.a_textview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class A02_TextColorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity02_textcolor);
        TextView tv = findViewById(R.id.tv_color);
        tv.setTextColor(Color.GREEN);
        TextView tv02 = findViewById(R.id.tv_color02);
        tv02.setTextColor(0xddef89cd);
        TextView tv05 = findViewById(R.id.tv_color05);
        tv05.setBackgroundColor(0xFFC01BDD);
    }
}