package id.solo.weatherapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.HashMap;
import java.util.Map;

import id.solo.weatherapp.entity.Main;
import id.solo.weatherapp.entity.Weather;
import id.solo.weatherapp.service.ApiClient;
import id.solo.weatherapp.service.WeatherInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    ImageView imgIcon;
    TextView tvMain, tvDesc, tvTemp, tvHumidity;
    Map<String, String> header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_cuaca);

        varInit();

        header = new HashMap<>();

//        header.put("q", "Jakarta");
//        header.put("appid", "cfd51d47f3041f92e1ef9b7d89cf0eec");

        WeatherInterface weatherInterface = ApiClient.getRetrofit().create(WeatherInterface.class);
        Call<Weather> call = weatherInterface.getCurrentWeatherByCity("Jakarta", "cfd51d47f3041f92e1ef9b7d89cf0eec");

        call.enqueue(new Callback<Weather>() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onResponse(Call<Weather> call, Response<Weather> response) {
                System.out.println(response.body());
                Glide.with(MainActivity.this).load("http://openweathermap.org/img/wn/"
                        + response.body().getWeather().get(0).getIcon() + ".png").into(imgIcon);
                tvMain.setText(response.body().getWeather().get(0).getMain());
                tvDesc.setText(response.body().getWeather().get(0).getDescription());
                tvTemp.setText(response.body().getMain().getTemp().toString());
                tvHumidity.setText(response.body().getMain().getHumidity().toString();
            }

            @Override
            public void onFailure(Call<Weather> call, Throwable t) {

            }
        });
    }

    private void varInit() {
        imgIcon = findViewById(R.id.img_icon);
        tvMain = findViewById(R.id.tv_main);
        tvDesc = findViewById(R.id.tv_desc);
        tvTemp = findViewById(R.id.tv_temp);
        tvHumidity = findViewById(R.id.tv_humidity);

    }
}