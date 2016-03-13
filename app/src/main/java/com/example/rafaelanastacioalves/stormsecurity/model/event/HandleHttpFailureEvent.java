package com.example.rafaelanastacioalves.stormsecurity.model.event;

import retrofit.RetrofitError;

/**
 * Created by rafaelanastacioalves on 04/11/15.
 */
public class HandleHttpFailureEvent {
    private RetrofitError error;

    public HandleHttpFailureEvent(RetrofitError error) {
        this.error = error;
    }

    public RetrofitError getError() {
        return error;
    }

    public void setError(RetrofitError error) {
        this.error = error;
    }
}
