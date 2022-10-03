package com.uea.voemais.shared.destination.model;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.List;

public class Destination implements Serializable {

  private String startAirport;
  private String finishAirport;
  private String startFlight;
  private String finishFlight;

  public Destination() {}

  public Destination(
    String startAirport,
    String finishAirport,
    String startFlight,
    String finishFlight
  ) {
    this.startAirport = startAirport;
    this.finishAirport = finishAirport;
    this.startFlight = startFlight;
    this.finishFlight = finishFlight;
  }

  public String getStartAirport() {
    return startAirport;
  }

  public void setStartAirport(String startAirport) {
    this.startAirport = startAirport;
  }

  public String getFinishAirport() {
    return finishAirport;
  }

  public void setFinishAirport(String finishAirport) {
    this.finishAirport = finishAirport;
  }

  public String getStartFlight() {
    return startFlight;
  }

  public void setStartFlight(String startFlight) {
    this.startFlight = startFlight;
  }

  public String getFinishFlight() {
    return finishFlight;
  }

  public void setFinishFlight(String finishFlight) {
    this.finishFlight = finishFlight;
  }

  private static List<Destination> getFromDB() {
    String filename = Destination.class.getName();
    List<Destination> destinations;

    try {
      FileInputStream fileStream = new FileInputStream(filename);
      ObjectInputStream objectStream = new ObjectInputStream(fileStream);

      destinations = (List<Destination>) objectStream.readObject();
      objectStream.close();

      return destinations;
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
