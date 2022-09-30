package com.uea.voemais.admin.model;

import com.uea.voemais.shared.model.Flight;
import com.uea.voemais.shared.model.User;
import java.util.ArrayList;

public class Employee extends User{
    public ArrayList<Flight> flights = new ArrayList<>();
    public Employee() {
    }

    public Employee(String name, String password, String email) {
        super(name, password, email);
    }
  
}
