package com.owt.boatapp.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import com.owt.boatapp.model.Boat;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Date;
import java.util.List;

@RepositoryRestResource (path = "rest")
@CrossOrigin("*")
public interface BoatRepository extends JpaRepository<Boat, Long> {

    List <Boat> findByNameBoat(String nameBoat);
    List <Boat> findByNameBoatContains(String nameBoat);
    List <Boat> findByPriceBoat(Double priceBoat);
    List <Boat> findByDescription(String description);
    List <Boat> findByDateNavigation(Date dateNavigation);
    @Query("select b from Boat b where b.nameBoat like %?1 and b.priceBoat >= ?2")
    List <Boat> findByNameBoatPriceBoat(@Param("name") String nameBoat, @Param("price") Double priceBoat);
    List <Boat> findByOrderByNameBoatAsc();
}


