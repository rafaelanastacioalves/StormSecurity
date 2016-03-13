package com.example.rafaelanastacioalves.stormsecurity.common.bus;

import com.squareup.otto.Bus;
import com.squareup.otto.ThreadEnforcer;


public class CustomBus extends Bus {

    private boolean isRegistered;

    @Override
    public void register(Object object) {
        if(!isRegistered){
            super.register(object);
            isRegistered = true;
        }
    }

    @Override
    public void unregister(Object object) {
        if(isRegistered){
            super.unregister(object);
            isRegistered = false;
        }
    }

    public CustomBus(ThreadEnforcer enforcer) {
        super(enforcer);
    }
}
