package com.example.aidar_badirov_hw_3_3;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class SportcarAdapter extends RecyclerView.Adapter<SportcarViewHolder> {
    private ArrayList<String> sportcarList;

    public SportcarAdapter(ArrayList<String> sportcarList) {
        this.sportcarList = sportcarList;
    }

    @NonNull
    @Override
    public SportcarViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new SportcarViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sportcar, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull SportcarViewHolder holder, int position) {
         holder.onBind(sportcarList.get(position));
    }

    @Override
    public int getItemCount() {
        return sportcarList.size();
    }
}
