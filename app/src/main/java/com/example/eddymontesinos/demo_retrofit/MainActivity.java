package com.example.eddymontesinos.demo_retrofit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class MainActivity extends AppCompatActivity {

    private TextView tvMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = findViewById(R.id.tv_message);

        Retrofit retrofit = RetrofitCreator.getInstance();
        FuncionesEarthquake service = retrofit.create(FuncionesEarthquake.class);

        Call<Earthquake> responseCall = service.getTerremotos();

        responseCall.enqueue(new Callback<Earthquake>() {

            @Override
            public void onResponse(Call<Earthquake> call, Response<Earthquake> response) {

                Earthquake earthquake = response.body();

                tvMessage.setText(earthquake.getMetadata().getTitle());
            }

            @Override
            public void onFailure(Call<Earthquake> call, Throwable t) {

            }
        });
    }
}
