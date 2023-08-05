package com.driver.controllers;


import com.driver.model.Airport;
import com.driver.model.City;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import com.driver.services.AirportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@RestController
public class AirportController {
    @Autowired
    private AirportService airportService;

    @PostMapping("/add_airport")
    public String addAirport(@RequestBody Airport airport) {
        return airportService.addAirport(airport);
    }

    @GetMapping("/get-largest-aiport")
    public String getLargestAirportName() {
        Airport largestAirport = airportService.getLargestAirport();
        if (largestAirport == null) {
            return null;
        }
        return largestAirport.getAirportName();
    }

    @GetMapping("/get-shortest-time-travel-between-cities")
    public double getShortestDurationOfPossibleBetweenTwoCities(@RequestParam("fromCity") City fromCity, @RequestParam("toCity") City toCity) {
        return airportService.getShortestDurationOfPossibleBetweenTwoCities(fromCity, toCity);
    }

    @GetMapping("/get-number-of-people-on-airport-on/{date}")
    public int getNumberOfPeopleOn(@PathVariable("date") Date date, @RequestParam("airportName") String airportName) {
        return airportService.getNumberOfPeopleOn(date, airportName);
    }

    @GetMapping("/calculate-fare")
    public int calculateFlightFare(@RequestParam("flightId") Integer flightId) {
        return airportService.calculateFlightFare(flightId);
    }

    @PostMapping("/book-a-ticket")
    public String bookATicket(@RequestParam("flightId") Integer flightId, @RequestParam("passengerId") Integer passengerId) {
        return airportService.bookATicket(flightId, passengerId);
    }

    @PutMapping("/cancel-a-ticket")
    public String cancelATicket(@RequestParam("flightId") Integer flightId, @RequestParam("passengerId") Integer passengerId) {
        return airportService.cancelATicket(flightId, passengerId);
    }

    @GetMapping("/get-count-of-bookings-done-by-a-passenger/{passengerId}")
    public int countOfBookingsDoneByPassengerAllCombined(@PathVariable("passengerId") Integer passengerId) {
        return airportService.countOfBookingsDoneByPassengerAllCombined(passengerId);
    }

    @PostMapping("/add-flight")
    public String addFlight(@RequestBody Flight flight) {
        return airportService.addFlight(flight);
    }

    @GetMapping("/get-aiportName-from-flight-takeoff/{flightId}")
    public String getAirportNameFromFlightId(@PathVariable("flightId") Integer flightId) {
        return airportService.getAirportNameFromFlightId(flightId);
    }

    @GetMapping("/calculate-revenue-collected/{flightId}")
    public int calculateRevenueOfAFlight(@PathVariable("flightId") Integer flightId) {
        return airportService.calculateRevenueOfAFlight(flightId);
    }

    @PostMapping("/add-passenger")
    public String addPassenger(@RequestBody Passenger passenger) {
        return airportService.addPassenger(passenger);
    }
}