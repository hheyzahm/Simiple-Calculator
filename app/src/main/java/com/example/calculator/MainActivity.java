package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.mozilla.javascript.Context;
import org.mozilla.javascript.Script;
import org.mozilla.javascript.Scriptable;

public class MainActivity extends AppCompatActivity {

    Button one,two,three,four,five,six,seven,eight,nine,zero,clear,equal,addition
            ,subtraction,multiplication,divided,backward,percent,dot;
    String first="",answer="";
    TextView result,enter_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one=findViewById(R.id.one);
        two=findViewById(R.id.two);
        three=findViewById(R.id.three);
        four=findViewById(R.id.four);
        five=findViewById(R.id.five);
        six=findViewById(R.id.six);
        seven=findViewById(R.id.seven);
        eight=findViewById(R.id.eight);
        nine=findViewById(R.id.nine);
        zero=findViewById(R.id.zero);
        clear=findViewById(R.id.clear);
        equal=findViewById(R.id.equal);
        addition=findViewById(R.id.addition);
        subtraction=findViewById(R.id.subtraction);
        multiplication=findViewById(R.id.multiplication );
        divided=findViewById(R.id.divide);
        backward=findViewById(R.id.backward);
        dot=findViewById(R.id.dot);
        percent=findViewById(R.id.percent);
        enter_textview=findViewById(R.id.enter_textview);
        result=findViewById(R.id.result);
dot.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        first += 1;
        result.setText(first );
    }
});
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   first += 1;
                   result.setText(first );
            }
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   first += 2;
                   result.setText(first );
            }
        });
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   first += 3;
                   result.setText(first );
            }
        });
        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   first += 4;
                   result.setText(first );
            }
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   first += 4;
                   result.setText(first );
            }
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   first += 6;
                   result.setText(first );
            }
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   first += 7;
                   result.setText(first );
            }
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   first += 8;
                   result.setText(first );
            }
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                   first += 9;
                   result.setText(first );
            }
        });
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                   first += 0;
                   result.setText(first );
              
            }
        });

        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first="";
                result.setText(first );
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Context  rhino= Context.enter();
                rhino.setOptimizationLevel(-1);
                result.setTextColor(getResources().getColor(R.color.black));
               try {
                   if (first.length() != 0) {
                       Scriptable scriptable = rhino.initStandardObjects();
                       enter_textview.setText(first+" :");
                       answer= rhino.evaluateString(scriptable,first,"javascript",1,null).toString();
                   }
               }
               catch (Exception e)
               {
                   answer="Error ";
                   result.setTextColor(getResources().getColor(R.color.ERR));

               }
               result.setText(answer);
            }
        });

        addition.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                if(first.length()!=0)
                    if(first.charAt(first.length()-1)>='0' && first.charAt(first.length()-1)<='9')
                {
                   first+='+';
                    result.setText(first );
                }

            }
        });
        subtraction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(first.length()!=0)
                    if(first.charAt(first.length()-1)>='0' && first.charAt(first.length()-1)<='9')
                {
                    first+='-';
                    result.setText(first );
                }

            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                if(first.length()!=0)
                    if(first.charAt(first.length()-1)>='0' && first.charAt(first.length()-1)<='9')
                {
                    first+='*';
                    result.setText(first );
                }

            }
        });
        divided.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(first.length()!=0)
                if(first.charAt(first.length()-1)>='0' && first.charAt(first.length()-1)<='9')
                {
                    first+='/';
                    result.setText(first );
                }

            }
        });
        backward.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.setTextColor(getResources().getColor(R.color.basic));
                if(first.length()!=0) {
                    first = first.substring(0, first.length() - 1);
                    result.setText(first);
                }
            }
        });



    }
}
