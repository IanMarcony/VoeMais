package com.uea.voemais.shared.model;

public class Flight {
    private String departureHour;
    private String arrivalHour;
    private int availableTotal;
    private int spotsNumber;
    private String price;

    public Flight() {
    }
    
    

    public Flight(String departureHour, String arrivalHour, int availableTotal, int spotsNumber, String price) {
        this.departureHour = departureHour;
        this.arrivalHour = arrivalHour;
        this.availableTotal = availableTotal;
        this.spotsNumber = spotsNumber;
        this.price = price;
    }

    public String getDepartureHour() {
        return departureHour;
    }

    public void setDepartureHour(String departureHour) {
        this.departureHour = departureHour;
    }

    public String getArrivalHour() {
        return arrivalHour;
    }

    public void setArrivalHour(String arrivalHour) {
        this.arrivalHour = arrivalHour;
    }

    public int getAvailableTotal() {
        return availableTotal;
    }

    public void setAvailableTotal(int availableTotal) {
        this.availableTotal = availableTotal;
    }

    public int getSpotsNumber() {
        return spotsNumber;
    }

    public void setSpotsNumber(int spotsNumber) {
        this.spotsNumber = spotsNumber;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

  
    
}
