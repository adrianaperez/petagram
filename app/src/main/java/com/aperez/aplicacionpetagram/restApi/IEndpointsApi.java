package com.aperez.aplicacionpetagram.restApi;

import com.aperez.aplicacionpetagram.restApi.model.PetegramResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface IEndpointsApi {

    @GET(ConstantesRestApi.URL_GET_RECENT_MEDIA_USER)
    Call<PetegramResponse> getRecentMedia();

}
