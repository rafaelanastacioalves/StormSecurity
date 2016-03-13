package com.example.rafaelanastacioalves.stormsecurity.common.bus;

import com.example.rafaelanastacioalves.stormsecurity.common.bus.interfaces.BusProvider;
import com.squareup.otto.ThreadEnforcer;

import org.androidannotations.annotations.AfterInject;
import org.androidannotations.annotations.EBean;



@EBean(scope = EBean.Scope.Singleton)
public class BusProviderImpl implements BusProvider {
    private CustomBus serviceBus;
    private CustomBus restBus;

    @AfterInject
    void afterInject() {
        setupBus();
    }

    private void setupBus() {
        serviceBus = new CustomBus(ThreadEnforcer.ANY);
        restBus = new CustomBus(ThreadEnforcer.ANY);
    }

    @Override
    public CustomBus getServiceBus() {
        return serviceBus;
    }

    @Override
    public void setServiceBus(CustomBus serviceBus) {
            this.serviceBus = serviceBus;
            return;

    }

    @Override
    public CustomBus getRepositoryBus() {
        return restBus;
    }

    @Override
    public void setRepositoryBus(CustomBus restBus) {
            this.restBus = restBus;
            return;
    }
}