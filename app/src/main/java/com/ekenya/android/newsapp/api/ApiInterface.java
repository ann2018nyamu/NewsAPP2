package com.ekenya.android.newsapp.api;

import com.ekenya.android.newsapp.models.News;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("top-headlines")
    Call<News> getNews();

    @GET("everything?q=apple&from=2021-01-25&to=2021-01-25&sortBy=popularity&apiKey=f50debf4b09d4b76856df1fd93105f56")
    Call<News> getNewsSearch();
}
