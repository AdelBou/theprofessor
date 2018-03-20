package com.jmasters.demo.model.Users;


import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;


import java.util.Set;

import static javax.persistence.GenerationType.SEQUENCE;

/**
 * @author cfsc
 * @version 1.0
 * @created 07-mars-2018 14:26:41
 */


@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public  abstract  class Compte {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }








    @OneToOne(mappedBy = "compte")
    private Utilisateur utilisateur;

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Compte() {
    }



}