package com.owt.boatapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Boat {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long idBoat;
    private String nameBoat;
    private Double priceBoat;
    private Date dateNavigation;

    private String description;

    /*
    public Boat() {
        super();
    }
    public Boat(String nameBoat, Double priceBoat, Date dateNavigation, String description) {
        super();
        this.nameBoat = nameBoat;
        this.priceBoat = priceBoat;
        this.dateNavigation = dateNavigation;
        this.description = description;
    }

    public Long getIdBoat() {
        return idBoat;
    }

    public void setIdBoat(Long idBoat) {
        this.idBoat = idBoat;
    }

    public String getNameBoat() {
        return nameBoat;
    }

    public void setNameBoat(String nameBoat) {
        this.nameBoat = nameBoat;
    }

    public Double getPriceBoat() {
        return priceBoat;
    }

    public void setPriceBoat(Double priceBoat) {
        this.priceBoat = priceBoat;
    }

    public Date getDateNavigation() {
        return dateNavigation;
    }

    public void setDateNavigation(Date dateNavigation) {
        this.dateNavigation = dateNavigation;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Boat{" +
                "idBoat=" + idBoat +
                ", nameBoat='" + nameBoat + '\'' +
                ", priceBoat=" + priceBoat +
                ", dateNavigation=" + dateNavigation +
                ", description='" + description + '\'' +
                '}';
    }
    */
}
