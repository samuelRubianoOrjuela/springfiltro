package com.springfiltro.springfiltro.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "region")
public class Region {
    @Id
    @Column(name = "codereg")
    private final String codereg;

    @Column(name = "namereg")
    private final String namecity;

    @ManyToOne
    @JoinColumn(name = "codereg")
    private Country country;

    public String getCodereg() {
        return codereg;
    }

    public String getNamecity() {
        return namecity;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Region(String codereg, String namecity, Country country) {
        this.codereg = codereg;
        this.namecity = namecity;
        this.country = country;
    }
}
