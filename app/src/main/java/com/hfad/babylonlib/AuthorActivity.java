package com.hfad.babylonlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class AuthorActivity extends AppCompatActivity {

    RecyclerView authorRecycler;
    AuthorAdapter authorAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author);

        List<Author> authorList = new ArrayList<>();
        authorList.add(new Author(1, "Александр Сергеевич Пушкин", "pushkin"));
        authorList.add(new Author(2, "Агния Львовна Барто", "barto"));
        authorList.add(new Author(3, "Лев Николаевич Толстой", "tolstoy"));
        authorList.add(new Author(4, "Александр Романович Беляев", "belyaev"));
        authorList.add(new Author(4, "Федор Михайлович Достоевский", "dostoevsky"));
        authorList.add(new Author(4, "Александр Васильевич Перышкин", "peryshkin"));

        setAuthorRecycler(authorList);
    }

    private void setAuthorRecycler(List<Author> authorList) {
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        authorRecycler = findViewById(R.id.authorRecycler);
        authorRecycler.setLayoutManager(layoutManager);
        authorAdapter = new AuthorAdapter(this, authorList);
        authorRecycler.setAdapter(authorAdapter);
    }
}