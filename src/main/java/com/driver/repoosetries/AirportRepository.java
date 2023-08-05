package com.driver.repoosetries;

import com.driver.model.Airport;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class AirportRepository {

    private final List<Airport> airports = new ArrayList<>();

    public String addAirport(Airport airport) {
        airports.add(airport);
        return "SUCCESS";
    }

    public Airport getLargestAirport() {
        Airport largestAirport = null;
        int maxTerminals = 0;
        for (Airport airport : airports) {
            if (airport.getNoOfTerminals() > maxTerminals) {
                maxTerminals = airport.getNoOfTerminals();
                largestAirport = airport;
            } else if (airport.getNoOfTerminals() == maxTerminals) {
                // If there's a tie in the number of terminals, choose the lexicographically smallest airport name
                if (largestAirport == null || airport.getAirportName().compareTo(largestAirport.getAirportName()) < 0) {
                    largestAirport = airport;
                }
            }
        }
        return largestAirport;
    }

    // Other methods related to AirportRepository...
}