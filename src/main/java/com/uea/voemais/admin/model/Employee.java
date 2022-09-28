package com.uea.voemais.admin.model;

import com.uea.voemais.shared.model.User;

public class Employee extends User{

    public Employee() {
    }

    public Employee(String name, String password, String email) {
        super(name, password, email);
    }
  
}
