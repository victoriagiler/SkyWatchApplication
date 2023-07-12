package com.Sky_Watch_App.SkyWatch.repositories;

import com.Sky_Watch_App.SkyWatch.entities.FavFlights;
import org.springframework.data.repository.CrudRepository;

public interface FavFlightsRepository extends CrudRepository <FavFlights, Integer> {
}
