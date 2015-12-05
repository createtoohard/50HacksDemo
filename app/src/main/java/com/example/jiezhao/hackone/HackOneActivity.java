package com.example.jiezhao.hackone;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class HackOneActivity extends AppCompatActivity {

    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hack_one);
        mButton =   (Button) findViewById(R.id.btn);

    }

}
