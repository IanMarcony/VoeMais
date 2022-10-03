package com.uea.voemais.client.controller;

import com.uea.voemais.client.model.Client;
import com.uea.voemais.shared.airplane.model.Airplane;
import com.uea.voemais.shared.flight.model.Flight;
import com.uea.voemais.shared.passenger.model.Passenger;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class ClientController {

  public static void buyTicketFlight(
    List<Flight> flights,
    List<Passenger> passengers,
    Client client
  ) {}

  public static Airplane selectSeat(int numberSeat, Airplane airplane) {
    boolean isAvailable = airplane.getSeats().get(numberSeat).isAvailable();
    if (isAvailable) {
      airplane.getSeats().get(numberSeat).setAvailable(!isAvailable);
    }

    return airplane;
  }

  public static Client getFromDB(Client clientS) {
    String filename = clientS.getName();
    Client client;

    try {
      FileInputStream fileStream = new FileInputStream(filename);
      ObjectInputStream objectStream = new ObjectInputStream(fileStream);

      client = (Client) objectStream.readObject();
      objectStream.close();

      return client;
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
