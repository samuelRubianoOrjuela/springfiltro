package com.springfiltro.springfiltro.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "unitmeasurement")
public class UnitMeasurement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idum")    
    private final Long idum;

    @Column(name = "nameum")
    private final String nameum;

    public Long getIdum() {
        return idum;
    }

    public String getNameum() {
        return nameum;
    }

    public UnitMeasurement(Long idum, String nameum) {
        this.idum = idum;
        this.nameum = nameum;
    }
}