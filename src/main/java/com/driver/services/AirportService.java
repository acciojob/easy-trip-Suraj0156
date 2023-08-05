package com.driver.services;

import com.driver.model.Airport;
import com.driver.model.City;
import com.driver.model.Flight;
import com.driver.model.Passenger;
import com.driver.repoosetries.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public interface AirportService {

    String addAirport(Airport airport);

    Airport getLargestAirport();

    double getShortestDurationOfPossibleBetweenTwoCities(City fromCity, City toCity);

    int getNumberOfPeopleOn(Date date, String airportName);

    int calculateFlightFare(Integer flightId);

    String bookATicket(Integer flightId, Integer passengerId);

    String cancelATicket(Integer flightId, Integer passengerId);

    int countOfBookingsDoneByPassengerAllCombined(Integer passengerId);

    String addFlight(Flight flight);

    String getAirportNameFromFlightId(Integer flightId);

    int calculateRevenueOfAFlight(Integer flightId);

    String addPassenger(Passenger passenger);
}