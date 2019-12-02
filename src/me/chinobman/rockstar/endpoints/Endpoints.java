package me.chinobman.rockstar.endpoints;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.*;

public interface Endpoints {

    @GET("/")
    Call<ResponseBody> VerifyToken();

    @POST("/profile/signin")
    @FormUrlEncoded
    Call<Void> loginRockstar(@Field("login") String username, @Field("password") String password, @Field("__RequestVerificationToken") String token);

}
