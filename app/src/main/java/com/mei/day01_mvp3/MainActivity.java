package com.mei.day01_mvp3;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView tvxe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

        inittext();
        inittext();
        inittext();
        inittext();
    }

    private void inittext() {
    }

    private void initView() {
        tvxe = (TextView) findViewById(R.id.tvxe);
    }
}
