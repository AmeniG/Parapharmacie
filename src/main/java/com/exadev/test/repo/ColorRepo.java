package com.exadev.test.repo;

import com.exadev.test.model.Color;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ColorRepo extends JpaRepository<Color,Long> {
    Color getColorByName (String name);


}
