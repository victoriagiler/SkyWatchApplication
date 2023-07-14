package com.Sky_Watch_App.SkyWatch.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Table(name = "flight_data")
public class FlightData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "arr_city")
    private String arr_city;
    @Column(name = "arr_country")
    private String arr_country;
    @Column(name = "arr_name")
    private String arr_name;
    @Column(name = "arr_iata")
    private String arr_iata;
    @Column(name = "arr_time")
    private String arr_time;
    @Column(name = "arr_estimated")
    private String arr_estimated;
    @Column(name = "dep_city")
    private String dep_city;
    @Column(name = "dep_country")
    private String dep_country;
    @Column(name = "dep_name")
    private String dep_name;
    @Column(name = "dep_iata")
    private String dep_iata;
    @Column(name = "dep_time")
    private String dep_time;
    @Column(name = "dep_estimated")
    private String dep_estimated;

    public FlightData() {
    }

    public String getArr_city() {
        return arr_city;
    }

    public void setArr_city(String arr_city) {
        this.arr_city = arr_city;
    }

    public String getArr_country() {
        return arr_country;
    }

    public void setArr_country(String arr_country) {
        this.arr_country = arr_country;
    }

    public String getArr_name() {
        return arr_name;
    }

    public void setArr_name(String arr_name) {
        this.arr_name = arr_name;
    }

    public String getArr_iata() {
        return arr_iata;
    }

    public void setArr_iata(String arr_iata) {
        this.arr_iata = arr_iata;
    }

    public String getArr_time() {
        return arr_time;
    }

    public void setArr_time(String arr_time) {
        this.arr_time = arr_time;
    }

    public String getArr_estimated() {
        return arr_estimated;
    }

    public void setArr_estimated(String arr_estimated) {
        this.arr_estimated = arr_estimated;
    }

    public String getDep_city() {
        return dep_city;
    }

    public void setDep_city(String dep_city) {
        this.dep_city = dep_city;
    }

    public String getDep_country() {
        return dep_country;
    }

    public void setDep_country(String dep_country) {
        this.dep_country = dep_country;
    }

    public String getDep_name() {
        return dep_name;
    }

    public void setDep_name(String dep_name) {
        this.dep_name = dep_name;
    }

    public String getDep_iata() {
        return dep_iata;
    }

    public void setDep_iata(String dep_iata) {
        this.dep_iata = dep_iata;
    }

    public String getDep_time() {
        return dep_time;
    }

    public void setDep_time(String dep_time) {
        this.dep_time = dep_time;
    }

    public String getDep_estimated() {
        return dep_estimated;
    }

    public void setDep_estimated(String dep_estimated) {
        this.dep_estimated = dep_estimated;
    }

    public void setFlight(Flight savedFlight) {
    }

}
