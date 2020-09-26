package com.example.kosinaja;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;

import java.util.ArrayList;
import java.util.List;

public class cari_kost extends AppCompatActivity {
    SearchView mySearchView;
    ListView myList;
//    ListViewAdapter adapter;
//
//    ArrayList<String> list;
//    ArrayAdapter<String> adapter;

    ImageButton lokasi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cari_kost);

        mySearchView= (SearchView)findViewById(R.id.searchView);
        myList=(ListView)findViewById(R.id.myList);

        lokasi = findViewById(R.id.lokasi);

//        lokasi.setOnClickListener(new View.OnClickListener() {
//                                      @Override
//                                      public void onClick(View v) {
//
//                                          Intent intent = new Intent(this, TabKost.class);
//                                          startActivity(intent);
//                                      }
//                                  });
//        list= new ArrayList<String>();
//
//        list.add("Bojongsoang");
//        list.add("Sukabirus");

//        adapter= new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,list);
//        myList.setAdapter(adapter);

        final ListViewAdapter adapter = new ListViewAdapter(this, getData());
        myList.setAdapter(adapter);

        mySearchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                adapter.getFilter().filter(s);
                return false;
            }
        });

    }

    private ArrayList<Data> getData() {

        ArrayList<Data> data = new ArrayList<>();
        Data m = new Data(R.drawable.kost, "This is data one");
        data.add(m);

        m = new Data(R.drawable.kost, "This is data two");
        data.add(m);

        return data;
    }

    public void pindah(View view) {
        Intent intent = new Intent(this, TabKost.class);
                                        startActivity(intent);
    }
}
