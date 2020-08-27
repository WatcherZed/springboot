package com.example.demo.test.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("amozon")
public class AmozonProperties {
    private String amozonID;

    public String getAmozonID() {
        return amozonID;
    }

    public void setAmozonID(String amozonID) {
        this.amozonID = amozonID;
    }
}
