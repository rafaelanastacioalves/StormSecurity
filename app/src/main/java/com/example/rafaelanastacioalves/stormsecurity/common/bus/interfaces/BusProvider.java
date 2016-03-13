package com.example.rafaelanastacioalves.stormsecurity.common.bus.interfaces;

import com.example.rafaelanastacioalves.stormsecurity.common.bus.CustomBus;
import com.squareup.otto.Bus;


public interface BusProvider {
    CustomBus getServiceBus();

    void setServiceBus(CustomBus serviceBus);

    Bus getRepositoryBus();

    void setRepositoryBus(CustomBus repositoryBus);
}