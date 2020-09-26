package com.example.kosinaja;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class PostDetailActivity extends AppCompatActivity {

    RecyclerView commentRV;
    CommentAdapter commentAdapter;
    ArrayList<ModelComment> modelCommentArrayList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_post_detail);

        TextView tv_name = findViewById(R.id.tv_name);
        TextView tv_status = findViewById(R.id.tv_status);
        ImageView postpic = findViewById(R.id.imgView_postPic);
        ImageView avatar = findViewById(R.id.imgView_proPic);

        tv_name.setText(getIntent().getStringExtra("username"));
        tv_status.setText(getIntent().getStringExtra("Status"));
        Glide.with(this).load(getIntent()
                        .getIntExtra("postpic",0))
                .into(postpic);
        Glide.with(this)
                .load(getIntent()
                        .getIntExtra("avatar",0))
                .into(avatar);

        commentRV = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        commentRV.setLayoutManager(layoutManager);
        commentAdapter = new CommentAdapter(this, modelCommentArrayList);
        commentRV.setAdapter(commentAdapter);
        RecyclerViewComment();
    }



    private void RecyclerViewComment() {
        ModelComment modelComment1 = new ModelComment(R.drawable.ic_profile2, "kangminhee", "mau dong");
        modelCommentArrayList.add(modelComment1);
        ModelComment modelComment2 = new ModelComment(R.drawable.ic_profile1, "kimwooseok", "ngga boleh");
        modelCommentArrayList.add(modelComment2);
        commentAdapter.notifyDataSetChanged();
    }

    // comment
//    public AdapterFeed.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        /*
//        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_comment, parent, false);
//        AdapterFeed.MyViewHolder viewHolder = new AdapterFeed.MyViewHolder(view);
//        return viewHolder;
//        */
//        View row = LayoutInflater.from(mContext).inflate(R.layout.row_comment,parent,false);
//        return new AdapterFeed.MyViewHolder(row);
//    }

}
