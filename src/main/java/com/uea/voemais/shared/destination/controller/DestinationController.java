package com.uea.voemais.shared.destination.controller;

import com.uea.voemais.shared.destination.model.Destination;
import com.uea.voemais.shared.utils.Constants;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class DestinationController {

  public static List<Destination> getFromDB() {
    String filename = Destination.class.getName() + Constants.EXTENSION_FILES;
    List<Destination> destinations = new ArrayList<>();

    try {
      FileInputStream fileStream = new FileInputStream(filename);
      ObjectInputStream objectStream = new ObjectInputStream(fileStream);

      destinations = (List<Destination>) objectStream.readObject();
      objectStream.close();
    } catch (Exception ex) {} finally {
      return destinations;
    }
  }
}
