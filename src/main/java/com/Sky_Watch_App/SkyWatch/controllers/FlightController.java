package com.Sky_Watch_App.SkyWatch.controllers;

import com.Sky_Watch_App.SkyWatch.entities.Flight;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;

@RestController
@RequestMapping("/flights")
public class FlightController {
private final FlightService flightService;

    public FlightController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Flight>> findAllFlights(){
        return ResponseEntity.ok(flightService.findAllFlights());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Flight> getFlightById(@PathVariable Integer id){
        return ResponseEntity.ok(flightService.getFlightById(id));
    }

    @PostMapping
    public ResponseEntity<Flight> addFlight(@RequestBody Flight flight){
        Flight savedFlight = flightService.addFlight(flight);

        URI location = ServletUriComponentsBuilder.fromCurrentContextPath()
                .path("/flights/{id}")
                .buildAndExpand(savedFlight.getId())
                .toUri();

        return ResponseEntity.created(location).body(flight);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Flight>  updatedFlight(@PathVariable Integer id, @RequestBody Flight updates){
        return ResponseEntity.ok(flightService.updateFlight(id, updates));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<HashMap<String, Object>> deleteFlight(@PathVariable Integer id){

        HashMap<String, Object> responseMap = flightService.deleteFlight(id);

        if(responseMap.get("flightInfo") == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(responseMap);
        }

        return ResponseEntity.ok(responseMap);
    }
}
