package com.cursor.HW5.entities;

import org.springframework.stereotype.Component;

@Component
public class ExtraUserData {

    String adress;
    String tel;

    public ExtraUserData(String adress, String tel) {
        this.adress = adress;
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "ExtraUserData{" +
                "adress='" + adress + '\'' +
                ", tel='" + tel + '\'' +
                '}';
    }
}
