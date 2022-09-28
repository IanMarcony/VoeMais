package com.uea.voemais.client.model;

import com.uea.voemais.shared.model.User;

public class Client extends User{
    String identityNumber;
    String gender;

    public Client() {
    }
    
    public Client(String identityNumber, String gender) {
        this.identityNumber = identityNumber;
        this.gender = gender;
    }

    public Client(String identityNumber, String gender, String name, String password, String email) {
        super(name, password, email);
        this.identityNumber = identityNumber;
        this.gender = gender;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    
}
