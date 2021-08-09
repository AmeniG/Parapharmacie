package com.exadev.test.repo;

import com.exadev.test.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
    List<User> getUsersByNameContains (String name); // mieux que getUserByName or getUserByNameLike
    List<User> getUserByLastName (String lastName);
    User getUserByCin(Long cin);
    User getUserByEmail(String email);
    List<User> getUserByRole (String role);
    List<User> getUserByDestination(String destination);

}
