package com.thiagoteixeiraalmeida.mylist.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.thiagoteixeiraalmeida.mylist.R;
import com.thiagoteixeiraalmeida.mylist.model.Search;
import com.thiagoteixeiraalmeida.mylist.model.SearchContent;

import java.util.List;

public class AdapterSearch extends RecyclerView.Adapter<AdapterSearch.MyViewHolder> {

    private SearchContent searchContent;

    public AdapterSearch(SearchContent search) {this.searchContent = search;}

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemSearch = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.search_adapter, parent, false);

        return new MyViewHolder(itemSearch);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        //SearchContent value = searchContent;

        holder.title.setText("Era do gelo");

        /*
        holder.title.setText(value.Search.get(position).Title);
        holder.year.setText(value.Search.get(position).Year);
        holder.type.setText(value.Search.get(position).Type);
        holder.poster.setImageURI(value.Search.get(position).Poster);
         */
    }

    @Override
    public int getItemCount() {
        return 5;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        ImageView poster;
        TextView title;
        TextView year;
        TextView type;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            poster = itemView.findViewById(R.id.imagePoster);
            title = itemView.findViewById(R.id.textTitle);
            year = itemView.findViewById(R.id.textYear);
            type = itemView.findViewById(R.id.textGenre);

        }
    }
}
