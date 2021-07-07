package com.exadev.test.controller;

import com.exadev.test.model.Destination;
import com.exadev.test.model.Product;
import com.exadev.test.service.DestinationService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@RestController
@RequestMapping("api/destination")
public class DestinationController {
    private final DestinationService destinationService;
    @GetMapping("")
    public List<Destination> getAllDestination(){
        return destinationService.getAllDestination();

    }
    @GetMapping("/{id}")
    public Optional<Destination> getDestinationById(@PathVariable Long id){
        return destinationService.getDestinationById(id);
    }
    @GetMapping("/{city}")
    public List<Destination> getDestinationByCity(@PathVariable String city) {
        return destinationService.getDestinationByCity(city);}
    @GetMapping("/{postalCode}")
    public List<Destination> getDestinationByPostalCode (@PathVariable int postalCode){
        return destinationService.getDestinationByPostalCode(postalCode);
        }
    @GetMapping("/{country}")
    public List<Destination> getDestinationByCountry (@PathVariable String country){
        return destinationService.getDestinationByCountry(country);
    }
    @PostMapping("")
    public Destination createDestination (@RequestBody Destination destination){
        return destinationService.createDestination(destination);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id ){
        destinationService.deleteById(id);
    }
    @PutMapping("")
    public Destination update (@RequestBody Destination destination){
        return destinationService.update(destination);
    }

}