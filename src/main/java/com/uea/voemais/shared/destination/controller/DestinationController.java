package com.uea.voemais.shared.destination.controller;

import com.uea.voemais.shared.destination.model.Destination;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DestinationController {

  public static List<Destination> getFromDB() {
    String filename = Destination.class.getName();
    List<Destination> destinations;

    try {
      FileInputStream fileStream = new FileInputStream(filename);
      ObjectInputStream objectStream = new ObjectInputStream(fileStream);

      destinations = (List<Destination>) objectStream.readObject();
      objectStream.close();
      if (destinations == null) {
        return new ArrayList<>();
      }
      return destinations;
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
