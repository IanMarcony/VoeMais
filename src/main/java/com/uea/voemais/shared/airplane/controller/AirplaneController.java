package com.uea.voemais.shared.airplane.controller;

import com.uea.voemais.shared.airplane.model.Airplane;
import com.uea.voemais.shared.utils.Constants;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

public class AirplaneController {

  public static List<Airplane> getFromDB() {
    String filename = Airplane.class.getName() + Constants.EXTENSION_FILES;
    List<Airplane> airplanes = new ArrayList<Airplane>();

    try {
      FileInputStream fileStream = new FileInputStream(filename);
      ObjectInputStream objectStream = new ObjectInputStream(fileStream);

      airplanes = (List<Airplane>) objectStream.readObject();
      objectStream.close();
    } catch (Exception ex) {
    } finally {
      return airplanes;
    }
  }
}
