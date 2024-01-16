package com.example.recyclerviewcitynames;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class CityNamesViewHolder extends RecyclerView.ViewHolder {

    private TextView tvCityNames;

    public CityNamesViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCityNames = itemView.findViewById(R.id.tv_city_names);

    }

    public void onBind(String cityNames) {
        if (cityNames.equals("Bishkek")) {
            Context context = tvCityNames.getContext();
            tvCityNames.setTextColor(ContextCompat.getColor(context, R.color.white));
        }
        tvCityNames.setText(cityNames);
    }
}
