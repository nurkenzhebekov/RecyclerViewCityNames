package com.example.recyclerviewcitynames;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MainFragment extends Fragment {

    private RecyclerView rvCityNames;
    private ArrayList<String> cityNamesList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCityNames = requireActivity().findViewById(R.id.rv_city_names);
        loadData();
        CityNamesAdapter adapter = new CityNamesAdapter(cityNamesList);
        rvCityNames.setAdapter(adapter);

    }

    private void loadData() {
        cityNamesList.add("Bishkek");
        cityNamesList.add("New York");
        cityNamesList.add("London");
        cityNamesList.add("Washington");
        cityNamesList.add("Miami");
        cityNamesList.add("Chicago");
        cityNamesList.add("Manchester");
        cityNamesList.add("Moscow");
        cityNamesList.add("Sydney");
        cityNamesList.add("Paris");
        cityNamesList.add("Rome");

    }
}