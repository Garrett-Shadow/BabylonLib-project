package com.hfad.babylonlib;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class GenreAdapter extends RecyclerView.Adapter<GenreAdapter.GenreViewHolder> {

    Context context;
    List<Genre> genres;

    public GenreAdapter(Context context, List<Genre> genres) {
        this.context = context;
        this.genres = genres;
    }

    @NonNull
    @Override
    public GenreViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View genre_item = LayoutInflater.from(context).inflate(R.layout.genre_item, parent, false);
        return new GenreViewHolder(genre_item);
    }

    @Override
    public void onBindViewHolder(@NonNull GenreAdapter.GenreViewHolder genreViewHolder, int id) {
        genreViewHolder.genreTitle.setText(genres.get(id).getName());
    }

    @Override
    public int getItemCount() {
        return genres.size();
    }

    public static final class GenreViewHolder extends RecyclerView.ViewHolder{

        TextView genreTitle;

        public GenreViewHolder(@NonNull View itemView) {
            super(itemView);
            genreTitle = itemView.findViewById(R.id.genreTitle);
        }
    }
}
