package com.exadev.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.print.attribute.standard.Destination;
import java.util.Collection;

@Entity
@Data // comme ca la na3mel la get la set l 7ata atribut mili declarithom m3a l classe sauf les attribut kima isAccountNonExpired , isAccountNonLocked ... ili 3andhom 3ale9a b l'implementation de UserDetails
@AllArgsConstructor
@NoArgsConstructor
public class User implements UserDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private Long cin;
    private String name;
    private String lastName;
    private String pass;
    private String email;
    private String destination;
    private String role;
    private Boolean isAccountNonExpired ;
    private Boolean isAccountNonLocked;
    private Boolean isCredentialsNonExpired ;
    private Boolean isEnabled;
    // ili jey ba3ed l kol se genere automatiquement quand je mets implements UserDetails donc juste ena ba3ed nzid heki private boolean is.. w barrah
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }


    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return email;// je peux mettre de lieu de email name or lastname ou cin par exemple
    }



    @Override
    public boolean isAccountNonExpired() {
        return isAccountNonExpired;
    }//au lieu de dire getaccountnonexpired ki ykoun bolean n9oulou isaccountnonexpired cad fi blaset get is

    @Override
    public boolean isAccountNonLocked() {
        return isAccountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return isCredentialsNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }
}




