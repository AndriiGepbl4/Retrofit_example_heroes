package com.andrii.retrofit;

/**
 * Created by Andrii on 20-Jan-18.
 */

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface UmoriliApi {
    @GET("api/get")

    Call<List<PostModel>> getData(@Query("name") String resuorceName, @Query("num")int count);

}
