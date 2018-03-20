package com.jmasters.demo.model.Evaluation;



import com.jmasters.demo.model.Depot.Information;

import javax.persistence.*;
import java.util.ArrayList;
@Entity
public class Critere {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id ;
    private int designation;
    private float coef;
    @ManyToOne(fetch= FetchType.LAZY)
    @JoinColumn(name="id_grille")
    private Grille grille;

    public Critere() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDesignation() {
        return designation;
    }

    public void setDesignation(int designation) {
        this.designation = designation;
    }

    public float getCoef() {
        return coef;
    }

    public void setCoef(float coef) {
        this.coef = coef;
    }

    public Grille getGrille() {
        return grille;
    }

    public void setGrille(Grille grille) {
        this.grille = grille;
    }
}
