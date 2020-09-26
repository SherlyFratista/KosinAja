package com.example.kosinaja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    EditText namereg, emaillog, passwordlog, cpassreg;
    Button btnRegist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        namereg = findViewById(R.id.namereg);
        emaillog = findViewById(R.id.emaillog);
        passwordlog = findViewById(R.id.passwordlog);
        cpassreg = findViewById(R.id.cpassreg);

        btnRegist = findViewById(R.id.btnregist);
        btnRegist.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String name, email, password, cpass;

                name = namereg.getText().toString();
                email = emaillog.getText().toString();
                password = passwordlog.getText().toString();
                cpass = cpassreg.getText().toString();


                if (name.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Name Required", Toast.LENGTH_SHORT).show();
                } else if (email.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Email Required", Toast.LENGTH_SHORT).show();
                } else if (password.equals("")){
                    Toast.makeText(RegisterActivity.this, "Password Required", Toast.LENGTH_SHORT).show();
                } else if (cpass.equals("")) {
                    Toast.makeText(RegisterActivity.this, "Confirm Password Required", Toast.LENGTH_SHORT).show();
                }else if (cpass.equals("password")){
                    Toast.makeText(RegisterActivity.this, "Password MitMach", Toast.LENGTH_SHORT).show();
                } else {
                    //Authentication
                }
            }
        });
        btnRegist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent she = new Intent(RegisterActivity.this,MainActivity.class);
                startActivity(she);
                finish();
            }
        });
    }
}
