package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Double input1 = 0.0;
    Double input2 = 0.0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.relative_calculator);

        Button buttonTambah = findViewById(R.id.tambah);
        Button buttonKurang = findViewById(R.id.kurang);
        Button buttonKali = findViewById(R.id.kali);
        Button buttonBagi = findViewById(R.id.bagi);
        final TextView textResult = findViewById(R.id.hasil);
        final EditText editText1 = findViewById(R.id.editText1);
        final EditText editText2 = findViewById(R.id.editText2);



        buttonTambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try{
                    String value1 = editText1.getText().toString();
                    input1 = Double.parseDouble(value1);

                } catch(NumberFormatException e){
                    input1 = 0.0;
                } try{
                    String value2 = editText2.getText().toString();
                    input2 = Double.parseDouble(value2);
                }  catch(NumberFormatException e){
                    input2 = 0.0;
                }

                double jumlah = input1 + input2;
                textResult.setText(Double.toString(jumlah));


            }
        });
        buttonKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String value1 = editText1.getText().toString();
                    input1 = Double.parseDouble(value1);

                } catch(NumberFormatException e){
                    input1 = 0.0;
                } try{
                    String value2 = editText2.getText().toString();
                    input2 = Double.parseDouble(value2);
                }  catch(NumberFormatException e){
                    input2 = 0.0;
                }

                double jumlah = input1 - input2;
                textResult.setText(Double.toString(jumlah));

            }
        });
        buttonKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String value1 = editText1.getText().toString();
                    input1 = Double.parseDouble(value1);

                } catch(NumberFormatException e){
                    input1 = 0.0;
                } try{
                    String value2 = editText2.getText().toString();
                    input2 = Double.parseDouble(value2);
                }  catch(NumberFormatException e){
                    input2 = 0.0;
                }

                double jumlah = input1 * input2;
                textResult.setText(Double.toString(jumlah));

            }
        });
        buttonBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{
                    String value1 = editText1.getText().toString();
                    input1 = Double.parseDouble(value1);

                } catch(NumberFormatException e){
                    input1 = 0.0;
                }

                try {
                    String value2 = editText2.getText().toString();
                    input2 = Double.parseDouble(value2);
                }  catch(NumberFormatException e){
                    input2 = 0.0;
                }

                double jumlah = input1 / input2;
                textResult.setText(Double.toString(jumlah));
            }
        });
    }
}
