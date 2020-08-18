package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

  public EditText textInput1;
  public EditText textInput2;

  public String input1, input2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        Button ok = findViewById(R.id.btn1);
        textInput1 = (EditText) findViewById(R.id.input1);
        textInput2 = (EditText) findViewById(R.id.input2);
        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Context context = getApplicationContext();
                CharSequence message = "You clicked the OK button";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();
                toast.setGravity(Gravity.TOP | Gravity.LEFT, 0, 0);


                Intent send = new Intent(FirstActivity.this ,SecondActivity.class);
                input1 = textInput1.getText().toString();
                input2 = textInput2.getText().toString();
                send.putExtra("msg1",input1);
                send.putExtra("msg2",input2);

                startActivity(send);
//                finish();

            }
        });
    }//end of on create

}//end of main method
