package com.example.rafaelanastacioalves.stormsecurity.model.webservice.interfaces;


import com.example.rafaelanastacioalves.stormsecurity.model.entities.News;

import retrofit.Callback;
import retrofit.http.GET;

/**
 * Interface representing the WebServiceApi endpoints
 * used by retrofit
 */
public interface WebServiceApi {
    //=================================== GET ===================================//
    // === Partial === //
    @GET("/news")
    void getMyTeam(Callback<News> response);


}
