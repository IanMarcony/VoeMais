package com.uea.voemais;

import com.uea.voemais.admin.controller.EmployeeController;
import com.uea.voemais.admin.model.Employee;
import com.uea.voemais.client.controller.ClientController;
import com.uea.voemais.client.model.Client;
import com.uea.voemais.shared.airplane.controller.AirplaneController;
import com.uea.voemais.shared.airplane.model.Airplane;
import com.uea.voemais.shared.destination.controller.DestinationController;
import com.uea.voemais.shared.destination.model.Destination;
import com.uea.voemais.shared.flight.controller.FlightController;
import com.uea.voemais.shared.flight.model.Flight;
import com.uea.voemais.shared.passenger.model.Passenger;
import com.uea.voemais.shared.ticketflight.model.TicketFlight;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MainTest {

  public static void main(String[] args) {
    Employee employee = new Employee("Admin", "admin", "admin@admin.com");

    EmployeeController.createAirplane("LATAM", "2erdewe", 123);
    EmployeeController.createAirplane("MAP", "wqe", 123);
    EmployeeController.createAirplane("GOL", "wqew", 123);

    EmployeeController.createDestination("Manaus");
    EmployeeController.createDestination("Fortaleza");
    EmployeeController.createDestination("Orlando-EUA");

    List<Airplane> airplanes = AirplaneController.getFromDB();

    System.out.println("Aviões salvos");
    for (Airplane airplane : airplanes) {
      System.out.println("Avião: " + airplane.getName());
    }

    List<Destination> destinations = DestinationController.getFromDB();

    System.out.println("Destinos salvos");
    for (Destination destination : destinations) {
      System.out.println(
        "Destino\tIda: " +
        destination.getNameCity() +
        "\tVolta: " +
        destination.getNameCity()
      );
    }

    EmployeeController.createFlights(
      new Date(),
      new Date(),
      5,
      1728,
      airplanes.get(0),
      destinations.get(0)
    );
    EmployeeController.createFlights(
      new Date(),
      new Date(),
      5,
      443,
      airplanes.get(0),
      destinations.get(1)
    );

    List<Flight> flights = FlightController.getFromDB();

    System.out.println("Voos salvos");

    for (Flight flight : flights) {
      System.out.println(
        "Voo\tIda: " +
        flight.getDestination().getNameCity() +
        "\tVolta: " +
        flight.getDestination().getNameCity() +
        "\tPreço: " +
        flight.getPrice() +
        "\tID: " +
        flight.getId()
      );
    }

    Client client = new Client(
      "2312323",
      "Masculino",
      "Ian Marcony",
      "12345678",
      "ian@gmail.com"
    );

    Flight startFlight = flights.get(0);
    Flight finishFlight = flights.get(1);
    Airplane airplane = finishFlight.getAirplane();

    Airplane airplaneUpdated = ClientController.selectSeat(3, airplane);

    startFlight.setAirplane(airplaneUpdated);
    finishFlight.setAirplane(airplaneUpdated);

    List<Flight> flightsToBuy = new ArrayList<>();
    List<Passenger> passengers = new ArrayList<>();

    flightsToBuy.add(startFlight);
    flightsToBuy.add(finishFlight);

    passengers.add(
      new Passenger(
        "Adulto",
        "3423432",
        "Masc",
        "Ian",
        "1223",
        "ian@ina.gmail.com"
      )
    );

    ClientController.buyTicketFlight(flightsToBuy, passengers, client);

    System.out.println("Passagens: ");
    for (TicketFlight ticketFlight : client.getTicketFlights()) {
      System.out.println("Passagem: " + ticketFlight.toString());
    }
  }
}
