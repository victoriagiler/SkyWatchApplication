package com.Sky_Watch_App.SkyWatch.services;

import com.Sky_Watch_App.SkyWatch.entities.FavFlights;
import com.Sky_Watch_App.SkyWatch.entities.Flight;
import com.Sky_Watch_App.SkyWatch.repositories.FlightRepository;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.HashMap;
import java.util.Optional;

@Service
public class FlightService {
    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) { this.flightRepository = flightRepository;
    }
    @Transactional
    public Iterable<Flight> findAllFlights(){
        Iterable<Flight> allFlights = flightRepository.findAll();
        return allFlights;
    }

    public Flight getFlightById(Integer id){
        Optional<Flight> optionalFlight = flightRepository.findById(String.valueOf(id));

        if(optionalFlight.isEmpty()){
            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Flight not found with id: " + id);
        }
//        gets the flight out of the optional container and returns it to the controller
        return optionalFlight.get();
    }

    public Flight addFlight(Flight flight){
        return flightRepository.save(flight);
    }

    public Flight updateFlight(Integer id, Flight updates){
        Flight flightToUpdate = getFlightById(id);

        if(!updates.getFlightId().isEmpty()){
            flightToUpdate.setFlightId(updates.getFlightId());
        }
        if(updates.getFlightRoute() != null){
            flightToUpdate.setFlightRoute(updates.getFlightRoute());
        }
        if(updates.getFlightDate() != null){
            flightToUpdate.setFlightDate(updates.getFlightDate());
        }
        if(updates.getFlightPlane() != null){
            flightToUpdate.setFlightPlane(updates.getFlightPlane());
        }

        return flightRepository.save(flightToUpdate);
    }

    public HashMap<String, Object> deleteFlight(Integer id){
        HashMap<String, Object> responseMap = new HashMap<>();

        Optional<Flight> optionalFlight = flightRepository.findById(String.valueOf(id));

        if(optionalFlight.isEmpty()){
//            if the flight does not exist, this is what will be returned
            responseMap.put("wasDeleted", false);
            responseMap.put("flightInfo", null);
            responseMap.put("Message", "Flight not found with id: " + id);
            return responseMap;
        }
        flightRepository.deleteById(String.valueOf(id));
        responseMap.put("wasDeleted", true);
        responseMap.put("flightInfo", optionalFlight.get());

        return responseMap;
    }

    public void handleFlightEvent(Flight flight, FavFlights favFlights){
        flight.setFavflight(favFlights);
        flightRepository.save(flight);
    }
}
