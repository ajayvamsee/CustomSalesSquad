package com.example.customsalessquad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SignIn extends AppCompatActivity {
    Spinner spinner1;
    Spinner spinner2;
    Spinner spinner3;
    Spinner spinner4;
    TextView tv12;
    Button button4;
    CheckBox checkBox;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);


        spinner1=(Spinner) findViewById(R.id.spinner1);
        spinner2=(Spinner) findViewById(R.id.spinner2);
        spinner3=(Spinner) findViewById(R.id.spinner3);
        spinner4=(Spinner) findViewById(R.id.spinner4);

        tv12=findViewById(R.id.tv12);

        button4=findViewById(R.id.button4);

        checkBox=findViewById(R.id.checkBox);


        tv12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(SignIn.this,Login_Screen.class);
                startActivity(intent);
            }
        });


        String[] listed1={"Select","Apparel& shoping","Banking,Biotechnolgy","Communication","construction","consulting",
                "Education","Eletronics","Entertainment","Energy","Engineering","Finance","Food& Bevarge","Goverenmnet"};

        ArrayAdapter<String> adapter1=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,listed1 );

        spinner1.setAdapter(adapter1);




        String[] listed2={"Select","0-1 Employee","2-10 Employees","11-50 Employees","51-250 Employees",">250 Employees"};

        ArrayAdapter<String> adapter2=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,listed2 );

        spinner2.setAdapter(adapter2);




        String[] listed3={"Select","0-10 Lakhs","10 Lakhs-1 Crore","1 -50 Crores","50cr-200 crores","200+ Crores"};

        ArrayAdapter<String> adapter3=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,listed3 );

        spinner3.setAdapter(adapter3);



        String[] listed4={"Select","Analyst","C-Level","consulting","Developer","Employee",
                "Manager","student","VP / Director"};

        ArrayAdapter<String> adapter4=new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item,listed4 );

        spinner4.setAdapter(adapter4);
      /*  if(checkBox.isEnabled()){
            button4.isEnabled();
        }
        else{
            Toast.makeText(this, "Please allow the chech Box", Toast.LENGTH_SHORT).show();
        }*/


        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(SignIn.this,Login_Screen.class);
                startActivity(intent);
            }
        });
    }


}