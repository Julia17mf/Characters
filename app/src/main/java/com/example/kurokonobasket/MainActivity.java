package com.example.kurokonobasket;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private Button btnDetails;
    private RecyclerView rvChar;
    private ArrayList<CharacterModel> listChar = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnDetails  = findViewById(R.id.details);
        rvChar      = findViewById(R.id.rv_char_list);
        rvChar.setHasFixedSize(true);
        listChar.addAll(CharacterData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvChar.setLayoutManager(new LinearLayoutManager(this));
        CharacterAdapter characterAdapter = new CharacterAdapter(this, CharacterData.getListData());
//        footballAdapter.setFootballModels(listTeam);
        rvChar.setAdapter(characterAdapter);
    }
}