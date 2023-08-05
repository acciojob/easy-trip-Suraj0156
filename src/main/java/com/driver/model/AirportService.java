package com.driver.model;

public class AirportService {
    private final AirportRepository airportRepository;

    public AirportService(AirportRepository airportRepository) {
        this.airportRepository = airportRepository;
    }

    public String addAirport(Airport airport) {
        return airportRepository.addAirport(airport);
    }

    public Airport getLargestAirport() {
        return airportRepository.getLargestAirport();
    }

    public Airport getAirportByName(String airportName) {
        return airportRepository.getAirportByName(airportName);
    }

    // Other methods related to AirportService...
}