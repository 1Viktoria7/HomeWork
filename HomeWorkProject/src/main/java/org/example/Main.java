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

    public static void getOrderByOrderId(String cityName) throws IOException {
        HttpUrl.Builder urlBuilder = HttpUrl.get(baseUrl).newBuilder();
        urlBuilder.addQueryParameter("q", cityName);

        String url = urlBuilder.build().toString();

        Request request = new Request.Builder()
                .url(url)
                .build();
        OkHttpClient client = new OkHttpClient();
        Call call = client.newCall(request);
        Response response = call.execute();
    }

    public static void main(String[] args) throws IOException {

        getOrderByOrderId("10");
    }
}