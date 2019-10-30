package com.example.retrofitapp;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Siswa {
    @SerializedName("nis")
    @Expose
    private int Nis;
    @SerializedName("nama")
    @Expose
    private String Nama;
    @SerializedName("jenis_kelamin")
    @Expose
    private String JenisKelamin;
    @SerializedName("telp")
    @Expose
    private int Telp;
    @SerializedName("alamat")
    @Expose
    private String Alamat;
    @SerializedName("foto")
    @Expose
    private String Foto;

    @Override
    public String toString() {
        return "Siswa{" +
                "Nis=" + nis +
                ", Nama='" + nama + '\'' +
                ", JenisKelamin='" + jenis_kelamin + '\'' +
                ", Telp='" + telp + '\'' +
                ", Alamat=" + alamat +
                ", Foto=" + foto +
                '}';
    }
}
}
