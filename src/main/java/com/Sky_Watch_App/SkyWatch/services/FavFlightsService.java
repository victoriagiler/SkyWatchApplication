package com.Sky_Watch_App.SkyWatch.services;

import com.Sky_Watch_App.SkyWatch.repositories.FavFlightsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavFlightsService {

    @Autowired
    FavFlightsRepository favFlightsRepository;
}
//need to add logic for adding FavFlights from flights