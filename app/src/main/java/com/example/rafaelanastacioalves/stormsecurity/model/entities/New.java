package com.example.rafaelanastacioalves.stormsecurity.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by rafaelanastacioalves on 28/09/2015.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class New implements Serializable {

    @JsonProperty("text")
    private String text;


    public New() {
    }

    public New (String text) {
        this.text = text;
    }


    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

}

