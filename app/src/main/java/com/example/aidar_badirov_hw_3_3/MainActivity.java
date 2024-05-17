package com.example.aidar_badirov_hw_3_3;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private ArrayList<String> sportcarList = new ArrayList<>();
private RecyclerView rvSportcar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvSportcar = findViewById(R.id.rv_sportcar);
        sportcarList.add("Porsche");
        sportcarList.add("Ferrari");
        sportcarList.add("Bugatti");
        sportcarList.add("Mazzerati");
        sportcarList.add("Pagani");
        sportcarList.add("Chevrolet");
        sportcarList.add("Toyota Supra");
        sportcarList.add("BMW Z4");
        sportcarList.add("Audi R8");
        sportcarList.add("Lamborghini");
        sportcarList.add("McLaren");
        sportcarList.add("Subaru");

        SportcarAdapter adapter = new SportcarAdapter(sportcarList);
        rvSportcar.setAdapter(adapter);
    }
}