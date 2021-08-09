package com.exadev.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data // sa remplace get code , get price , get amounts etc et set
@Entity// pour rendre la commande sous forme de tableau
@AllArgsConstructor
@NoArgsConstructor
public class CustomerOrder {//ne l'appelle pas Order car order est un mot clé dans spring
    @Id//pour qu'il soit clé primaire le id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//pour que l'id incremente automatiquement
    private Long id;
    @Column(unique = true) // pour qu'il soit unique le code
    private Long code;

    private int price;// tjrs prend price int

    @ManyToOne // many refere sur costomerOrder cad plusieurs commandes pour 1 user w ki ta3mel houni manytoone moch lezim tzid ta3mel onetomany fi user
    private User user;
    @OneToMany
    private List<OrderedAmountPreProduct> orderedAmountPreProducts;
    private String destination;

}
// pour chaque classe met @id @GeneratedValue et private Long id
// si nasna3 une classe dans model et mana3mlelhech relation b table(classe) o5ra (cad b heki onetomany wala manytoone..) ou classe o5ra mana3melch fiha relation m3a heki l classe li kont na7kilik 3liha milawel donc nwali nifsa5ha w barrah cette classe par ce que ma3andha 7ata relation b 7ata classe o5ra et c'est pour cela kont san3a classe destination 3alawel ama fsa5tha 5ater ma3malet 7ata relation b 7ata classe o5ra.