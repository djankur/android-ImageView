package com.example.photo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText eName;
    private EditText ePassword;
    private Button eLogin;


    private String Username = "Admin";
    private  String Password = "1234";

    boolean isValid=false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eName = findViewById(R.id.etName);
        ePassword = findViewById(R.id.etPassword);
        eLogin = findViewById(R.id.btnLogin);

        eLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputName = eName.getText().toString();
                String inputPassword = ePassword.getText().toString();

                if(inputName.isEmpty() || inputPassword.isEmpty())
                {
                    Toast.makeText(MainActivity.this,"please enter username and password",Toast.LENGTH_SHORT).show();
                }else
                {
                    isValid = validate(inputName,inputPassword);
                    if(!isValid){
                        Toast.makeText(MainActivity.this,"Incorrect Credentials entered",Toast.LENGTH_SHORT).show();

                    }else
                    {
                        Toast.makeText(MainActivity.this, "Login Successful !", Toast.LENGTH_SHORT).show();


                        //Adding to goto new activity
                        Intent intent = new Intent(MainActivity.this, im.class);

                        intent.putExtra( "User",inputName);
                        startActivity(intent);
                    }

                }
            }
        });
    }
    private  boolean validate(String name , String password){
        if (name.equals(Username) && password.equals(Password)){
            return true;
        }else return false;
    }
}