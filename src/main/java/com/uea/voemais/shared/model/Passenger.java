package com.uea.voemais.shared.model;

import com.uea.voemais.client.model.Client;

public class Passenger extends Client{
    private String ageGroup;

    public Passenger() {
    }
    
    

    public Passenger(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public Passenger(String ageGroup, String identityNumber, String gender) {
        super(identityNumber, gender);
        this.ageGroup = ageGroup;
    }

    public Passenger(String ageGroup, String identityNumber, String gender, String name, String password, String email) {
        super(identityNumber, gender, name, password, email);
        this.ageGroup = ageGroup;
    }

   
    

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }
   
}
