package com.springfiltro.springfiltro.persistence.entities;




import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "farmacymedicine")
public class FarmacyMedicine {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idmedicinefatrm")
    private Long idFarmacyMedicine;

    @Column(name = "price")
    private BigDecimal price;

    @ManyToOne
    @JoinColumn(name = "idfarmacy")
    private Farmacy farmacy;
    
    public FarmacyMedicine() {
    }

    public Long getIdFarmacyMedicine() {
        return idFarmacyMedicine;
    }


    public void setIdFarmacyMedicine(Long idFarmacyMedicine) {
        this.idFarmacyMedicine = idFarmacyMedicine;
    }


    public BigDecimal getPrice() {
        return price;
    }


    public void setPrice(BigDecimal price) {
        this.price = price;
    }


    public Farmacy getFarmacy() {
        return farmacy;
    }


    public void setFarmacy(Farmacy farmacy) {
        this.farmacy = farmacy;
    }

    

}