package com.example.rafaelanastacioalves.stormsecurity.model.webservice;

import org.androidannotations.annotations.EBean;

import retrofit.RequestInterceptor;

/**
 * Created by bruna.esteves on 28/09/15.
 */
@EBean
public class WebServiceHeaders implements RequestInterceptor {
//    @Bean(SessionRepositoryDiskImpl.class)
//    SessionRepositoryDisk sessionRepositoryDisk;

    @Override
    public void intercept(RequestFacade request) {
//        if (sessionRepositoryDisk.isValidGLBID()) {
//            request.addHeader(HeadersKeys.X_GLB_TOKEN, sessionRepositoryDisk.getGLBID());
//        }
    }
}
