package com.exadev.test.service;

import com.exadev.test.model.User;
import com.exadev.test.repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class UserService {
    private final UserRepo userRepo;
    public User createUser (User user){
        return userRepo.save(user);
    }
    public List<User> getUserByName(String name){
        return userRepo.getUsersByNameContains(name);
    }
    public List<User> getUserByLastName (String lastName){
        return userRepo.getUserByLastName(lastName);
    }
    public User getUserByCin (Long cin){
        return userRepo.getUserByCin(cin);
    }
    public List<User> getUserByRole (String role){
        return userRepo.getUserByRole(role);
    }
    public List<User> getUserByDestination (String destination){
        return userRepo.getUserByDestination(destination);
    }

    public Optional<User>  getUserById (Long id){
        return userRepo.findById(id);
    }
    public void deleteById(Long id){
         userRepo.deleteById(id);
    }
    public User update(User user){
        return userRepo.save(user);
    }
    public List<User> getAllUser(){
        return userRepo.findAll();
    }



}
// la 1ere lettre de fonction doit etre miniscule dans spring