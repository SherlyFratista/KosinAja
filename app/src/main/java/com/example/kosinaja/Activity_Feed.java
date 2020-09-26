package com.example.kosinaja;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Comment;

import java.util.ArrayList;

public class Activity_Feed extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerView commentRV;
    CommentAdapter commentAdapter;
    ArrayList<ModelComment> modelCommentArrayList = new ArrayList<>();
    ArrayList<ModelFeed> modelFeedArrayList = new ArrayList<>();
    AdapterFeed adapterFeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed);

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

        adapterFeed = new AdapterFeed(this, modelFeedArrayList);
        recyclerView.setAdapter(adapterFeed);

        populateRecyclerView();
    }

    public void populateRecyclerView() {
        ModelFeed modelFeed = new ModelFeed(1, 11, 4, R.drawable.ic_profile1, R.drawable.xiaomi,
                "user1", "2 hrs", "dijual hp xiaomi second 1jt mulus 90% minat pm");
        modelFeedArrayList.add(modelFeed);
        ModelFeed modelFeed2 = new ModelFeed(2, 11, 4, R.drawable.ic_profile2, R.drawable.springbed,
                "user2", "2 hrs", "[DIJUAL]" +
                "        \nKASUR Single bad" +
                "        \nKondisi 90%" +
                "        \nHarga 500k" +
                "        \nBarang ambil sendiri");
        modelFeedArrayList.add(modelFeed2);
        adapterFeed.notifyDataSetChanged();
    }
}