package com.example.aditya21196.hackdtut3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.app.Dialog;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class Request extends AppCompatActivity {

    Button submit;
    Button bBlood;
    EditText etUnits;
    RadioGroup platelets;
    int plateletsChoice;
    String plateChoice;
    Spinner bloodGroupSpinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bBlood = (Button)findViewById(R.id.bBlood);
        bBlood.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(Request.this);
                dialog.setTitle("Request for Blood");
                dialog.setContentView(R.layout.r_blood);
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(dialog.getWindow().getAttributes());
                lp.width=WindowManager.LayoutParams.MATCH_PARENT;
                dialog.show();

                etUnits = (EditText) dialog.findViewById(R.id.etUnits);

                platelets = (RadioGroup) findViewById(R.id.plateletsRadioGroup);
                plateletsChoice = platelets.getCheckedRadioButtonId();
                switch (plateletsChoice) {
                    case R.id.yes:
                        //some code
                        plateChoice="True";
                        break;
                    case R.id.no:
                        //some code
                        plateChoice="False";
                        break;
                }

                submit.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        //update db
                    }
                });

                bloodGroupSpinner = (Spinner) findViewById(R.id.bloodGroupSpinner);


            }
        });

    }
}
