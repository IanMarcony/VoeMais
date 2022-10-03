package com.uea.voemais.shared.ticketflight.model;

import com.uea.voemais.client.model.Client;
import com.uea.voemais.shared.flight.model.Flight;
import com.uea.voemais.shared.passenger.model.Passenger;
import java.io.Serializable;
import java.util.List;

public class TicketFlight implements Serializable {

  private String price;
  private Client client;
  private List<Passenger> passengers;
  private List<Flight> flights;

  public TicketFlight() {}

  public TicketFlight(
    String price,
    Client client,
    List<Passenger> passengers,
    List<Flight> flights
  ) {
    this.price = price;
    this.client = client;
    this.passengers = passengers;
    this.flights = flights;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

  public List<Passenger> getPassengers() {
    return passengers;
  }

  public void setPassengers(List<Passenger> passengers) {
    this.passengers = passengers;
  }

  public List<Flight> getFlights() {
    return flights;
  }

  public void setFlights(List<Flight> flights) {
    this.flights = flights;
  }

  public Client getClient() {
    return client;
  }

  public void setClient(Client client) {
    this.client = client;
  }
}
