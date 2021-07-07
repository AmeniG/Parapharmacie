package com.exadev.test.repo;

import com.exadev.test.model.Color;
import com.exadev.test.model.Destination;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DestinationRepo extends JpaRepository<Destination,Long> {
    List<Destination> getDestinationsByCity (String City);
    List<Destination> getDestinationsByCountry(String country);
    List<Destination> getDestinationsByPostalCode(int postalCode);

}
