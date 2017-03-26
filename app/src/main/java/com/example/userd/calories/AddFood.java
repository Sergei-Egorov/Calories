package com.example.userd.calories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AddFood extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add__food);

        final TextView FoodTView = (TextView) findViewById(R.id.FoodTView);

        FoodTView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FoodIntent = new Intent(AddFood.this, Food.class);
                AddFood.this.startActivity(FoodIntent);
            }
        });
    }
}
