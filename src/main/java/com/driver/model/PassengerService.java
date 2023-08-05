package com.driver.model;

public class PassengerService {  private final PassengerRepository passengerRepository;

    public PassengerService(PassengerRepository passengerRepository) {
        this.passengerRepository = passengerRepository;
    }

    public String addPassenger(Passenger passenger) {
        return passengerRepository.addPassenger(passenger);
    }

    public Passenger getPassengerById(Integer passengerId) {
        return passengerRepository.getPassengerById(passengerId);
    }

    // Other methods related to PassengerService...
}