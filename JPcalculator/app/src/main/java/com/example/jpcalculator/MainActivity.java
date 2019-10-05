package com.example.jpcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.EditTextPreference;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editOne=findViewById(R.id.textOne);
        final EditText editTwo=findViewById(R.id.textTwo);
        final EditText editThree=findViewById(R.id.textThree);
        Button buttoncalc=findViewById(R.id.buttonCalc);

        buttoncalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,Main2Activity.class);
                startActivity(intent);
                String num1 = editOne.getText().toString();
                String num2 = editTwo.getText().toString();
                String num3 = editThree.getText().toString();

                int one=Integer.parseInt(num1);
                int two=Integer.parseInt(num2);
                int three=Integer.parseInt(num3);
                int sum=one+two+three;
                String summ = Integer.toString(sum);
                int multi=one*two*three;
                String multtii=Integer.toString(multi);
                intent.putExtra("summm",summ);
                intent.putExtra("multiii",multtii);
            }
        });
   }
}
