package com.uea.voemais.shared.seat.model;

import java.io.Serializable;

public class Seat implements Serializable {

  private int number;
  private boolean available;

  public Seat(int number, boolean available) {
    this.number = number;
    this.available = available;
  }

  public int getNumber() {
    return number;
  }

  public void setNumber(int number) {
    this.number = number;
  }

  public boolean isAvailable() {
    return available;
  }

  public void setAvailable(boolean available) {
    this.available = available;
  }
}
