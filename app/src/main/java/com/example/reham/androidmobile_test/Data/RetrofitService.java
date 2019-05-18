package com.example.reham.androidmobile_test.Data;

import io.reactivex.Observable;

import retrofit2.http.GET;
import retrofit2.http.Header;

public interface RetrofitService {
    @GET("detail/")
    Observable<GeneralInfo> getUser(@Header("Authorization") String auth);

}
