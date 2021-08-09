package com.exadev.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String code ;

    private int price ;
    private String name;
    private int stock;
    private String color;
    private String brand;
    private String expirationDate ;//1ere caractere du 1eremot min et 1ere carac du 2eme mot maj


//    @ManyToOne
//    private Color color;
//    @ManyToOne
//    private Brand brand;
    //  fais manytoone 5ir mat7ot onetomany dans la classe color  car c'est plus logique d'etablir la relation entre couleur et produit dans classe product que color.(de meme pour brand)

}


// je peux enlever manytoone private Color color et enlever la classe color et nrod l color attribut w barrah moch table n7ot cad private string color
//de meme pour brand ena juste 3malthom fi classe a part(brand et color) bech nkaber l projet et c'est possible ini n5arejhom fi classe wa7edhom moch kima prix mathalin manajamch n5arjou 5ater l'intervalle mte3 prix kbir(l'ensemble R+) ama c'est pas obligatoire ini n5arejhom fi classe a part juste bech nkaber l projet 3malt hakek w barrah heka 3lech bech nimchi ba3d masna3thom yojber rabi nrodhom des commentaires les 2 classes hethom w barrah wala nifsa5hom carrement 5ater zeyed nkabar fih l projet azyad donc je vais enlever manytoone private Color color et enlever la classe color(nrodhom fi chakl commentaire ou bien ifsa5 w barrah) et nrod l color attribut w barrah(de meme pour brand)
