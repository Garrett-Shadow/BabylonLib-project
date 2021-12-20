package com.hfad.babylonlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class GenreActivity extends AppCompatActivity {

    RecyclerView genreRecycler;
    GenreAdapter genreAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genre);

        List<Genre> genreList = new ArrayList<>();
        genreList.add(new Genre(1, "Классическая литература"));
        genreList.add(new Genre(2, "Фантастика"));
        genreList.add(new Genre(3, "Детская литература"));
        genreList.add(new Genre(4, "Учебная литература"));

        setGenreRecycler(genreList);
    }

    private void setGenreRecycler(List<Genre> genreList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        genreRecycler = findViewById(R.id.genreRecycler);
        genreRecycler.setLayoutManager(layoutManager);
        genreAdapter = new GenreAdapter(this, genreList);
        genreRecycler.setAdapter(genreAdapter);
    }
}