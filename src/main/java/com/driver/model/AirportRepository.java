package com.driver.model;

import java.util.HashMap;
import java.util.Map;

public class AirportRepository {

    private Map<String, Airport> airports = new HashMap<>();

    public String addAirport(Airport airport) {
        airports.put(airport.getAirportName(), airport);
        return "SUCCESS";
    }

    public Airport getLargestAirport() {
        Airport largestAirport = null;
        for (Airport airport : airports.values()) {
            if (largestAirport == null || airport.getNoOfTerminals() > largestAirport.getNoOfTerminals()) {
                largestAirport = airport;
            } else if (airport.getNoOfTerminals() == largestAirport.getNoOfTerminals()) {
                if (airport.getAirportName().compareTo(largestAirport.getAirportName()) < 0) {
                    largestAirport = airport;
                }
            }
        }
        return largestAirport;
    }

    public Airport getAirportByName(String airportName) {
        return airports.get(airportName);
    }

    // Other methods related to AirportRepository...
}