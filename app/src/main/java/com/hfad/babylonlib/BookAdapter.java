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

public class BookAdapter extends RecyclerView.Adapter<BookAdapter.BookViewHolder> {

    Context context;
    List<Book> books;

    public BookAdapter(Context context, List<Book> books) {
        this.context = context;
        this.books = books;
    }

    @NonNull
    @Override
    public BookViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View book_item = LayoutInflater.from(context).inflate(R.layout.book_item, parent, false);
        return new BookAdapter.BookViewHolder(book_item);
    }

    @SuppressLint("RecyclerView")
    @Override
    public void onBindViewHolder(@NonNull BookViewHolder bookViewHolder, int id) {
        int imageId=context.getResources().getIdentifier(books.get(id).getCover(), "drawable", context.getPackageName());
        bookViewHolder.bookImage.setImageResource(imageId);
        bookViewHolder.bookTitle.setText(books.get(id).getName());
        bookViewHolder.bookAuthor.setText(books.get(id).getAuthor());

        bookViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, BookPageActivity.class);
                intent.putExtra("bookName", books.get(id).getName());
                intent.putExtra("bookCover", imageId);
                intent.putExtra("bookGenre", books.get(id).getGenre());
                intent.putExtra("bookInfo", books.get(id).getInfo());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return books.size();
    }

    public static final class BookViewHolder extends RecyclerView.ViewHolder{
        ImageView bookImage;
        TextView bookTitle;
        TextView bookAuthor;

        public BookViewHolder(@NonNull View itemView) {
            super(itemView);
            bookImage=itemView.findViewById(R.id.bookImage);
            bookTitle=itemView.findViewById(R.id.bookTitle);
            bookAuthor=itemView.findViewById(R.id.bookAuthor);
        }
    }
}
