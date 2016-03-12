package com.example.rafaelanastacioalves.stormsecurity.model.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;


@JsonIgnoreProperties(ignoreUnknown = true)
public class News implements Serializable {

    private List<New> news;

    public News() {
        super();
    }

    public List<New> getNewsList() {
        return news;
    }

    public void setNewsList(List<New> news) {
        this.news = news;
    }
}
