package com.example.aidar_badirov_hw_3_3;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SportcarViewHolder extends RecyclerView.ViewHolder {
    private TextView tvSportcar;
    public SportcarViewHolder(@NonNull View itemView) {
        super(itemView);
        tvSportcar = itemView.findViewById(R.id.tv_sportcar);

    }

    public void onBind(String sportcarName){
        tvSportcar.setText(sportcarName);
    }
}
