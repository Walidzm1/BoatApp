package com.owt.boatapp.service;

import com.owt.boatapp.model.Boat;
import com.owt.boatapp.repos.BoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class BoatServiceImpl implements BoatService{

    @Autowired
    private BoatRepository boatRepository;

    @Override
    public Boat saveBoat(Boat boat) {
        return boatRepository.save(boat);
    }

    @Override
    public Boat updateBoat(Boat boat) {
        return boatRepository.save(boat);
    }

    @Override
    public void deleteBoat(Boat boat) {
        boatRepository.delete(boat);
    }

    @Override
    public void deleteBoatById(Long idBoat) {
        boatRepository.deleteById(idBoat);
    }

    @Override
    public Boat getBoat(Long idBoat) {
        return boatRepository.findById(idBoat).get();
    }

    @Override
    public List<Boat> getAllBoats() {
        return boatRepository.findAll();
    }

    @Override
    public List<Boat> findByNameBoat(String nameBoat) {
        return boatRepository.findByNameBoat(nameBoat);
    }

    @Override
    public List<Boat> findByNameBoatContains(String nameBoat) {
        return boatRepository.findByNameBoatContains(nameBoat);
    }

    @Override
    public List<Boat> findByPriceBoat(Double priceBoat) {
        return boatRepository.findByPriceBoat(priceBoat);
    }

    @Override
    public List<Boat> findByDescription(String description) {
        return boatRepository.findByDescription(description);
    }

    @Override
    public List<Boat> findByDateNavigation(Date dateNavigation) {
        return boatRepository.findByDateNavigation(dateNavigation);
    }

    @Override
    public List<Boat> findByNameBoatPriceBoat(String nameBoat, Double priceBoat) {
        return boatRepository.findByNameBoatPriceBoat(nameBoat, priceBoat);
    }

    @Override
    public List<Boat> findByOrderByNameBoatAsc() {
        return boatRepository.findByOrderByNameBoatAsc() ;
    }
}
