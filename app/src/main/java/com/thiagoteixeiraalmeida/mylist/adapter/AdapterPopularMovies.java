package com.thiagoteixeiraalmeida.mylist.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thiagoteixeiraalmeida.mylist.R;
import com.thiagoteixeiraalmeida.mylist.model.MoviePopular;

import java.util.ArrayList;
import java.util.List;

public class AdapterPopularMovies extends RecyclerView.Adapter<AdapterPopularMovies.MyViewHolder> {

    private List<MoviePopular> listMoviePopular = new ArrayList<>();

    public AdapterPopularMovies(List<MoviePopular> moviePopular) {this.listMoviePopular = moviePopular;}

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemPopularMovies = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.popular_adapter, parent, false);

        return new MyViewHolder(itemPopularMovies);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        MoviePopular moviePopular = listMoviePopular.get(position);

        holder.poster.setImageResource(moviePopular.getPoster());
    }

    @Override
    public int getItemCount() {
        return listMoviePopular.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView poster;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            poster = itemView.findViewById(R.id.imagePoster);
        }
    }

}


