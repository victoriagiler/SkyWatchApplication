package com.Sky_Watch_App.SkyWatch.entities;

import jakarta.persistence.Column;
import jakarta.persistence.*;

@Entity
@Table(name = "flight")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "arr_city")
    private String arrCity;
    @Column(name = "arr_country")
    private String arrCountry;
    @Column(name = "arr_name")
    private String arrName;
    @Column(name = "arr_iata")
    private String arrIata;
    @Column(name = "arr_time")
    private String arrTime;
    @Column(name = "arr_estimated")
    private String arrEstimated;
    @Column(name = "dep_city")
    private String depCity;
    @Column(name = "dep_country")
    private String depCountry;
    @Column(name = "dep_name")
    private String depName;
    @Column(name = "dep_iata")
    private String depIata;
    @Column(name = "dep_time")
    private String depTime;
    @Column(name = "dep_estimated")
    private String depEstimated;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getArrCity() {
        return arrCity;
    }

    public void setArrCity(String arrCity) {
        this.arrCity = arrCity;
    }

    public String getArrCountry() {
        return arrCountry;
    }

    public void setArrCountry(String arrCountry) {
        this.arrCountry = arrCountry;
    }

    public String getArrName() {
        return arrName;
    }

    public void setArrName(String arrName) {
        this.arrName = arrName;
    }

    public String getArrIata() {
        return arrIata;
    }

    public void setArrIata(String arrIata) {
        this.arrIata = arrIata;
    }

    public String getArrTime() {
        return arrTime;
    }

    public void setArrTime(String arrTime) {
        this.arrTime = arrTime;
    }

    public String getArrEstimated() {
        return arrEstimated;
    }

    public void setArrEstimated(String arrEstimated) {
        this.arrEstimated = arrEstimated;
    }

    public String getDepCity() {
        return depCity;
    }

    public void setDepCity(String depCity) {
        this.depCity = depCity;
    }

    public String getDepCountry() {
        return depCountry;
    }

    public void setDepCountry(String depCountry) {
        this.depCountry = depCountry;
    }

    public String getDepName() {
        return depName;
    }

    public void setDepName(String depName) {
        this.depName = depName;
    }

    public String getDepIata() {
        return depIata;
    }

    public void setDepIata(String depIata) {
        this.depIata = depIata;
    }

    public String getDepTime() {
        return depTime;
    }

    public void setDepTime(String depTime) {
        this.depTime = depTime;
    }

    public String getDepEstimated() {
        return depEstimated;
    }

    public void setDepEstimated(String depEstimated) {
        this.depEstimated = depEstimated;
    }

    public void setFlightData(FlightData savedFlightData) {
    }
}
