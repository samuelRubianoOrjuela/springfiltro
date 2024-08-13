package com.springfiltro.springfiltro.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @Column(name = "codecountry")
    private final String codecountry;

    @Column(name = "namecountry")
    private final String namecountry;

    
    public String getCodecountry() {
        return codecountry;
    }


    public String getNamecountry() {
        return namecountry;
    }


    public Country(String codecountry, String namecountry) {
        this.codecountry = codecountry;
        this.namecountry = namecountry;
    }
}
