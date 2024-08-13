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
@Table(name = "labatory")
public class Labatory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private final Long id;

    @Column(name = "namelab")
    private final String namelab;

    @ManyToOne
    @JoinColumn(name = "codecityreg")
    private City city;

    public Long getId() {
        return id;
    }

    public String getNamelab() {
        return namelab;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Labatory(Long id, String namelab, City city) {
        this.id = id;
        this.namelab = namelab;
        this.city = city;
    }
}