package com.uea.voemais.shared.passenger.model;

import com.uea.voemais.client.model.Client;
import java.io.Serializable;

public class Passenger extends Client implements Serializable {

  private String ageGroup;

  public Passenger() {}

  public Passenger(String ageGroup) {
    this.ageGroup = ageGroup;
  }

  public Passenger(String ageGroup, String identityNumber, String gender) {
    super(identityNumber, gender);
    this.ageGroup = ageGroup;
  }

  public Passenger(
    String ageGroup,
    String identityNumber,
    String gender,
    String name
  ) {
    super(identityNumber, gender, name);
    this.ageGroup = ageGroup;
  }

  public Passenger(
    String ageGroup,
    String identityNumber,
    String gender,
    String name,
    String password,
    String email
  ) {
    super(identityNumber, gender, name, password, email);
    this.ageGroup = ageGroup;
  }

  public String getAgeGroup() {
    return ageGroup;
  }

  public void setAgeGroup(String ageGroup) {
    this.ageGroup = ageGroup;
  }
}
