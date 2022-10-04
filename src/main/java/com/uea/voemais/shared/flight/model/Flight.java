package com.uea.voemais.shared.flight.model;

import com.uea.voemais.shared.airplane.model.Airplane;
import com.uea.voemais.shared.destination.model.Destination;
import java.io.Serializable;
import java.util.Date;

public class Flight implements Serializable {

  private String id;
  private Date departureHour;
  private Date arrivalHour;
  private int spotsNumber;
  private float price;
  private Airplane airplane;
  private Destination destination;

  public Flight() {}

  public Flight(
    Date departureHour,
    Date arrivalHour,
    int spotsNumber,
    float price,
    Airplane airplane,
    Destination destination
  ) {
    this.departureHour = departureHour;
    this.arrivalHour = arrivalHour;
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

  public int getSpotsNumber() {
    return spotsNumber;
  }

  public void setSpotsNumber(int spotsNumber) {
    this.spotsNumber = spotsNumber;
  }

  public float getPrice() {
    return price;
  }

  public void setPrice(float price) {
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

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
