package com.exadev.test.controller;

import com.exadev.test.model.Color;
import com.exadev.test.model.Product;
import com.exadev.test.model.User;
import com.exadev.test.service.ColorService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/color")
@AllArgsConstructor
public class ColorController {
    private final ColorService colorService;
    @GetMapping("")
    public List<Color> getAllColor() {
        return colorService.getAllColor();
    }
    @GetMapping("/{id}")
    public Optional<Color> getColorById(@PathVariable Long id){
        return colorService.getColorById(id);
    }
    @GetMapping("/{name}")
    public Color getColorByName (@PathVariable String name){
        return colorService.getColorByName(name);
    }
    @PostMapping("")
    public Color createColor (@RequestBody Color color){
        return colorService.createColor(color);
    }
    @PutMapping("")
    public Color update (@RequestBody Color color){
        return colorService.update(color);
    }
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id ){
        colorService.deleteById(id);
    }

}
