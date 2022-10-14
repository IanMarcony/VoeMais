package com.uea.voemais.client.controller;

import com.uea.voemais.client.model.Client;
import com.uea.voemais.database.controller.SerializableManager;
import com.uea.voemais.shared.airplane.model.Airplane;
import com.uea.voemais.shared.flight.controller.FlightController;
import com.uea.voemais.shared.flight.model.Flight;
import com.uea.voemais.shared.passenger.model.Passenger;
import com.uea.voemais.shared.ticketflight.model.TicketFlight;
import com.uea.voemais.shared.utils.Constants;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;
import java.util.UUID;

public class ClientController {

  public static TicketFlight buyTicketFlight(
    List<Flight> flights,
    List<Passenger> passengers,
    Client client
  ) {
    float priceTotal = flights.size() == 1
      ? flights.get(0).getPrice()
      : flights.get(0).getPrice() + flights.get(1).getPrice();

    List<Flight> flightsFromDB = FlightController.getFromDB();
    List<Flight> flightsAux = flightsFromDB;

    for (Flight flightBought : flights) {
      for (int i = 0; i < flightsFromDB.size(); i++) {
        if (flightBought.getId().equals(flightsFromDB.get(i).getId())) {
          flightsAux.set(i, flightBought);
        }
      }
    }

    SerializableManager.saveObject(Flight.class.getName(), flightsAux);

    for (Passenger passenger : passengers) {
      if (
        passenger.getAgeGroup().equals("Criança") ||
        passenger.getAgeGroup().equals("Idoso")
      ) {
        priceTotal += priceTotal * 0.2;
      }
      if (passenger.getAgeGroup().equals("Adulto")) {
        priceTotal += priceTotal * 0.34;
      }
    }
    String idUnique = UUID.randomUUID().toString();
    TicketFlight ticketFlight = new TicketFlight(
      idUnique,
      priceTotal,
      client,
      passengers,
      flights
    );
    client.getTicketFlights().add(ticketFlight);
    SerializableManager.saveObject(client.getName(), client);

    return ticketFlight;
  }

  public static Airplane selectSeat(int numberSeat, Airplane airplane) {
    boolean isAvailable = airplane.getSeats().get(numberSeat).isAvailable();
    if (isAvailable) {
      airplane.getSeats().get(numberSeat).setAvailable(!isAvailable);
    }

    return airplane;
  }

  public static Client getFromDB(Client clientS) {
    String filename = clientS.getName() + Constants.EXTENSION_FILES;
    Client client;

    try {
      FileInputStream fileStream = new FileInputStream(filename);
      ObjectInputStream objectStream = new ObjectInputStream(fileStream);

      client = (Client) objectStream.readObject();
      objectStream.close();

      return client;
    } catch (Exception ex) {
      return null;
    }
  }
}
