package com.inori.android_basic1001;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView viewById = findViewById(R.id.tv);
        viewById.setText("你好!世界!!我是Android...雪之下雪乃,亚丝娜,诗乃,椎名真白," +
                "楪祈,校条祭,赤瞳,渡边早季,斯奎拉");

        Button button = findViewById(R.id.button02);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this,MainActivity02.class);
                startActivity(intent);
            }
        });
    }
}