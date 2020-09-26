package com.example.kosinaja;


import android.content.Context;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText emaillog, passwordlog;
    Button btnLogin;
    TextView btnRegister;

    private Context mContext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emaillog = findViewById(R.id.emaillog);
        passwordlog = findViewById(R.id.passwordlog);

        btnLogin = findViewById(R.id.btnLogin);
        btnRegister = findViewById(R.id.btnRegister);


        btnLogin.setOnClickListener(this);
        btnRegister.setOnClickListener(this);

    }


    @Override

    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnLogin:
                Intent home = new Intent(MainActivity.this,HomePageActivity.class);
                startActivity(home);
                finish();
                break;
            case R.id.btnRegister:
                Intent she = new Intent(MainActivity.this,RegisterActivity.class);
                startActivity(she);
                finish();
                break;
            default:
        }
    }
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    //idel bikin ini doang
    public void forumjualbeli(View view) {
        Intent fjb = new Intent(getApplicationContext(),Activity_Feed.class);
        startActivity(fjb);
    }

}