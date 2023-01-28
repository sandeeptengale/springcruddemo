package com.sandeep.store.StoreApplication.repository;

import com.sandeep.store.StoreApplication.model.Location;

import java.util.List;

public interface LocationService {
    Location saveLocation(Location location);
    List<Location> findAll();
    Location getLocationById(Long locationId);
    void deleteLocationId(Long locationId);
}
