package com.uea.voemais.shared.flight.controller;

import com.uea.voemais.shared.flight.model.Flight;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class FlightController {

  public static List<Flight> getFromDB() {
    String filename = Flight.class.getName();
    List<Flight> flights;

    try {
      FileInputStream fileStream = new FileInputStream(filename);
      ObjectInputStream objectStream = new ObjectInputStream(fileStream);

      flights = (List<Flight>) objectStream.readObject();
      objectStream.close();

      if (flights == null) {
        return new ArrayList<>();
      }

      return flights;
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
