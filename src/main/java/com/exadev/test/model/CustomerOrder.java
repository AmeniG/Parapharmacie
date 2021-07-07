package com.exadev.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder {//ne l'appelle pas Order car order est un mot clé dans spring
    @Id//pour qu'il soit clé primaire le id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//pour que l'id incremente automatiquement
    private Long id;
    @Column(unique = true) // pour qu'il soit unique le code
    private Long code;
    private int qte;
    private int price;// tjrs prend price int

    @ManyToOne // many refere sur costomerOrder cad plusieurs commandes pour 1 user
    private User user;
    @OneToMany
    private List<Product> product;
    @ManyToOne
    private Destination destination;

}
// pour chaque classe met @id @GeneratedValue et private Long id