package com.example.retrofitapp;

import java.util.List;

import okhttp3.MultipartBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface SiswaService {
    @GET("senaoquery/GetSlider.php")
    Call<List<Siswa>> listSiswa();

    @Multipart
    @POST("API_MASTER/api_image_upload.php")
    Call<Response> uploadPhoto(@Part MultipartBody.Part photo);
}
