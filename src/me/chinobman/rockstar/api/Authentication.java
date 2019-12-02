package me.chinobman.rockstar.api;

import me.chinobman.rockstar.endpoints.Endpoints;
import okhttp3.ResponseBody;
import retrofit2.Response;
import retrofit2.Retrofit;

import java.io.IOException;

public class Authentication {

    private final Retrofit.Builder builder;
    private final Endpoints endpoints;
    private final String username;
    private final String password;
    private final String token;

    public Authentication(Retrofit.Builder builder, String token,  String username, String password) {
        this.builder = builder;
        this.endpoints = this.builder.build().create(Endpoints.class);
        this.token = token;
        this.username = username;
        this.password = password;

        if(!login()) throw new NullPointerException("Login failed. Please use right login credentials.");
    }

    public boolean login() {
        try {
            Response<Void> response = this.endpoints.loginRockstar(this.username, this.password, this.token).execute();

            return response.code() == 200;
        } catch (IOException e) {
            return false;
        }
    }
}
