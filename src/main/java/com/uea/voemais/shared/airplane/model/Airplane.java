package com.uea.voemais.shared.airplane.model;

import com.uea.voemais.shared.seat.model.Seat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Airplane implements Serializable {

  private String companyName;
  private String name;
  private List<Seat> seats;

  public Airplane(String companyName, String name, int capacitySeat) {
    this.companyName = companyName;
    this.name = name;
    this.seats = new ArrayList<>();

    for (int i = 0; i < capacitySeat; i++) {
      this.seats.add(new Seat(i + 1, true));
    }
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

  public List<Seat> getSeats() {
    return seats;
  }

  public void setSeats(List<Seat> seats) {
    this.seats = seats;
  }

  @Override
  public String toString() {
    return (
      "Airplane [companyName=" +
      companyName +
      ", name=" +
      name +
      ", seats=" +
      seats +
      "]"
    );
  }
}
