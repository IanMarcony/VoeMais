package com.uea.voemais.shared.destination.model;

import java.io.Serializable;

public class Destination implements Serializable {

  private String nameCity;

  public Destination() {}

  public Destination(String nameCity) {
    this.nameCity = nameCity;
  }

  public String getNameCity() {
    return nameCity;
  }

  public void setNameCity(String nameCity) {
    this.nameCity = nameCity;
  }
}
