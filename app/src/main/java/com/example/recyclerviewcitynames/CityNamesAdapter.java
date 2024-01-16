package com.example.recyclerviewcitynames;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CityNamesAdapter extends RecyclerView.Adapter<CityNamesViewHolder> {

    private ArrayList<String> cityNamesList;

    public CityNamesAdapter(ArrayList<String> cityNamesList) {
        this.cityNamesList = cityNamesList;
    }

    @NonNull
    @Override
    public CityNamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CityNamesViewHolder(LayoutInflater.from(parent.getContext()).
                inflate(R.layout.item_city_names, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CityNamesViewHolder holder, int position) {
        holder.onBind(cityNamesList.get(position));
    }

    @Override
    public int getItemCount() {
        return cityNamesList.size();
    }
}
