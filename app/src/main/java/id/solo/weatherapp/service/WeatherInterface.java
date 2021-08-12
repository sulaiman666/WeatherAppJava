package id.solo.weatherapp.service;

import java.util.Map;

import id.solo.weatherapp.entity.Weather;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.HeaderMap;
import retrofit2.http.Query;

public interface WeatherInterface {
    @GET("weather")
    Call<Weather> getCurrentWeatherByCity(@Query("q") String q, @Query("appid") String appid);
//    Call<Weather> getCurrentWeatherByCity(@HeaderMap Map<String, String> headers);
}
