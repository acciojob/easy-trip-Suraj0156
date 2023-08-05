package com.driver.model;

import java.util.HashMap;
import java.util.Map;

public class PassengerRepository {

    private Map<Integer, Passenger> passengers = new HashMap<>();

    public String addPassenger(Passenger passenger) {
        passengers.put(passenger.getPassengerId(), passenger);
        return "SUCCESS";
    }

    public Passenger getPassengerById(Integer passengerId) {
        return passengers.get(passengerId);
    }

    // Other methods related to PassengerRepository...
}