package com.uea.voemais.shared.model;


public class Seat {
    private int number;
    private String seatType;
    private boolean available;

    public Seat() {
    }

    public Seat(int number, String seatType, boolean available) {
        this.number = number;
        this.seatType = seatType;
        this.available = available;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
}
