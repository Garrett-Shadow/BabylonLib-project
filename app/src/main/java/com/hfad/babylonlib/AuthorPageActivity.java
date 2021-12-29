package com.hfad.babylonlib;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

public class AuthorPageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_author_page);

        TextView authorName = findViewById(R.id.authorName);
        ImageView authorPortrait = findViewById(R.id.authorPortrait);
        TextView authorBio = findViewById(R.id.authorBio);

        authorName.setText(getIntent().getStringExtra("authorName"));
        authorPortrait.setImageResource(getIntent().getIntExtra("authorPortrait",0));
        authorBio.setText(getIntent().getStringExtra("authorBio"));
        authorBio.setMovementMethod(new ScrollingMovementMethod());
    }
}