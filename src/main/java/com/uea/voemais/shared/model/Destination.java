
package com.uea.voemais.shared.model;

public class Destination {
    private String startAirport;
    private String finishAirport;
    private String startFlight;
    private String finishFlight;

    public Destination() {
    }

    public Destination(String startAirport, String finishAirport, String startFlight, String finishFlight) {
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

  
    
}
