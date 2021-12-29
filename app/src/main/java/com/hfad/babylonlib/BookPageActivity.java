package com.hfad.babylonlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class BookPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_page);

        TextView bookName = findViewById(R.id.bookName);
        ImageView bookCover = findViewById(R.id.bookCover);
        TextView bookGenre = findViewById(R.id.bookGenre);
        TextView bookInfo = findViewById(R.id.bookInfo);

        bookName.setText(getIntent().getStringExtra("bookName"));
        bookCover.setImageResource(getIntent().getIntExtra("bookCover",0));
        bookGenre.setText(getIntent().getStringExtra("bookGenre"));
        bookInfo.setText(getIntent().getStringExtra("bookInfo"));
    }
}