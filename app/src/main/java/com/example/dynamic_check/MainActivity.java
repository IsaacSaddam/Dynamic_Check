package com.example.dynamic_check;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
EditText ed;
Button bt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Go(View v)
    {
        ed=(EditText)findViewById(R.id.in);
        int i= Integer.parseInt(ed.getText().toString());
        Intent in= new Intent(MainActivity.this,Main2Activity.class);
        in.putExtra("mul",i);
        startActivity(in);
    }
}
