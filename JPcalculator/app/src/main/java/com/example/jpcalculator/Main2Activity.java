package com.example.jpcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        Button button2calc=findViewById(R.id.button2calc);
        Intent intent=getIntent();
        String addd = intent.getStringExtra("summm");
        String multii=intent.getStringExtra("multiii");
        TextView textAdd= findViewById(R.id.textAdd);
        TextView textMulti= findViewById(R.id.textMultiple);
        textAdd.setText(addd);
        textMulti.setText(multii);

        button2calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2=new Intent(Main2Activity.this,MainActivity.class);
                startActivity(intent2);

            }
        });

    }
}
