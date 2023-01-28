package com.sandeep.store.StoreApplication.controller;

import com.sandeep.store.StoreApplication.model.Location;
import com.sandeep.store.StoreApplication.repository.LocationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LocationController {
    @Autowired
    private LocationService locationService;

    @PostMapping("/location")
    public Location addDepartment(@RequestBody Location location) {
        return locationService.saveLocation(location);
    }

    @GetMapping("/location")
    public List<Location> findAll() {
        return locationService.findAll();
    }

    @GetMapping("/location/{id}")
    public Location findLocationById(@PathVariable("id") Long locationId) {
        return locationService.getLocationById(locationId);
    }

    @DeleteMapping("/location/{id}")
    public String deleteByLocationId(@PathVariable("id") Long locationId) {
        locationService.deleteLocationId(locationId);
        return "Deleted successfully";
    }
}
