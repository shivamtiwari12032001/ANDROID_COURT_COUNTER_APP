package com.example.courtcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int a=0;
    int b=0;

    public void display_a(int a){
        TextView text_a=(TextView) findViewById(R.id.text_a);
        text_a.setText(""+a);
    }
    public void display_b(int b){
        TextView text_b=(TextView) findViewById(R.id.text_b);
        text_b.setText(""+b);
    }
    public void score3_a(View view){
        a=a+3;
        display_a(a);
    }
    public void score2_a(View view){
        a=a+2;
        display_a(a);
    }
    public void score1_a(View view) {
        a = a + 1;
        display_a(a);
    }
    public void score3_b(View view){
        b=b+3;
        display_b(b);
    }
    public void score2_b(View view){
        b=b+2;
        display_b(b);
    }
    public void score1_b(View view){
        b=b+1;
        display_b(b);
    }
    public void reset(View view){
        a=b=0;
        display_a(a);
        display_b(b);
    }
}