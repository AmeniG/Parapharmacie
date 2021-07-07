package com.exadev.test.service;

import com.exadev.test.model.Brand;
import com.exadev.test.model.Color;
import com.exadev.test.model.User;
import com.exadev.test.repo.ColorRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ColorService {
    private final ColorRepo colorRepo;
    public Color createColor (Color color){
        return colorRepo.save(color);
    }
    public Color getColorByName (String color){
        return colorRepo.getColorByName(color);
    }
    public Optional<Color> getColorById (Long id){
        return colorRepo.findById(id);
    }
    public List<Color> getAllColor (){
        return colorRepo.findAll();
    }
    public Color update(Color color){
        return colorRepo.save(color);
    }
    public void deleteById(Long id){
        colorRepo.deleteById(id);
    }

}
