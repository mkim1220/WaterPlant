package com.example.mattkkim.waterplant;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WaterLog extends AppCompatActivity {

    Button homeButton;
    Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_water_log);
        homeButton = (Button) findViewById(R.id.homeButton);
        backButton = (Button) findViewById(R.id.backButton);

        String user = this.getIntent().getStringExtra("USERNAME");
        String date = this.getIntent().getStringExtra("DATE");
        String htmlify = "<b>"+date+": "+user+"</b>";

        TextView tv = (TextView) findViewById(R.id.records);
        tv.append(Html.fromHtml(htmlify));

        homeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // go home
            }
        });

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WaterLog.this, WaterPlant.class);
                startActivity(intent);
            }
        });
    }
}
