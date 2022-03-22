package com.thiagoteixeiraalmeida.mylist.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.thiagoteixeiraalmeida.mylist.R;
import com.thiagoteixeiraalmeida.mylist.adapter.AdapterSearch;
import com.thiagoteixeiraalmeida.mylist.model.SearchContent;
import com.thiagoteixeiraalmeida.mylist.service.IApi;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class SearchActivity extends AppCompatActivity {

    private RecyclerView recyclerViewSearch;
    //private EditText editSearch;

    private Retrofit retrofit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        getSupportActionBar().hide();
        startComponents();


        retrofit = new Retrofit.Builder()
                .baseUrl("https://omdbapi.com")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        searchContent();

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerViewSearch.setLayoutManager(layoutManager);
        recyclerViewSearch.setHasFixedSize(true);
        recyclerViewSearch.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));

    }

    private void searchContent() {
        //String valueSearch = editSearch.getText().toString();
        IApi api = retrofit.create(IApi.class);
        Call<SearchContent> call = api.search();

        call.enqueue(new Callback<SearchContent>() {
            @Override
            public void onResponse(Call<SearchContent> call, Response<SearchContent> response) {
                if (response.isSuccessful()) {
                    SearchContent searchContent = response.body();
                    AdapterSearch adapter = new AdapterSearch(searchContent);
                    recyclerViewSearch.setAdapter(adapter);
                }
            }

            @Override
            public void onFailure(Call<SearchContent> call, Throwable t) {

            }
        });
    }

    private void startComponents() {
        recyclerViewSearch = findViewById(R.id.recyclerViewSearch);
        //editSearch = findViewById(R.id.editSearch);
    }
}