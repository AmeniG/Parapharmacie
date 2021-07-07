package com.exadev.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity // pour rendre la destination sous forme de tableau
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Destination {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id ;
    private String city;
    @Column(unique = true)
    private int postalCode; //1ere caractere du 1eremot min et 1ere carac du 2eme mot maj
    private String country;
    private String road;


}
