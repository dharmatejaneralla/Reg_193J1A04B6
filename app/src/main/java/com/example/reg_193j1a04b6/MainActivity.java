package com.example.reg_193j1a04b6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ShareCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity  {

    // Declaring views
EditText name,roll,phone,password,mail;
RadioButton male,female;
Spinner branch;
String gender;
Button submitbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // giving Id`s to views
        name = findViewById(R.id.et_name);
        roll = findViewById(R.id.et_roll);
        phone = findViewById(R.id.et_phone);
        password = findViewById(R.id.et_password);
        mail = findViewById(R.id.et_mail);
        submitbtn = findViewById(R.id.submitbtn);
        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        branch = findViewById(R.id.branch);
       // submit button onclick
        submitbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //getting data from views
              String ename = name.getText().toString();
              String epass = password.getText().toString();
              String eroll = roll.getText().toString();
              String ephone = phone.getText().toString();
              String email = mail.getText().toString();

              // checking the radio buttons
              if (male.isChecked())
                  gender = male.getText().toString();
              else if (female.isChecked())
                  gender = female.getText().toString();

              // getting the data from spinner
              String ebranch = branch.getSelectedItem().toString();
              if(ename != null && epass != null && eroll != null && ephone != null && email != null && gender != null) {
                  Intent i = new Intent(MainActivity.this, MainActivity2.class);
                  // creating bundle and setting data and creating intent
                  Bundle bundle = new Bundle();
                  bundle.putString("name", ename);
                  bundle.putString("branch", ebranch);
                  bundle.putString("gender", gender);
                  bundle.putString("roll", eroll);
                  bundle.putString("pass", epass);
                  bundle.putString("phone", ephone);
                  bundle.putString("mail", email);

                  i.putExtras(bundle);
                  startActivity(i);
              }
            }
        });

    }


}