package com.springfiltro.springfiltro.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "city")
public class City {
    @Id
    @Column(name = "codecity")
    private String codecity;

    @Column(name = "namecity")
    private String namecity;

    @ManyToOne
    @JoinColumn(name = "codereg")
    private Region region;

    public String getCodecity() {
        return codecity;
    }

    public String getNamecity() {
        return namecity;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }
    
}
