package com.example.rafaelanastacioalves.stormsecurity.model.webservice;


import android.app.Application;

import com.example.rafaelanastacioalves.stormsecurity.StormSecurity_;
import com.example.rafaelanastacioalves.stormsecurity.model.webservice.interfaces.WebServiceApi;
import com.example.rafaelanastacioalves.stormsecurity.model.webservice.interfaces.WebServiceManager;
import com.squareup.okhttp.Cache;
import com.squareup.okhttp.OkHttpClient;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EBean;



import java.io.File;
import java.util.concurrent.TimeUnit;

import retrofit.RestAdapter;
import retrofit.client.OkClient;
import retrofit.converter.JacksonConverter;

@EBean(scope = EBean.Scope.Singleton)
public class WebServiceManagerImpl implements WebServiceManager {
    private static final int DISK_CACHE_SIZE = 50 * 1024 * 1024;
    private static final String CACHE_NAME = "HTTP";
    private static final String SERVER_URL = "";
    RestAdapter.LogLevel RETROFIT_LOG_LEVEL = RestAdapter.LogLevel.FULL;

    @Bean
    WebServiceHeaders webServiceHeaders;
    private WebServiceApi webServiceApi;

    @AfterInject
    void afterInject() {
        setupApi();
    }

    @Override
    public void setWebServiceApi(WebServiceApi webServiceApi) {
            this.webServiceApi = webServiceApi;
            return;

    }

    @Override
    public WebServiceApi getInstanceWebServiceAPI() {
        return webServiceApi;
    }

    private void setupApi() {
        RestAdapter restAdapter = new RestAdapter.Builder()
                .setEndpoint(SERVER_URL)
                .setClient(getOkClient(StormSecurity_.getInstance().getCacheDir(), CACHE_NAME, DISK_CACHE_SIZE))
                .setLogLevel(RETROFIT_LOG_LEVEL)
                .setRequestInterceptor(webServiceHeaders)
                .setConverter(new JacksonConverter())
                .build();

        webServiceApi = restAdapter.create(WebServiceApi.class);
    }

    private OkClient getOkClient(File cacheDir, String cacheName, int cacheSize) {
        final OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.setFollowSslRedirects(false);
        okHttpClient.setConnectTimeout(30l, TimeUnit.SECONDS);
        okHttpClient.setReadTimeout(30, TimeUnit.SECONDS);
        okHttpClient.setCache(new Cache(new File(cacheDir, cacheName), cacheSize));
        return new OkClient(okHttpClient);
    }
}
