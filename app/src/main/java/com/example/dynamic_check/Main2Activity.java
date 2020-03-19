package com.example.dynamic_check;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.LinearLayout;

public class Main2Activity extends AppCompatActivity {
LinearLayout lay;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity);

int num=0;
        num = getIntent().getExtras().getInt("mul");
        lay=(LinearLayout)findViewById(R.id.lay2);
        for(int i=0;i<num;i++)
        {
            CheckBox cb= new CheckBox(getApplicationContext());
            cb.setText(i+"checkbox");
            lay.addView(cb);
        }
    }
}
