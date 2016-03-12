package com.example.rafaelanastacioalves.stormsecurity.model.webservice;

import org.androidannotations.annotations.EBean;

import retrofit.RequestInterceptor;


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
