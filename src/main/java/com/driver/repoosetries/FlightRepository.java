package com.driver.repoosetries;

import com.driver.model.Flight;

import java.util.HashMap;
import java.util.Map;

public class FlightRepository {

    private Map<Integer, Flight> flights = new HashMap<>();

    public String addFlight(Flight flight) {
        flights.put(flight.getFlightId(), flight);
        return "SUCCESS";
    }

    public Flight getFlightById(Integer flightId) {
        return flights.get(flightId);
    }

    // Other methods related to FlightRepository...
}