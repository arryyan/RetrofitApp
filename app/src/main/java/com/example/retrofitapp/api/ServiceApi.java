package com.example.retrofitapp.api;


import java.util.HashMap;

import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ServiceApi {

    String BASE_URL = "http://192.168.43.218/PHPApi/";

    @Multipart
    @POST("index.php")
    Call<HashMap<String, String>> convertImage(@Part("image\"; filename=\"image.png\" ") RequestBody file,
                               @Part("text") RequestBody name);

}
