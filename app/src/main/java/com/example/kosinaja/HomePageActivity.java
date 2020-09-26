package com.example.kosinaja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class HomePageActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout carikost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
        carikost=findViewById(R.id.carikost);

        carikost.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.carikost:
                Intent intent = new Intent(HomePageActivity.this,cari_kost.class);
                startActivity(intent);
                break;
        }
    }

    public void forumjualbeli(View view) {
        Intent fjb = new Intent(getApplicationContext(),Activity_Feed.class);
        startActivity(fjb);
    }
}
