package com.uea.voemais.admin.model;

import com.uea.voemais.shared.user.model.User;
import java.io.Serializable;

public class Employee extends User implements Serializable {

  public Employee() {}

  public Employee(String name, String password, String email) {
    super(name, password, email);
  }
}
