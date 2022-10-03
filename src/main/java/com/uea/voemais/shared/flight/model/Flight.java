package com.uea.voemais.shared.flight.model;

import com.uea.voemais.shared.airplane.model.Airplane;
import com.uea.voemais.shared.destination.model.Destination;
import java.io.Serializable;
import java.util.Date;

public class Flight implements Serializable {

  private long id;
  private Date departureHour;
  private Date arrivalHour;
  private int availableTotal;
  private int spotsNumber;
  private String price;
  private Airplane airplane;
  private Destination destination;

  public Flight() {}

  public Flight(
    Date departureHour,
    Date arrivalHour,
    int availableTotal,
    int spotsNumber,
    String price,
    Airplane airplane,
    Destination destination
  ) {
    this.departureHour = departureHour;
    this.arrivalHour = arrivalHour;
    this.availableTotal = availableTotal;
    this.spotsNumber = spotsNumber;
    this.price = price;
    this.airplane = airplane;
    this.destination = destination;
  }

  public Date getDepartureHour() {
    return departureHour;
  }

  public void setDepartureHour(Date departureHour) {
    this.departureHour = departureHour;
  }

  public Date getArrivalHour() {
    return arrivalHour;
  }

  public void setArrivalHour(Date arrivalHour) {
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

  public Airplane getAirplane() {
    return airplane;
  }

  public void setAirplane(Airplane airplane) {
    this.airplane = airplane;
  }

  public Destination getDestination() {
    return destination;
  }

  public void setDestination(Destination destination) {
    this.destination = destination;
  }
}
