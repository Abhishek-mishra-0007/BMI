package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtResult;
        EditText editweight,edithight,edit_higIninches;
        Button btnCalculate;
        LinearLayout llmain;

        editweight =findViewById(R.id.editweight);
        edithight =findViewById(R.id.edithight);
        edit_higIninches =findViewById(R.id.edit_higIninches);
        btnCalculate =findViewById(R.id.btnCalculate);
        txtResult =findViewById(R.id.txtResult);
        llmain =findViewById(R.id.llmain);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View view) {
               int wt= Integer.parseInt( editweight.getText().toString());
               int ft= Integer.parseInt( edithight.getText().toString());
               int in = Integer.parseInt( edit_higIninches.getText().toString());

               int totalInches = ft*12+in;
               double totalcm =totalInches*2.53;
               double totalmm =totalcm/100;
               double bmi = wt/(totalmm*totalmm);

               if(bmi>25){
                   txtResult.setText("You are Over Weight");
                   llmain.setBackgroundColor(getResources().getColor(R.color.clor));
               } else if (bmi<18) {
                   txtResult.setText("You are Under Weight");
                   llmain.setBackgroundColor(getResources().getColor(R.color.colours));
               }
               else{
                   txtResult.setText("You are Healthy");
                   llmain.setBackgroundColor(getResources().getColor(R.color.color));
               }
            }
        });



    }
}