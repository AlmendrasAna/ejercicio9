package com.example.ejercicio7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
int imagen1 = R.drawable.baseline_catching_pokemon_24;
int imagen2 =R.drawable.baseline_volunteer_activism_24;
int imagen3 =R.drawable.baseline_cruelty_free_24;
int imagen4 =R.drawable.baseline_clean_hands_24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("primerlog",String.valueOf(imagen1));
        initListener();
    }

    private void initListener() {
        ImageButton pokeB = findViewById(R.id.pokeballButton);
        ImageButton hearB = findViewById(R.id.hearButton);
        ImageButton bunnyB = findViewById(R.id.bunnyButton4);
        ImageButton clearB = findViewById(R.id.clearButton);
        ImageButton exitB =  findViewById(R.id.imageButton8);

        pokeB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSecontActivity(imagen1);


            }
        });
        hearB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSecontActivity(imagen2);

            }
        });

        bunnyB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSecontActivity(imagen3);
            }
        });

        clearB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goSecontActivity(imagen4);
            }
        });
        exitB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finishAndRemoveTask();
            }
        });



    }

    private void goSecontActivity(int imagen) {

        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        intent.putExtra("clave",imagen);
        startActivity(intent);
    }
}