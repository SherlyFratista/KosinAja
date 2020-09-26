package com.example.kosinaja;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

import java.util.ArrayList;
import java.util.List;

public class ListViewAdapter extends BaseAdapter implements Filterable {
    Context context;
    LayoutInflater inflater;
    ArrayList<Data> data;

    SearchFilter filter;
    ArrayList<Data> filteredlist;

    public ListViewAdapter(Context context, ArrayList<Data> data){
        this.context=context;
        this.data=data;
        this.filteredlist=data;
    }


    @Override
    public int getCount() {
        return data.size();
    }

    @Override
    public Object getItem(int position) {
        return data.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        if (inflater == null) {

            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        }

        if (convertView == null) {

            convertView = inflater.inflate(R.layout.activity_list_view_items, null);

        }
        final ViewHolder myViewHolder = new ViewHolder(convertView);
        myViewHolder.img.setImageResource(data.get(position).getImage());
        myViewHolder.nameTxt.setText(data.get(position).getName());

        myViewHolder.setItemClickListener(new ItemClickListener() {
            @Override
            public void OnItemClicked(View view) {

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("Images", data.get(position).getImage());
                intent.putExtra("Name", data.get(position).getName());
                context.startActivity(intent);
            }
        });
        return convertView;
    }
    @Override
    public Filter getFilter(){
        if(filter == null) {
            filter = new SearchFilter(filteredlist, this);
        }
        return filter;
    }
}
