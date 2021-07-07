package com.exadev.test.service;

import com.exadev.test.model.Destination;
import com.exadev.test.model.Product;
import com.exadev.test.repo.DestinationRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class DestinationService {
    private final DestinationRepo destinationRepo;
    public Destination createDestination(Destination destination){
        return destinationRepo.save(destination) ;
    }
    public List<Destination> getDestinationByCountry (String country){
        return destinationRepo.getDestinationsByCountry(country);
    }
    public List<Destination> getDestinationByPostalCode (int postalCode){
        return destinationRepo.getDestinationsByPostalCode(postalCode);
    }
    public Optional<Destination> getDestinationById(Long id){
        return destinationRepo.findById(id);
    }
    public List<Destination> getDestinationByCity(String city){
        return destinationRepo.getDestinationsByCity(city);
    }
    public List<Destination> getAllDestination(){
        return destinationRepo.findAll();
    }
    public void deleteById(Long id){
        destinationRepo.deleteById(id);
    }
    public Destination update(Destination destination){
        return destinationRepo.save(destination);
    }
}
