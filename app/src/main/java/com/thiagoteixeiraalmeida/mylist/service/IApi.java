package com.thiagoteixeiraalmeida.mylist.service;

import com.thiagoteixeiraalmeida.mylist.model.Search;
import com.thiagoteixeiraalmeida.mylist.model.SearchContent;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IApi {

    @GET("/?s=spider&apikey=8e7adf81")
    //Call<List<SearchContent>> search(@Path("search") String search);
    Call<SearchContent> search();
}
