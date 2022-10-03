package com.uea.voemais.admin.controller;

import com.uea.voemais.admin.model.Employee;
import com.uea.voemais.database.controller.SerializableManager;
import com.uea.voemais.shared.airplane.controller.AirplaneController;
import com.uea.voemais.shared.airplane.model.Airplane;
import com.uea.voemais.shared.destination.controller.DestinationController;
import com.uea.voemais.shared.destination.model.Destination;
import com.uea.voemais.shared.flight.controller.FlightController;
import com.uea.voemais.shared.flight.model.Flight;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;
import java.util.List;

public class EmployeeController {

  public static void createDestination(
    String startAirport,
    String finishAirport,
    String startFlight,
    String finishFlight
  ) {
    Destination destination = new Destination(
      startAirport,
      finishAirport,
      startFlight,
      finishFlight
    );

    List<Destination> destinations = DestinationController.getFromDB();

    destinations.add(destination);

    SerializableManager.saveObject(Destination.class.getName(), destinations);
  }

  public static void createAirplane(
    String companyName,
    String name,
    int capacitySeat
  ) {
    Airplane airplane = new Airplane(companyName, name, capacitySeat);

    List<Airplane> airplanes = AirplaneController.getFromDB();
    airplanes.add(airplane);

    SerializableManager.saveObject(Airplane.class.getName(), airplanes);
  }

  public static void createFlights(
    Date departureHour,
    Date arrivalHour,
    int availableTotal,
    int spotsNumber,
    String price,
    Airplane airplane,
    Destination destination
  ) {
    Flight flight = new Flight(
      departureHour,
      arrivalHour,
      availableTotal,
      spotsNumber,
      price,
      airplane,
      destination
    );

    List<Flight> flights = FlightController.getFromDB();

    flights.add(flight);

    SerializableManager.saveObject(Flight.class.getName(), flights);
  }

  public static Employee getFromDB(Employee employee) {
    String filename = employee.getName();

    try {
      FileInputStream fileStream = new FileInputStream(filename);
      ObjectInputStream objectStream = new ObjectInputStream(fileStream);

      Employee employeeDB = (Employee) objectStream.readObject();
      objectStream.close();

      return employeeDB;
    } catch (Exception ex) {
      ex.printStackTrace();
      return null;
    }
  }
}
