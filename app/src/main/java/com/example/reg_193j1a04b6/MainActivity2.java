package com.example.reg_193j1a04b6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
TextView tv_name,tv_roll,tv_phone,tv_mail,tv_pass,tv_gender,tv_branch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();
        if (bundle !=null)
        {
            //getting bundle from intent
            String name = bundle.getString("name");
            String roll = bundle.getString("roll");
            String phone = bundle.getString("phone");
            String mail = bundle.getString("mail");
            String pass = bundle.getString("pass");
            String gender = bundle.getString("gender");
            String branch = bundle.getString("branch");

            //adding views to views
            tv_branch = findViewById(R.id.tv_branch);
            tv_gender = findViewById(R.id.tv_gender);
            tv_mail = findViewById(R.id.tv_mail);
            tv_name = findViewById(R.id.tv_name);
            tv_phone = findViewById(R.id.tv_phone);
            tv_mail = findViewById(R.id.tv_mail);
            tv_pass = findViewById(R.id.tv_password);

            //setting text to views
            tv_name.setText(name);
            tv_phone.setText(phone);
            tv_mail.setText(mail);
            tv_roll.setText(roll);
            tv_pass.setText(pass);
            tv_gender.setText(gender);
            tv_branch.setText(branch);
        }
    }
}