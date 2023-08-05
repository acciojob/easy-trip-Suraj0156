package com.driver.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirportController {

    private final AirportService airportService;

    @Autowired
    public AirportController(AirportService airportService) {
        this.airportService = airportService;
    }

    @PostMapping("/add_airport")
    public String addAirport(@RequestBody Airport airport) {
        return airportService.addAirport(airport);
    }

    @GetMapping("/get-largest-aiport")
    public String getLargestAirportName() {
        Airport largestAirport = airportService.getLargestAirport();
        return largestAirport != null ? largestAirport.getAirportName() : null;
    }

    // Other methods related to AirportController...
}