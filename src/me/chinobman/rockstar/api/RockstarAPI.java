package me.chinobman.rockstar.api;

import me.chinobman.rockstar.endpoints.Endpoints;
import okhttp3.CookieJar;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import retrofit2.Retrofit;

import java.io.IOException;
import java.net.CookieManager;
import java.net.CookiePolicy;
import java.util.ArrayList;
import java.util.List;

public class RockstarAPI {

    private String username;
    private String password;

    private CookieManager manager;
    private Retrofit.Builder builder;

    public RockstarAPI(String username, String password) {
        this.manager = new CookieManager();
        manager.setCookiePolicy(CookiePolicy.ACCEPT_ALL);
        CookieJar jar = new JavaNetCookieJar(manager);

        this.builder = new Retrofit.Builder().baseUrl("http://socialclub.rockstargames.com").client(new OkHttpClient.Builder().cookieJar(jar).build());

        this.username = username;
        this.password = password;
    }

    public void login() {
        try {
            Endpoints points = this.builder.build().create(Endpoints.class);
            ResponseBody body = points.VerifyToken().execute().body();

            List<String> list = new ArrayList<>();
            list.add(body.string());


            list.forEach(line -> {
                if(line.contains("__RequestVerificationToken")) {
                    new Authentication(this.builder, line.split("value=\"")[1].split("\"")[0], this.username, this.password);
                }
            });

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
