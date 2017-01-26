package com.example.rahat.simple_calculator;

import android.support.v4.text.TextUtilsCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class calculator_activity extends AppCompatActivity {
    EditText etxtNum1,etxtNum2;
    TextView txtResult;
    Button btnPlus,btnSub,btnMulti,btnDiv;
    public  float num1=0,num2=0,result=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator_activity);
        etxtNum1=(EditText)findViewById(R.id.etxtNum1);
        etxtNum2=(EditText)findViewById(R.id.etxtNum2);

        btnPlus=(Button)findViewById(R.id.btnPlus);
        btnSub=(Button)findViewById(R.id.btnSub);
        btnMulti=(Button)findViewById(R.id.btnMulti);
        btnDiv=(Button)findViewById(R.id.btnDiv);
        txtResult=(TextView)findViewById(R.id.txtResult);
        btnPlus.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numberInput();
                result = num1+num2;
                txtResult.setText(num1 +" + "+ num2+"  = "+result);
            }

        });
        btnSub.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numberInput();
                result = num1-num2;
                txtResult.setText(num1 +" - "+ num2+"  = "+result);
            }

        });
        btnMulti.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numberInput();
                result = num1*num2;
                txtResult.setText(num1 +" * "+ num2+"  = "+result);
            }

        });
        btnDiv.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                numberInput();
                result = num1/num2;
                txtResult.setText(num1 +" / "+ num2+"  = "+result);
            }

        });

    }

    public void numberInput(){
        //checking number field empty or not
        if(TextUtils.isEmpty(etxtNum1.getText().toString())|| TextUtils.isEmpty(etxtNum2.getText().toString())){
            return;
        }
        else {
            //parse string value to float values
            num1=Float.parseFloat(etxtNum1.getText().toString());
            num2=Float.parseFloat(etxtNum2.getText().toString());

        }

    }
}
