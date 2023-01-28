package com.sandeep.store.StoreApplication.repository;

import com.sandeep.store.StoreApplication.model.Location;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends CrudRepository<Location, Long> {
}
