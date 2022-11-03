package com.owt.boatapp.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "nameBoat", types = { Boat.class })
public interface BoatProjection {
    public String getNameBoat();
}
