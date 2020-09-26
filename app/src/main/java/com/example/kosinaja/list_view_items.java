package com.example.kosinaja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class list_view_items extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view_items);
    }

    public void detailKost(View view) {
//        Intent intent = new Intent(this, DetailActivity.class);
//        intent.putExtra("Images", data.get(position).getImage());
//        intent.putExtra("Name", data.get(position).getName());
//        startActivity(intent);
    }
}
