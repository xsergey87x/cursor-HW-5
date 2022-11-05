package com.cursor.HW5.entities;

import org.springframework.stereotype.Component;

@Component
public class User {

    private String name;
    private ExtraUserData extraUserData;

    public User(String name, ExtraUserData extraUserData) {
        this.name = name;
        this.extraUserData = extraUserData;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ExtraUserData getExtraUserData() {
        return extraUserData;
    }

    public void setExtraUserData(ExtraUserData extraUserData) {
        this.extraUserData = extraUserData;
    }
}
