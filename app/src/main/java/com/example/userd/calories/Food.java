package com.example.userd.calories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);


        final TextView FruitView = (TextView) findViewById(R.id.FruitView);
        final TextView VegetablesView = (TextView) findViewById(R.id.VegetablesView);
        final TextView PastaView = (TextView) findViewById(R.id.PastaView);
        final TextView BreadView = (TextView) findViewById(R.id.BreadView);
        final TextView MeatView = (TextView) findViewById(R.id.MeatView);


        MeatView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent MeatIntent = new Intent(Food.this, MeatActivity.class);
            Food.this.startActivity(MeatIntent);
        }
    });
        FruitView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FruitIntent = new Intent(Food.this, FruitActivity.class);
                Food.this.startActivity(FruitIntent);
            }
        });
        VegetablesView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent VegetablesIntent = new Intent(Food.this, VegetablesActivity.class);
                Food.this.startActivity(VegetablesIntent);
            }
        });
        PastaView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent PastaIntent = new Intent(Food.this, PastaActivity.class);
                Food.this.startActivity(PastaIntent);
            }
        });
        BreadView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BreadIntent = new Intent(Food.this, BreadActivity.class);
                Food.this.startActivity(BreadIntent);
            }
        });
}
}

