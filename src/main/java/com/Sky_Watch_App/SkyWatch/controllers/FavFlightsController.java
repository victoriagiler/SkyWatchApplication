package com.Sky_Watch_App.SkyWatch.controllers;

import com.Sky_Watch_App.SkyWatch.services.FavFlightsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/favFlights")
public class FavFlightsController {
    @Autowired
    FavFlightsService favFlightsService;

    // save flight as FavFlights

    //get all flights saved in FavFlights
}
