package com.ekenya.android.newsapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputEditText;

public class LoginActivity extends AppCompatActivity {

    private TextInputEditText edt1,edt2;
    private Button vbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        edt1 = findViewById(R.id.username);
        edt2 = findViewById(R.id.password);
        vbutton = findViewById(R.id.btn_Login);
        

        vbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(edt1.getText().toString().equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Input  Username !!! ",Toast.LENGTH_SHORT).show();
                }
                else if(edt2.getText().toString().equalsIgnoreCase("")) {
                    Toast.makeText(getApplicationContext(), "Input Password !!!",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    if (edt1.getText().toString().equals("Admin") &&
                            edt2.getText().toString().equals("8080")){
                        AlertDialog.Builder builder = new AlertDialog.Builder(
                                LoginActivity.this
                        );
                        builder.setIcon(R.drawable.ic_check);
                        builder.setTitle("Login Successful!!!");
                        builder.setMessage("Welcome to Smart News Mobile App...");




                        builder.setPositiveButton("Okay", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {


                                startActivity(new Intent(LoginActivity.this,DashboardActivity.class));



                            }
                        });
                        AlertDialog alertDialog = builder.create();
                        alertDialog.show();
                    }
                    if (! edt1.getText().toString().equals("Admin")) {
                        Toast.makeText(getApplicationContext(), "Invalid  Username !!! ",Toast.LENGTH_SHORT).show();
                    }
                    else if(! edt2.getText().toString().equals("8080")) {
                        Toast.makeText(getApplicationContext(), "Invalid Password !!!",Toast.LENGTH_SHORT).show();
                    }




                }
            }
        });
    }
}