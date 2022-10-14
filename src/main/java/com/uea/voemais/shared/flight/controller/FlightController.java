package com.uea.voemais.shared.flight.controller;

import com.uea.voemais.shared.flight.model.Flight;
import com.uea.voemais.shared.utils.Constants;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class FlightController {

  public static List<Flight> getFromDB() {
    String filename = Flight.class.getName() + Constants.EXTENSION_FILES;
    List<Flight> flights = new ArrayList<>();

    try {
      FileInputStream fileStream = new FileInputStream(filename);
      ObjectInputStream objectStream = new ObjectInputStream(fileStream);

      flights = (List<Flight>) objectStream.readObject();
      objectStream.close();
    } catch (Exception ex) {} finally {
      return flights;
    }
  }
}
