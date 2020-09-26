package com.example.kosinaja;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestManager;

import java.util.ArrayList;

public class CommentAdapter extends RecyclerView.Adapter<CommentAdapter.MyViewHolder> {

    Context context;
    ArrayList<ModelComment> modelCommentArrayList = new ArrayList<>();
    RequestManager glide;

    public CommentAdapter(Context context, ArrayList<ModelComment> modelCommentArrayList) {
        this.context = context;
        this.modelCommentArrayList = modelCommentArrayList;
        glide = Glide.with(context);
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_comment, parent, false);
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final ModelComment modelComment = modelCommentArrayList.get(position);
        holder.comment_username.setText(modelComment.getName());
        holder.comment_content.setText(modelComment.getName());
        glide.load(modelComment.getPropic()).into(holder.comment_user_img);
    }

    @Override
    public int getItemCount() {
        return modelCommentArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        TextView comment_username, comment_content;
        ImageView comment_user_img;
        public MyViewHolder(View itemView) {
            super(itemView);
            comment_content = itemView.findViewById(R.id.comment_content);
            comment_user_img = itemView.findViewById(R.id.comment_user_img);
            comment_username = itemView.findViewById(R.id.comment_username);
        }
    }
}