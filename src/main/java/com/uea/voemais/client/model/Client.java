package com.uea.voemais.client.model;

import com.uea.voemais.shared.ticketflight.model.TicketFlight;
import com.uea.voemais.shared.user.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Client extends User implements Serializable {

  private String identityNumber;
  private String gender;
  private List<TicketFlight> ticketFlights;

  private static Client client;

  public Client() {
    this.ticketFlights = new ArrayList<>();
  }

  public Client(String identityNumber, String gender) {
    this.identityNumber = identityNumber;
    this.ticketFlights = new ArrayList<>();
    this.gender = gender;
  }

  public Client(
    String identityNumber,
    String gender,
    String name,
    String password,
    String email
  ) {
    super(name, password, email);
    this.identityNumber = identityNumber;
    this.ticketFlights = new ArrayList<>();
    this.gender = gender;
  }

  public Client(String identityNumber, String gender, String name) {
    super(name);
    this.identityNumber = identityNumber;
    this.ticketFlights = new ArrayList<>();
    this.gender = gender;
  }

  public static void setInstance(Client clientA) {
    client = clientA;
  }

  public static Client getInstance() {
    return client;
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

  public List<TicketFlight> getTicketFlights() {
    return ticketFlights;
  }

  public void setTicketFlights(List<TicketFlight> ticketFlights) {
    this.ticketFlights = ticketFlights;
  }

  @Override
  public String toString() {
    return (
      "Client [identityNumber=" +
      identityNumber +
      ", gender=" +
      gender +
      ", ticketFlights=" +
      ticketFlights +
      "]"
    );
  }
}
