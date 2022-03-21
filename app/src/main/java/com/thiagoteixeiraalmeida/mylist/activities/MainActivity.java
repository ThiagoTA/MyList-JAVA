package com.thiagoteixeiraalmeida.mylist.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.thiagoteixeiraalmeida.mylist.R;
import com.thiagoteixeiraalmeida.mylist.adapter.AdapterPopularMovies;
import com.thiagoteixeiraalmeida.mylist.adapter.AdapterPopularSeries;
import com.thiagoteixeiraalmeida.mylist.model.MoviePopular;
import com.thiagoteixeiraalmeida.mylist.model.SeriePopular;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPopularMovies, recyclerViewPopularSeries;

    private List<MoviePopular> listMoviePopular = new ArrayList<>();
    private List<SeriePopular> listSeriePopular = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();
        startComponents();

        LinearLayoutManager layoutManagerMovies = new LinearLayoutManager(this);
        layoutManagerMovies.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerViewPopularMovies.setLayoutManager(layoutManagerMovies);

        LinearLayoutManager layoutManagerSeries = new LinearLayoutManager(this);
        layoutManagerSeries.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerViewPopularSeries.setLayoutManager(layoutManagerSeries);

        createMoviesPopular();
        AdapterPopularMovies adapterPopularMovies = new AdapterPopularMovies(listMoviePopular);
        recyclerViewPopularMovies.setAdapter(adapterPopularMovies);

        createSeriesPopular();
        AdapterPopularSeries adapterPopularSeries = new AdapterPopularSeries(listSeriePopular);
        recyclerViewPopularSeries.setAdapter(adapterPopularSeries);

    }

    public void createMoviesPopular() {
        MoviePopular r = new MoviePopular(R.drawable.postermovie1);
        listMoviePopular.add(r);

        r = new MoviePopular(R.drawable.postermovie2);
        listMoviePopular.add(r);

        r = new MoviePopular(R.drawable.postermovie3);
        listMoviePopular.add(r);

        r = new MoviePopular(R.drawable.postermovie4);
        listMoviePopular.add(r);

        r = new MoviePopular(R.drawable.postermovie5);
        listMoviePopular.add(r);

        r = new MoviePopular(R.drawable.postermovie6);
        listMoviePopular.add(r);

        r = new MoviePopular(R.drawable.postermovie7);
        listMoviePopular.add(r);

        r = new MoviePopular(R.drawable.postermovie8);
        listMoviePopular.add(r);

        r = new MoviePopular(R.drawable.postermovie9);
        listMoviePopular.add(r);

    }

    public void createSeriesPopular() {
        SeriePopular s = new SeriePopular(R.drawable.posterseries1);
        listSeriePopular.add(s);

        s = new SeriePopular(R.drawable.posterseries2);
        listSeriePopular.add(s);

        s = new SeriePopular(R.drawable.posterseries3);
        listSeriePopular.add(s);

        s = new SeriePopular(R.drawable.posterseries4);
        listSeriePopular.add(s);

        s = new SeriePopular(R.drawable.posterseries5);
        listSeriePopular.add(s);

        s = new SeriePopular(R.drawable.posterseries6);
        listSeriePopular.add(s);

        s = new SeriePopular(R.drawable.posterseries7);
        listSeriePopular.add(s);

        s = new SeriePopular(R.drawable.posterseries8);
        listSeriePopular.add(s);

        s = new SeriePopular(R.drawable.posterseries9);
        listSeriePopular.add(s);
    }

    private void startComponents() {
        recyclerViewPopularMovies = findViewById(R.id.recyclerViewPopularMovies);
        recyclerViewPopularSeries = findViewById(R.id.recyclerViewPopularSeries);
    }
}