package com.example.mattkkim.waterplant;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;

public class WaterPlant extends AppCompatActivity {

    ImageView calendarImg;
    Button waterButton;
    Button homeButton;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_plant);
        calendarImg = (ImageView) findViewById(R.id.calendarImg);
        waterButton = (Button) findViewById(R.id.waterButton);
        homeButton = (Button) findViewById(R.id.homeButton);
        backButton = (Button) findViewById(R.id.backButton);

        waterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WaterPlant.this, WaterLog.class);
                intent.putExtra("USERNAME", "greenBoi99");
                intent.putExtra("DATE","11/11/2018");
                startActivity(intent);
            }
        });

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // go home
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // go back [in this case, work with plant screen?]
            }
        });
    }
}
