package com.springfiltro.springfiltro.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "farmacy")
public class Farmacy {
    @Id
    @Column(name = "idfarmacy")    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private final String idfarmacy;

    @Column(name = "namefarmacy")
    private final String namefarmacy;

    @Column(name = "addressfarmacy")
    private final String addressfarmacy;

    @Column(name = "lon")
    private final Float lon;

    @Column(name = "latfarmacy")
    private final Float latfarmacy;

    @ManyToOne
    @JoinColumn(name = "codecity")
    private City city;

    @Column(name = "logofarmacy")
    private final String logofarmacy;

    public String getIdfarmacy() {
        return idfarmacy;
    }

    public String getNamefarmacy() {
        return namefarmacy;
    }

    public String getAddressfarmacy() {
        return addressfarmacy;
    }

    public Float getLon() {
        return lon;
    }

    public Float getLatfarmacy() {
        return latfarmacy;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public String getLogofarmacy() {
        return logofarmacy;
    }

    public Farmacy(String idfarmacy, String namefarmacy, String addressfarmacy, Float lon, Float latfarmacy, City city,
            String logofarmacy) {
        this.idfarmacy = idfarmacy;
        this.namefarmacy = namefarmacy;
        this.addressfarmacy = addressfarmacy;
        this.lon = lon;
        this.latfarmacy = latfarmacy;
        this.city = city;
        this.logofarmacy = logofarmacy;
    }


}
