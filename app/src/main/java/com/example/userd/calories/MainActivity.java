package com.example.userd.calories;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button AddFood = (Button) findViewById(R.id.Baddfood);

        AddFood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent AddFoodIntent = new Intent(MainActivity.this, AddFood.class);
                MainActivity.this.startActivity(AddFoodIntent);
            }
        });

//public void AddFood(View v){
//        Intent AddFoodIntent=new Intent(MainActivity.this,AddFood.class);
//        startActivity(AddFoodIntent);
//
//        }
    }
}