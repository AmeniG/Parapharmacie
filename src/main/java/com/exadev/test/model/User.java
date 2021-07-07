package com.exadev.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data // comme ca la na3mel la get la set grace a cette ligne
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long cin;
    private String name;
    private String lastName;
    private String pass;
    private String email;
    private String role;
    @ManyToOne
    private Destination destination;


}
