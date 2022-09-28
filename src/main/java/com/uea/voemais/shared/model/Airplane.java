package com.uea.voemais.shared.model;

public class Airplane {
    private String companyName;
    private String name;

    public Airplane() {
    }

    public Airplane(String companyName, String name) {
        this.companyName = companyName;
        this.name = name;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
    
}
