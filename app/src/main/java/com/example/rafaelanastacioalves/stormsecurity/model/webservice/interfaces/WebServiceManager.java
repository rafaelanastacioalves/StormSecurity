package com.example.rafaelanastacioalves.stormsecurity.model.webservice.interfaces;

public interface WebServiceManager {
    WebServiceApi getInstanceWebServiceAPI();

    void setWebServiceApi(WebServiceApi webServiceApi);
}
