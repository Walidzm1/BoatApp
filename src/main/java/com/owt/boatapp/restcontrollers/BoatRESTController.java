package com.owt.boatapp.restcontrollers;

import com.owt.boatapp.service.BoatService;
import com.owt.boatapp.model.Boat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class BoatRESTController {

    @Autowired
    BoatService boatService;

    @RequestMapping(method = RequestMethod.GET)
    public List<Boat> getAllBoats(){ return boatService.getAllBoats(); }

    @RequestMapping(value = "/{idBoat}", method = RequestMethod.GET)
    public Boat getBoatById(@PathVariable("idBoat") Long idBoat){
        return boatService.getBoat(idBoat);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Boat createBoat(@RequestBody Boat boat){
        return boatService.saveBoat(boat);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Boat updateBoat(@RequestBody Boat boat){
        return boatService.updateBoat(boat);
    }

    @RequestMapping(value = "/{idBoat}", method = RequestMethod.DELETE)
    public void deleteBoatById(@PathVariable("idBoat") Long idBoat){
        boatService.deleteBoatById(idBoat);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteBoat(@RequestBody Boat boat){
        boatService.deleteBoatById(boat.getIdBoat());
    }
    @RequestMapping(value = "/boatsByName/{nameBoat}", method = RequestMethod.GET)
    public List<Boat> findByNameBoatContains(@PathVariable("nameBoat") String nameBoat){
        return boatService.findByNameBoatContains(nameBoat);
    }


}
