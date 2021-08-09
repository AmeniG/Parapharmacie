package com.exadev.test.controller;


import com.exadev.test.model.User;
import com.exadev.test.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/user")
@AllArgsConstructor
public class UserController {
    private final UserService userService;
    @GetMapping("")
    public List<User> getAllUsers() {
        return userService.getAllUser();
    }
    @GetMapping("/{id}")
    public Optional<User>findUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }
    @GetMapping("/name/{name}")
    public List<User> findUserByName(@PathVariable String name){
        return userService.getUserByName(name);   }
    @GetMapping("/lastname/{lastName}")
    public List<User> findUserByLastName(@PathVariable String lastName){
        return userService.getUserByLastName(lastName);
    }
    @GetMapping("/cin/{cin}")
    public User findUserByCin (@PathVariable Long cin){
        return userService.getUserByCin(cin);
    }
    @PostMapping("")
    public User createUser (@RequestBody User user){
        return userService.createUser(user);
    }
    @GetMapping("/role/{Role}")
    public List<User> getUserByRole(@PathVariable String role){
        return userService.getUserByRole(role);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id ){
        userService.deleteById(id);
    }
    @PutMapping("")
    public User update (@RequestBody User user){
        return userService.update(user);
    }
    @GetMapping("/{destination}")
    public List<User> getUserByDestination (@PathVariable String destination){
        return userService.getUserByDestination(destination);
    }




}
