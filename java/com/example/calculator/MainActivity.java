package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
   //object creation for linking
    Button one,two,three,four,five,six,seven,eight,nine,zero,point,plus,minus,divide,equal,multiply,clear;
   EditText edt1,operation;
   TextView txtv;
   boolean add,sub,mul,div;
   float res1,res2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Getting Ids
        edt1=(EditText)findViewById(R.id.edittext);
        txtv=(TextView)findViewById(R.id.textview);
        one=(Button)findViewById(R.id.one);
        two=(Button)findViewById(R.id.two);
        three=(Button)findViewById(R.id.three);
        four=(Button)findViewById(R.id.four);
        five=(Button)findViewById(R.id.five);
        six=(Button)findViewById(R.id.six) ;
        seven=(Button)findViewById(R.id.seven);
        eight=(Button)findViewById(R.id.eight);
        nine=(Button)findViewById(R.id.nine);
        zero=(Button)findViewById(R.id.zero);
        point=(Button)findViewById(R.id.point);
        plus=(Button)findViewById(R.id.plus);
        minus=(Button)findViewById(R.id.minus);
        divide=(Button)findViewById(R.id.divide);
        equal=(Button)findViewById(R.id.equal);
        multiply=(Button)findViewById(R.id.multipl);
        clear=(Button)findViewById(R.id.clear);
        operation=(EditText) findViewById(R.id.showop);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"1");
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"2");
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"3");
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"4");
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"5");
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"6");
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"7");
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"8");
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"9");
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+"0");
            }
        });
        point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(edt1.getText()+".");
            }
        });
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    res1=Float.parseFloat(edt1.getText().toString());
                    add=true;
                    edt1.setText(null);
                }catch (Exception exp){
                    Toast.makeText(MainActivity.this,"Enter Number First", Toast.LENGTH_SHORT).show();
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    res1=Float.parseFloat(edt1.getText().toString());
                    sub=true;
                    edt1.setText(null);
                }catch (Exception exp){
                    Toast.makeText(MainActivity.this,"Enter Number First", Toast.LENGTH_SHORT).show();
                }
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    res1=Float.parseFloat(edt1.getText().toString());
                    mul=true;
                    edt1.setText(null);
                }catch (Exception exp){
                    Toast.makeText(MainActivity.this,"Enter Number First", Toast.LENGTH_SHORT).show();
                }
            }
        });
        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    res1=Float.parseFloat(edt1.getText().toString());
                    div=true;
                    edt1.setText(null);
                }catch (Exception exp){
                    Toast.makeText(MainActivity.this,"Enter Number First", Toast.LENGTH_SHORT).show();
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               try {


                   res2 = Float.parseFloat(edt1.getText().toString());
                   if (add == true) {
                       edt1.setText(res1 + res2 + "");
                       operation.setText("+");
                       add = false;
                   }
                   if (sub == true) {
                       edt1.setText(res1 - res2 + "");
                       operation.setText("-");
                       sub = false;
                   }
                   if (mul == true) {
                       edt1.setText(res1 * res2 + "");
                       operation.setText("*");
                       mul = false;
                   }
                   if (div == true) {
                       edt1.setText(res1 / res2 + "");
                       operation.setText("/");
                       div = false;
                   }
               }catch (Exception e){
                   Toast.makeText(MainActivity.this, "Enter Number First", Toast.LENGTH_SHORT).show();
               }

            }
        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               try {
                   edt1.setText(null);
                   operation.setText(null);
               }catch (Exception e){
                   Toast.makeText(MainActivity.this, "Enter Number First", Toast.LENGTH_SHORT).show();
               }

            }
        });
    }
}
