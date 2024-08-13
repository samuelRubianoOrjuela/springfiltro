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
@Table(name = "medicine")
public class Medicine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private final Long id;

    @Column(name = "proceedings")
    private final String proceedings;

    @Column(name = "namemedicine")
    private final String namemedicine;

    @Column(name = "healthregister")
    private final String healthregister;

    @Column(name = "description")
    private final String description;

    @Column(name = "descriptionshort")
    private final String descriptionshort;

    @ManyToOne
    @JoinColumn(name = "codemodeadmin")
    private ModeAdministration ma;

    @ManyToOne
    @JoinColumn(name = "codeap")
    private ActivePrinciple ap;

    @ManyToOne
    @JoinColumn(name = "codeum")
    private UnitMeasurement um;

    @Column(name = "namerol")
    private final String namerol;

    @ManyToOne
    @JoinColumn(name = "codelab")
    private Labatory labatory;

    public Long getId() {
        return id;
    }

    public String getProceedings() {
        return proceedings;
    }

    public String getNamemedicine() {
        return namemedicine;
    }

    public String getHealthregister() {
        return healthregister;
    }

    public String getDescription() {
        return description;
    }

    public String getDescriptionshort() {
        return descriptionshort;
    }

    public ModeAdministration getMa() {
        return ma;
    }

    public void setMa(ModeAdministration ma) {
        this.ma = ma;
    }

    public ActivePrinciple getAp() {
        return ap;
    }

    public void setAp(ActivePrinciple ap) {
        this.ap = ap;
    }

    public UnitMeasurement getUm() {
        return um;
    }

    public void setUm(UnitMeasurement um) {
        this.um = um;
    }

    public String getNamerol() {
        return namerol;
    }

    public Labatory getLabatory() {
        return labatory;
    }

    public void setLabatory(Labatory labatory) {
        this.labatory = labatory;
    }

    public Medicine(Long id, String proceedings, String namemedicine, String healthregister, String description,
            String descriptionshort, ModeAdministration ma, ActivePrinciple ap, UnitMeasurement um, String namerol,
            Labatory labatory) {
        this.id = id;
        this.proceedings = proceedings;
        this.namemedicine = namemedicine;
        this.healthregister = healthregister;
        this.description = description;
        this.descriptionshort = descriptionshort;
        this.ma = ma;
        this.ap = ap;
        this.um = um;
        this.namerol = namerol;
        this.labatory = labatory;
    }

    
}