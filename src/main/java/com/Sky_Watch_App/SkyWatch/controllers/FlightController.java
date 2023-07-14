package com.Sky_Watch_App.SkyWatch.controllers;

import com.Sky_Watch_App.SkyWatch.entities.FlightData;
import com.Sky_Watch_App.SkyWatch.entities.Flight;
import com.Sky_Watch_App.SkyWatch.repositories.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/flights")
public class FlightController {
    private FlightRepository flightRepository;

    @Autowired
    public FlightController(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    @PostMapping
    public ResponseEntity<String> receiveFlightData(@RequestBody FlightData flightData) {

        // Access specific properties from the flight data
        String arrivalCity = flightData.getArr_city();
        String arrivalCountry = flightData.getArr_country();
        String arrivalName = flightData.getArr_name();
        String arrivalIata = flightData.getArr_iata();
        String arrivalTime = flightData.getArr_time();
        String arrivalEstimated = flightData.getArr_estimated();

        String departureCity = flightData.getDep_city();
        String departureCountry = flightData.getDep_country();
        String departureName = flightData.getDep_name();
        String departureIata = flightData.getDep_iata();
        String departureTime = flightData.getDep_time();
        String departureEstimated = flightData.getDep_estimated();

        // Create a Flight entity object to persist in the database
        Flight flight = new Flight();
        flight.setArrCity(arrivalCity);
        flight.setArrCountry(arrivalCountry);
        flight.setArrName(arrivalName);
        flight.setArrIata(arrivalIata);
        flight.setArrTime(arrivalTime);
        flight.setArrEstimated(arrivalEstimated);

        flight.setDepCity(departureCity);
        flight.setDepCountry(departureCountry);
        flight.setDepName(departureName);
        flight.setDepIata(departureIata);
        flight.setDepTime(departureTime);
        flight.setDepEstimated(departureEstimated);

        // Save the flight data to the database
        flightRepository.save(flight);

        // Return a response indicating the success or failure of the operation
        return ResponseEntity.ok("Flight data received and saved successfully");
    }
}
