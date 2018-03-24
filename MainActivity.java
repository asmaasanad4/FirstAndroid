package com.example.asmaasanad.calclinearlayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText text=(EditText)findViewById(R.id.Edit_text);

        final Button one=(Button)findViewById(R.id.one);
        final Button two=(Button)findViewById(R.id.two);
        final Button three=(Button)findViewById(R.id.three);
        final Button four=(Button)findViewById(R.id.four);
        final Button five=(Button)findViewById(R.id.five);
        final Button six=(Button)findViewById(R.id.six);
        final Button seven=(Button)findViewById(R.id.seven);
        final Button eight=(Button)findViewById(R.id.eight);
        final Button nine=(Button)findViewById(R.id.nine);
        final Button zero =(Button)findViewById(R.id.zero);

        final Button equal=(Button)findViewById(R.id.equal);
        final Button min=(Button)findViewById(R.id.min);
        final Button clear=(Button)findViewById(R.id.c);
        final Button add=(Button)findViewById(R.id.add);
        final Button mul=(Button)findViewById(R.id.mul);
        final Button div=(Button)findViewById(R.id.div);
        final Button sign=(Button)findViewById(R.id.sign);
        final Button dot=(Button)findViewById(R.id.dot);
        final Button percent=(Button)findViewById(R.id.percent);
        final Button clearX=(Button)findViewById(R.id.clearC);

        final double[] num1 = new double[1];
        final double[] num2 = new double[1];
        final double[] dotnum = new double[1];
        final double[] result = new double[1];
        final String[] operator = new String[1];

        one.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String m=text.getText() + (String) one.getText();
                text.setText(m);


            }
        });

        two.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String m=text.getText() + (String) two.getText();
                text.setText(m);


            }
        });
        three.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String m=text.getText() + (String) three.getText();
                text.setText(m);


            }
        });

        four.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String m=text.getText() + (String) four.getText();
                text.setText(m);


            }
        });
        five.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String m=text.getText() + (String) five.getText();
                text.setText(m);


            }
        });

        six.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String m=text.getText() + (String) six.getText();
                text.setText(m);


            }
        });
        seven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String m=text.getText() + (String) seven.getText();
                text.setText(m);


            }
        });

        eight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String m=text.getText() + (String) eight.getText();
                text.setText(m);


            }
        });
        nine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String m=text.getText() + (String) nine.getText();
                text.setText(m);


            }
        });

        zero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String m=text.getText() + (String) zero.getText();
                text.setText(m);


            }
        });


        clear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                text.setText("");
            }
        });

        add.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                num1[0] =Double.parseDouble(String.valueOf(text.getText()));
                text.setText("");
                operator[0] ="+";
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                num1[0] =Double.parseDouble(String.valueOf(text.getText()));
                text.setText("");
                operator[0] ="*";
            }
        });
        div.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                num1[0] =Double.parseDouble(String.valueOf(text.getText()));
                text.setText("");
                operator[0] ="/";
            }
        });
        percent.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                num1[0] =Double.parseDouble(String.valueOf(text.getText()));
                text.setText("");
                operator[0] ="%";
            }
        });
        min.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                num1[0] =Double.parseDouble(String.valueOf(text.getText()));
                text.setText("");
                operator[0] ="-";
            }
        });

      //  clearX.setOnClickListener(new View.OnClickListener() {

        //    @Override
        //    public void onClick(View view) {

         //       String m=String.valueOf(text.getText()) ;
        //        String[] x = new String[20];
        //        for(int i=0;i<m.length()-1;i++){
        //            x[i]= String.valueOf(m.charAt(i));
       //         }
       //         text.setText(""+x);

       //     }
       // });



        equal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                num2[0] =Double.parseDouble(String.valueOf(text.getText()));
                text.setText("");

                if(operator[0]=="+"){
                    result[0] =num1[0]+num2[0];
                    text.setText(""+result[0]);
                }else if(operator[0]=="-"){
                    result[0] =num1[0]-num2[0];
                    text.setText(""+result[0]);
                }else if(operator[0]=="*"){
                    result[0] =num1[0]*num2[0];
                    text.setText(""+result[0]);
                }else if(operator[0]=="/"){
                    result[0] =num1[0]/num2[0];
                    text.setText(""+result[0]);
                }else if(operator[0]=="%"){
                    result[0] =num1[0]%num2[0];
                    text.setText(""+result[0]);
                }
            }
        });


    }
}
