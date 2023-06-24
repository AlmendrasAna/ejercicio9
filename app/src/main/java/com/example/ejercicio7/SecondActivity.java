package com.example.ejercicio7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ImageView imageView =findViewById(R.id.imageView);

        Intent intentget = getIntent();
        int imagen = intentget.getIntExtra("clave",0);
        Log.d("secod",String.valueOf(imagen));
        imageView.setImageResource(imagen);


        initListeners();




    }

    private void initListeners() {


    }
}