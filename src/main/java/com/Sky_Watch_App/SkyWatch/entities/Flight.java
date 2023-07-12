package com.Sky_Watch_App.SkyWatch.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Integer id;

    @Column(nullable = false)
    private String userId;
    @Column(nullable = false)
    private String flightId;

    private String flightRoute;

    private Date flightDate;

    private String flightPlane;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFlightId() {
        return flightId;
    }

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public String getFlightRoute() {
        return flightRoute;
    }

    public void setFlightRoute(String flightRoute) {
        this.flightRoute = flightRoute;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public String getFlightPlane() {
        return flightPlane;
    }

    public void setFlightPlane(String flightPlane) {
        this.flightPlane = flightPlane;
    }

    public void setFavflight(FavFlights favFlights) {
    }
}
