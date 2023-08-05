package com.driver.controllers;

import com.driver.model.Passenger;
import com.driver.services.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerController {



    @Autowired
    private  PassengerService passengerService;



    @PostMapping("/add-passenger")
    public String addPassenger(@RequestBody Passenger passenger) {
        return passengerService.addPassenger(passenger);
    }

    // Other methods related to PassengerController...
}