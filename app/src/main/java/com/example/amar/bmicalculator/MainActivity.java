package com.example.amar.bmicalculator;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }


    public void mcalc(View view) {

        TextView tv1=(TextView)findViewById(R.id.textView2);
        EditText bw=(EditText)findViewById(R.id.weightget);
        EditText  bh=(EditText)findViewById(R.id.heightget);

        double  dbw=Double.parseDouble(bw.getText().toString());
        double  dbh=Double.parseDouble(bh.getText().toString());

        double resultget = dbw /(dbh * dbh);

        tv1.setText(Double.toString(resultget));




    }
}
