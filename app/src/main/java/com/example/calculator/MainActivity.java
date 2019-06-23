package com.example.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

  //  @BindView(R.id.textView)
    EditText textView ;
  //  @BindView(R.id.addition)
    Button add ;
   // @BindView(R.id.one)
    Button one ;
   // @BindView(R.id.subtraction)
    Button sub ;
   // @BindView(R.id.two)
    Button two ,three, four, five, six, seven, eight, nine, zero;
   // @BindView(R.id.equal)
    Button equal ,multiplication,div;
    double sum;
    boolean calculation;
    double value1;
    double value2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
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


        add=findViewById(R.id.addition);
        sub=findViewById(R.id.subtraction);
        div=findViewById(R.id.divition);
        multiplication=findViewById(R.id.multiply);
        equal=findViewById(R.id.equal);
        calculation=false;
        sum=0;
        value1=1;
        textView=findViewById(R.id.textView);
        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculation==true){
                    textView.setText("1");
                    calculation=false;
                    add.setPressed(false);
                    sub.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    div.setPressed(false);

                }else {
                textView.setText(textView.getText()+"1");
//                value1=1;
//                sum=sum+value1;
                calculation=false;
            }}
        });
        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculation==true){
                    textView.setText("2");
                    calculation=false;
                    add.setPressed(false);
                    sub.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    div.setPressed(false);

                }else {
                    textView.setText(textView.getText()+"2");
                    calculation=false;
                }}
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculation==true){
                    textView.setText("3");
                    calculation=false;
                    add.setPressed(false);
                    sub.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    div.setPressed(false);

                }else {
                    textView.setText(textView.getText()+"3");
                    calculation=false;
                }}
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculation==true){
                    textView.setText("4");
                    calculation=false;
                    add.setPressed(false);
                    sub.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    div.setPressed(false);
                }else {
                    textView.setText(textView.getText()+"4");
                    calculation=false;
                }}
        });
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculation==true){
                    textView.setText("5");
                    calculation=false;
                    add.setPressed(false);
                    sub.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    div.setPressed(false);
                }else {
                    textView.setText(textView.getText()+"5");
                    calculation=false;
                }}
        });
        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculation==true){
                    textView.setText("6");
                    calculation=false;
                    add.setPressed(false);
                    sub.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    div.setPressed(false);
                }else {
                    textView.setText(textView.getText()+"6");
                    calculation=false;
                }}
        });
        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculation==true){
                    textView.setText("7");
                    calculation=false;
                    add.setPressed(false);
                    sub.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    div.setPressed(false);
                }else {
                    textView.setText(textView.getText()+"7");
                    calculation=false;
                }}
        });
        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculation==true){
                    textView.setText("8");
                    calculation=false;
                    add.setPressed(false);
                    sub.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    div.setPressed(false);
                }else {
                    textView.setText(textView.getText()+"8");
                    calculation=false;
                }}
        });
        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculation==true){
                    textView.setText("9");
                    calculation=false;
                    add.setPressed(false);
                    sub.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    div.setPressed(false);
                }else {
                    textView.setText(textView.getText()+"9");
                    calculation=false;
                }}
        });
        //zero
        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(calculation==true){
                    textView.setText("0");
                    calculation=false;
                    add.setPressed(false);
                    sub.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    div.setPressed(false);
                }else {
                    textView.setText(textView.getText()+"0");
                    calculation=false;
                }}
        });

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==0||calculation==true){
                    Toast.makeText(MainActivity.this, "enter any number first", Toast.LENGTH_SHORT).show();
                }else {
                    //add.set(true);
                textView.setText(textView.getText()+"+"
                );

                calculation=true;
                }
            }
        });
        add.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(textView.getText().length()==0||calculation==true){
                    Toast.makeText(MainActivity.this, "enter any number first", Toast.LENGTH_SHORT).show();
                    Log.e("mm", "ll");

                    // Log.e("mm", textView.getText()+"");
                }else {
                    add.setPressed(true);
                    calculation = true;

                    sub.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    div.setPressed(false);
                    sum=sum+Double.parseDouble(String.valueOf(textView.getText()));
                    Log.e("sum", String.valueOf(sum));

                }
                return true;
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==0||calculation==true){
                    Toast.makeText(MainActivity.this, "enter any number first", Toast.LENGTH_SHORT).show();
                }else {
//                    textView.setText(textView.getText()+"-");
                    calculation=true;
                }
            }
        });
        sub.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(textView.getText().length()==0||calculation==true){
                    Toast.makeText(MainActivity.this, "enter any number first", Toast.LENGTH_SHORT).show();
                    Log.e("mm", "ll");

                    // Log.e("mm", textView.getText()+"");
                }else {
                    sub.setPressed(true);
                    add.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    div.setPressed(false);
                    sum=sum-Double.parseDouble(String.valueOf(textView.getText()));

                    calculation = true;
                }
                return true;
            }
        });
        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==0||calculation==true){
                    Toast.makeText(MainActivity.this, "enter any number first", Toast.LENGTH_SHORT).show();
                }else {
//                    textView.setText(textView.getText()+"-");
                    calculation=true;
                }
            }
        });
        div.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(textView.getText().length()==0||calculation==true){
                    Toast.makeText(MainActivity.this, "enter any number first", Toast.LENGTH_SHORT).show();
                    Log.e("mm", "ll");

                    // Log.e("mm", textView.getText()+"");
                }else {
                    div.setPressed(true);
                    add.setPressed(false);
                    sub.setPressed(false);
                    equal.setPressed(false);
                    multiplication.setPressed(false);
                    sum=sum/Double.parseDouble(String.valueOf(textView.getText()));

                    calculation = true;
                }
                return true;
            }
        });
        multiplication.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==0||calculation==true){
                    Toast.makeText(MainActivity.this, "enter any number first", Toast.LENGTH_SHORT).show();
                }else {
//                    textView.setText(textView.getText()+"-");
                    calculation=true;
                }
            }
        });
        multiplication.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(textView.getText().length()==0||calculation==true){
                    Toast.makeText(MainActivity.this, "enter any number first", Toast.LENGTH_SHORT).show();
                    Log.e("mm", "ll");

                    // Log.e("mm", textView.getText()+"");
                }else {
                    multiplication.setPressed(true);
                    add.setPressed(false);
                    sub.setPressed(false);
                    equal.setPressed(false);
                    div.setPressed(false);
                    sum=sum*Double.parseDouble(String.valueOf(textView.getText()));

                    calculation = true;
                }
                return true;
            }
        });
        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(textView.getText().length()==0||calculation==true){
                    Toast.makeText(MainActivity.this, "enter any number first", Toast.LENGTH_SHORT).show();
                    Log.e("mm", "ll");

                   // Log.e("mm", textView.getText()+"");
                }else {
                    //double v1=Double.parseDouble(textView.getText()+"");
                   // Double v2= (Double) textView.getText();
                 //   Log.e("mm", String.valueOf(v1));
//                    textView.setText(String.valueOf(v1));
                    textView.setText(String.valueOf(sum));
                calculation=false;}
            }
        });
    }
}
