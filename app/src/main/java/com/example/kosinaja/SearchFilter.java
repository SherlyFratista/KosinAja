package com.example.kosinaja;

import android.widget.Filter;

import java.util.ArrayList;

public class SearchFilter extends Filter {
    ArrayList<Data> filteredList;
    ListViewAdapter adapter;

    public SearchFilter(ArrayList<Data> filteredList, ListViewAdapter adapter) {
        this.filteredList = filteredList;
        this.adapter = adapter;
    }

    @Override
    protected FilterResults performFiltering(CharSequence constraint) {
        FilterResults filterResults = new FilterResults();

        if(constraint != null && constraint.length() >0) {

            // Change To Upper Case
            constraint = constraint.toString().toUpperCase();

            // Holding the data that is filtered

            ArrayList<Data> filteredMovie = new ArrayList<>();

            for (int i = 0; i <filteredList.size(); i++ ) {

                if(filteredList.get(i).getName().toUpperCase().contains(constraint)) {

                    filteredMovie.add(filteredList.get(i));

                }



            }


            filterResults.count = filteredMovie.size();
            filterResults.values = filteredMovie;

        }else {

            filterResults.count = filteredList.size();
            filterResults.values = filteredList;
        }


        return filterResults;

    }



    @Override
    protected void publishResults(CharSequence constraint, FilterResults results) {
        adapter.data = (ArrayList<Data>) results.values;
        adapter.notifyDataSetChanged();
    }
}
