package com.driver.services;

import com.driver.model.Airport;
import com.driver.repoosetries.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AirportService {

    @Autowired


    private AirportRepository airportRepository;


    public String addAirport(Airport airport) {
        return airportRepository.addAirport(airport);
    }

    public Airport getLargestAirport() {
        return airportRepository.getLargestAirport();
    }

    // Other methods related to AirportService...
}