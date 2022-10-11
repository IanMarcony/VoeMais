package com.uea.voemais.admin.controller;

import com.uea.voemais.admin.model.Employee;
import com.uea.voemais.database.controller.SerializableManager;
import com.uea.voemais.shared.airplane.controller.AirplaneController;
import com.uea.voemais.shared.airplane.model.Airplane;
import com.uea.voemais.shared.destination.controller.DestinationController;
import com.uea.voemais.shared.destination.model.Destination;
import com.uea.voemais.shared.flight.controller.FlightController;
import com.uea.voemais.shared.flight.model.Flight;
import com.uea.voemais.shared.utils.Constants;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class EmployeeController {

  public static Destination createDestination(String nameCity) {
    Destination destination = new Destination(nameCity);

    List<Destination> destinations = DestinationController.getFromDB();

    destinations.add(destination);

    SerializableManager.saveObject(Destination.class.getName(), destinations);

    return destination;
  }

  public static Airplane createAirplane(
    String companyName,
    String name,
    int capacitySeat
  ) {
    Airplane airplane = new Airplane(companyName, name, capacitySeat);

    List<Airplane> airplanes = AirplaneController.getFromDB();
    airplanes.add(airplane);

    SerializableManager.saveObject(Airplane.class.getName(), airplanes);
    return airplane;
  }

  public static Flight createFlights(
    Date departureHour,
    Date arrivalHour,
    int spotsNumber,
    float price,
    Airplane airplane,
    Destination destination
  ) {
    Flight flight = new Flight(
      departureHour,
      arrivalHour,
      spotsNumber,
      price,
      airplane,
      destination
    );

    flight.setId(UUID.randomUUID().toString());

    List<Flight> flights = FlightController.getFromDB();

    flights.add(flight);

    SerializableManager.saveObject(Flight.class.getName(), flights);
    return flight;
  }

  public static Employee getFromDB(Employee employee) {
    String filename = employee.getName() + Constants.EXTENSION_FILES;

    try {
      FileInputStream fileStream = new FileInputStream(filename);
      ObjectInputStream objectStream = new ObjectInputStream(fileStream);

      Employee employeeDB = (Employee) objectStream.readObject();
      objectStream.close();

      return employeeDB;
    } catch (Exception ex) {
      return null;
    }
  }
}
