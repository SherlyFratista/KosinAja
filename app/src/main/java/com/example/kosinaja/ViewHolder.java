package com.example.kosinaja;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ViewHolder implements View.OnClickListener {
    ImageView img;
    TextView nameTxt;
    ItemClickListener itemClickListener;

    public ViewHolder(View view){
        img=view.findViewById(R.id.gambar1);
        nameTxt=view.findViewById(R.id.namaKost);
        view.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        this.itemClickListener.OnItemClicked(v);
    }

    public void setItemClickListener(ItemClickListener ic) {
        this.itemClickListener = ic;
    }
}
