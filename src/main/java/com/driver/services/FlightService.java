package com.driver.services;

import com.driver.model.City;
import com.driver.model.Flight;
import com.driver.repoosetries.FlightRepository;

public class FlightService {private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public String addFlight(Flight flight) {
        return flightRepository.addFlight(flight);
    }

    public Flight getFlightById(Integer flightId) {
        return flightRepository.getFlightById(flightId);
    }

    public double getShortestDurationOfPossibleBetweenTwoCities(City fromCity, City toCity) {
        // Implement the logic to find the shortest duration of a flight between two cities
        return 0;
    }

    // Other methods related to FlightService...
}