package com.example.proje1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Double LoanAmount,LoanTerm,LoanYear;
    EditText LoanAmountt,LoanTermm,LoanYearr;
    TextView sonuc;
    Button calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        calculate= (Button)findViewById(R.id.calculate);
        sonuc = (TextView) findViewById(R.id.sonuc);

        LoanAmountt = (EditText)findViewById(R.id.LoanAmount);
        LoanTermm = (EditText)findViewById(R.id.LoanTerm);
        LoanYearr = (EditText)findViewById(R.id.LoanYear);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoanAmount= Double.parseDouble(LoanAmountt.getText().toString());
                LoanTerm= Double.parseDouble(LoanTermm.getText().toString());
                LoanYear= Double.parseDouble(LoanYearr.getText().toString());




                if(LoanAmount>=1000){
                    if(LoanTerm == 5 || LoanTerm == 10 || LoanTerm == 15 || LoanTerm == 20 || LoanTerm == 25 || LoanTerm == 30){
                        if(LoanYear>=0){

                            Double sum1=LoanAmount;


                            for(int i=0;i<LoanTerm;i++){

                                sum1= sum1+ (sum1 *(LoanYear/100));
                            }

                            sonuc.setText("is "+(sum1/(12*LoanTerm)));





                        }
                        else{
                            sonuc.setText("Intrest pear year must be more than 0");
                        }

                    }
                    else{
                        sonuc.setText("Loan Term must be 5,10,15,20,25,30");
                    }

                }else{
                    sonuc.setText("Loan Amount must be more than 1000");
                }



            }
        });

    }
}
