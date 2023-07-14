package com.Sky_Watch_App.SkyWatch.repositories;

import com.Sky_Watch_App.SkyWatch.entities.Flight;
import org.springframework.data.repository.CrudRepository;

public interface FlightRepository extends CrudRepository<Flight, Long> {
    // Add custom query methods if needed
}



//import org.springframework.data.jpa.repository.JpaRepository;
//        import org.springframework.stereotype.Repository;
//
//@Repository
//public interface FlightRepository extends JpaRepository<Flight, Long> {
//    // Add custom query methods if needed
//}
