package com.example.kosinaja;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        imageView = findViewById(R.id.sportsImageDetail);
        textView = findViewById(R.id.titleDetail);

        final int images = getIntent().getIntExtra("Images", 0);
        final String name  =  getIntent().getStringExtra("Name");


        imageView.setImageResource(images);
        textView.setText(name);
    }
}
