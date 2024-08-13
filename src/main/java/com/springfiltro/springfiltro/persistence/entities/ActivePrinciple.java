package com.springfiltro.springfiltro.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "activeprinciple")
public class ActivePrinciple {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idap")
    private final Long idap;

    @Column(name = "nameap")
    private final String nameap;

    public Long getIdap() {
        return idap;
    }

    public String getNameap() {
        return nameap;
    }

    public ActivePrinciple(Long idap, String nameap) {
        this.idap = idap;
        this.nameap = nameap;
    }

}