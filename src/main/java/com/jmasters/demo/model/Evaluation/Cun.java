package com.jmasters.demo.model.Evaluation;



import com.jmasters.demo.model.Depot.Dossier;
import com.jmasters.demo.model.Evaluation.Grille;
import com.jmasters.demo.model.Users.MembreCun;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Set;

@Entity
public class Cun {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  int id;

    @OneToMany(mappedBy = "cun")
    private Set<MembreCun> membreCuns;

    @OneToMany(mappedBy = "cun")
    private Set<Dossier> dossiers;


    public Set<MembreCun> getMembreCuns() {
        return membreCuns;
    }

    public void setMembreCuns(Set<MembreCun> membreCuns) {
        this.membreCuns = membreCuns;
    }

    public Cun() {
    }


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "grille_id")
    private Grille grille;

    public Grille getGrille() {
        return grille;
    }

    public void setGrille(Grille grille) {
        this.grille = grille;
    }
}
