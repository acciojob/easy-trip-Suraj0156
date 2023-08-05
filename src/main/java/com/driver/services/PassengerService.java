package com.driver.services;

import com.driver.model.Passenger;
import com.driver.repoosetries.PassengerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PassengerService {
    @Autowired
    private  PassengerRepository passengerRepository;


    public String addPassenger(Passenger passenger) {
        return passengerRepository.addPassenger(passenger);
    }

    public Passenger getPassengerById(Integer passengerId) {
        return passengerRepository.getPassengerById(passengerId);
    }

    // Other methods related to PassengerService...
}