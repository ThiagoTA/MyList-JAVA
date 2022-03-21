package com.thiagoteixeiraalmeida.mylist.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thiagoteixeiraalmeida.mylist.R;
import com.thiagoteixeiraalmeida.mylist.model.SeriePopular;

import java.util.ArrayList;
import java.util.List;

public class AdapterPopularSeries extends RecyclerView.Adapter<AdapterPopularSeries.MyViewHolder> {

    private List<SeriePopular> listSeriesPopular = new ArrayList<>();

    public AdapterPopularSeries(List<SeriePopular> seriePopular) {this.listSeriesPopular = seriePopular;}

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemPopularSeries = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.popular_adapter, parent, false);

        return new MyViewHolder(itemPopularSeries);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        SeriePopular seriePopular = listSeriesPopular.get(position);

        holder.poster.setImageResource(seriePopular.getPoster());

    }

    @Override
    public int getItemCount() {
        return listSeriesPopular.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView poster;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            poster = itemView.findViewById(R.id.imagePoster);

        }
    }
}
