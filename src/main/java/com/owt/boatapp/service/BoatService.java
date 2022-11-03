package com.owt.boatapp.service;

import com.owt.boatapp.model.Boat;

import java.util.Date;
import java.util.List;

public interface BoatService {

    Boat saveBoat(Boat boat);
    Boat updateBoat(Boat boat);
    void deleteBoat(Boat boat);
    void deleteBoatById(Long idBoat);
    Boat getBoat(Long idBoat);
    List<Boat> getAllBoats();

    List <Boat> findByNameBoat(String nameBoat);
    List <Boat> findByNameBoatContains(String nameBoat);
    List <Boat> findByPriceBoat(Double priceBoat);
    List <Boat> findByDescription(String description);
    List <Boat> findByDateNavigation(Date dateNavigation);
    List <Boat> findByNameBoatPriceBoat(String nameBoat, Double priceBoat);
    List <Boat> findByOrderByNameBoatAsc();

}
