package com.springfiltro.springfiltro.persistence.entities;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idcustomer")
    private final Long idcustomer;

    @Column(name = "namecustomer")
    private final String namecustomer;

    @Column(name = "lastnamecustomer")
    private final String lastnamecustomer;

    @ManyToOne
    @JoinColumn(name = "codecitycustomer")
    private City city;

    @Column(name = "emailcustomer")
    private final String emailcustomer;

    @Column(name = "birthdate")
    private final Date birthdate;

    @Column(name = "lon")
    private final Float lon;

    @Column(name = "latitud")
    private final Float latitud;

    
    public Long getIdcustomer() {
        return idcustomer;
    }


    public String getNamecustomer() {
        return namecustomer;
    }


    public String getLastnamecustomer() {
        return lastnamecustomer;
    }


    public City getCity() {
        return city;
    }


    public void setCity(City city) {
        this.city = city;
    }


    public String getEmailcustomer() {
        return emailcustomer;
    }


    public Date getBirthdate() {
        return birthdate;
    }


    public Float getLon() {
        return lon;
    }


    public Float getLatitud() {
        return latitud;
    }


    public Customer(Long idcustomer, String namecustomer, String lastnamecustomer, City city,
            String emailcustomer, Date birthdate, Float lon, Float latitud) {
        this.idcustomer = idcustomer;
        this.namecustomer = namecustomer;
        this.lastnamecustomer = lastnamecustomer;
        this.city = city;
        this.emailcustomer = emailcustomer;
        this.birthdate = birthdate;
        this.lon = lon;
        this.latitud = latitud;
    }

    

}