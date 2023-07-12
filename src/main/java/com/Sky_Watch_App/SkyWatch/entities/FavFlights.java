package com.Sky_Watch_App.SkyWatch.entities;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "favFlights")
public class FavFlights {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(targetEntity = Flight.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "flight_id")
    private Flight flight;
    // need to find a way in which this can be connected with flight

    @Column(name="created_date")
    private Date createdDate;

    public FavFlights() {
    }

    public FavFlights(Integer id, Flight flight, Date createdDate) {
        this.id = id;
        this.flight = flight;
        this.createdDate = createdDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }
}
