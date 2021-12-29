package com.hfad.babylonlib;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class AuthorAdapter extends RecyclerView.Adapter<AuthorAdapter.AuthorViewHolder> {

    Context context;
    List<Author> authors;
    private AuthorViewHolder authorViewHolder;
    private int id;

    public AuthorAdapter(Context context, List<Author> authors) {
        this.context = context;
        this.authors = authors;
    }

    @NonNull
    @Override
    public AuthorViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View author_item = LayoutInflater.from(context).inflate(R.layout.author_item, parent, false);
        return new AuthorViewHolder(author_item);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull AuthorViewHolder authorViewHolder, int id) {
        int imageId=context.getResources().getIdentifier(authors.get(id).getPortrait(), "drawable", context.getPackageName());
        authorViewHolder.authorImage.setImageResource(imageId);
        authorViewHolder.authorTitle.setText(authors.get(id).getName());

        authorViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, AuthorPageActivity.class);
                intent.putExtra("authorName", authors.get(id).getName());
                intent.putExtra("authorPortrait", imageId);
                intent.putExtra("authorBio", authors.get(id).getBio());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return authors.size();
    }

    public static final class AuthorViewHolder extends RecyclerView.ViewHolder{

        ImageView authorImage;
        TextView authorTitle;

        public AuthorViewHolder(@NonNull View itemView) {
            super(itemView);
            authorImage=itemView.findViewById(R.id.authorImage);
            authorTitle=itemView.findViewById(R.id.authorTitle);

        }
    }
}
