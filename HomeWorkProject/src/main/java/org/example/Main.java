package org.example;

import okhttp3.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.SQLOutput;

public class Main {
    static String baseUrl = "https://api.openweathermap.org/data/2.5/weather";

    public static void getWeather (String cityName,String units,String lang,String mode) throws IOException {
        HttpUrl.Builder urlBuilder = HttpUrl.get(baseUrl).newBuilder();
        urlBuilder.addQueryParameter("q", cityName);
        urlBuilder.addQueryParameter("units", units);
        urlBuilder.addQueryParameter("lang", lang);
        urlBuilder.addQueryParameter("mode", mode);
        urlBuilder.addQueryParameter("appid", "ab26a2beceb94848c646c4bcc3554a2b");

        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();
        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);
        Response response = call.execute();
        System.out.println(response.code());
    }

    public static void main(String[] args) throws IOException {

        getWeather("London", "metric", "ru", "json");
    }
}