package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SecondActivity extends AppCompatActivity {
    public EditText textInput3;
    public EditText textInput4;

    public Double temp1, temp2,answer;
    private Button ADD;
    private Button SUB;
    private Button DIV;
    private Button MUL;
    private TextView FinalAns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textInput3 = (EditText) findViewById(R.id.input3);
        textInput4 = (EditText) findViewById(R.id.input4);

        FinalAns = (TextView) findViewById(R.id.displayAns);
        
        ADD = (Button) findViewById(R.id.btn2);
        SUB = (Button) findViewById(R.id.btn3);
        MUL = (Button) findViewById(R.id.btn4);
        DIV = (Button) findViewById(R.id.btn5);


        temp1 = Double.parseDouble(getIntent().getExtras().getString("msg1"));
        textInput3.setText(Double.toString(temp1));

        temp2 = Double.parseDouble(getIntent().getExtras().getString("msg2"));
        textInput4.setText(Double.toString(temp2));


        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = temp1 + temp2;
                FinalAns.setText(Double.toString(answer));
            }
        });

        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = temp1 - temp2;
                FinalAns.setText(Double.toString(answer));
            }
        });

        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = temp1 * temp2;
                FinalAns.setText(Double.toString(answer));
            }
        });

        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer = temp1 / temp2;
                FinalAns.setText(Double.toString(answer));
            }
        });


 }//end of on create



}//end
