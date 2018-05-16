package com.example.eddymontesinos.demo_retrofit;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FuncionesEarthquake {

    @GET("summary/all_hour.geojson")
    Call<Earthquake> getTerremotos();

}
