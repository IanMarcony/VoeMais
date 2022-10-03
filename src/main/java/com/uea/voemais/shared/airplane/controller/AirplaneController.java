package com.uea.voemais.shared.airplane.controller;

import com.uea.voemais.shared.airplane.model.Airplane;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class AirplaneController {

  public static List<Airplane> getFromDB() {
    String filename = Airplane.class.getName();
    List<Airplane> airplanes;

    try {
      FileInputStream fileStream = new FileInputStream(filename);
      ObjectInputStream objectStream = new ObjectInputStream(fileStream);

      airplanes = (List<Airplane>) objectStream.readObject();
      objectStream.close();

      if (airplanes == null) {
        return new ArrayList<Airplane>();
      }

      return airplanes;
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
