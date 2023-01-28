package com.sandeep.store.StoreApplication.repository;

import com.sandeep.store.StoreApplication.model.Location;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LocationServiceImpl implements LocationService {

    @Autowired
    private LocationRepository locationRepository;

    @Override
    public Location saveLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public List<Location> findAll() {
        return (List<Location>) locationRepository.findAll();
    }

    @Override
    public Location getLocationById(Long locationId) {
        return locationRepository.findById(locationId).get();
    }

    @Override
    public void deleteLocationId(Long locationId) {
        locationRepository.deleteById(locationId);
    }
}
