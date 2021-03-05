package com.example.customsalessquad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login_Screen extends AppCompatActivity {

    TextView textView3,textView5;
    Button btnLogin,btnOtp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login__screen);

        textView3 =findViewById(R.id.textView3);
        textView5=findViewById(R.id.textView5);
        btnLogin=findViewById(R.id.loginbtn);
        btnOtp=findViewById(R.id.btnOtp);



        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Login_Screen.this,SignIn.class);
                startActivity(intent);

            }
        });
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Login_Screen.this, "Reset Link will be sent ur Registered Mail", Toast.LENGTH_SHORT).show();

            }
        });

        btnOtp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(Login_Screen.this, "OTP send to UR registered number", Toast.LENGTH_SHORT).show();

            }
        });
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Login_Screen.this,MainActivity.class);
                startActivity(intent);

            }
        });
    }
}