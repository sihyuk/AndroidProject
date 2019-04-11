package com.example.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public EditText etusername,etpassword;
    public Button btnlogin;
    public TextView tvsignup,tvforgot;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etusername = findViewById(R.id.tvusername);
        etpassword = findViewById(R.id.tvpassword);
        btnlogin = findViewById(R.id.loginbtn);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(etusername.getText().toString().equals("admin")  &&etpassword.getText().toString().equals("123456")){
                    startActivity(new Intent(MainActivity.this,HomePage.class));

                }
                else{
                    Toast.makeText(MainActivity.this, "Credential Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
