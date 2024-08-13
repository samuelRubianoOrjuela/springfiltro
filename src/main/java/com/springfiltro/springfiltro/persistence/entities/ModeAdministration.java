package com.springfiltro.springfiltro.persistence.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "modeadministration")
public class ModeAdministration {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")    
    private final Long id;

    @Column(name = "descriptionmode")
    private final String descriptionmode;

    public Long getId() {
        return id;
    }

    public String getDescriptionmode() {
        return descriptionmode;
    }

    public ModeAdministration(Long id, String descriptionmode) {
        this.id = id;
        this.descriptionmode = descriptionmode;
    }

}
