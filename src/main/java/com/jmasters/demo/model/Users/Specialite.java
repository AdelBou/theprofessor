package com.jmasters.demo.model.Users;


import javax.persistence.*;
import java.util.Set;

@Entity
public class Specialite {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String designation;
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_domaine")
    private Domaine domaine;


    @OneToMany(mappedBy = "specialite")
    private Set<Candidat> candidats;


    public Set<Candidat> getCandidats() {
        return candidats;
    }

    public void setCandidats(Set<Candidat> candidats) {
        this.candidats = candidats;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Domaine getDomaine() {
        return domaine;
    }

    public void setDomaine(Domaine domaine) {
        this.domaine = domaine;
    }

    public Specialite(String designation, Domaine domaine) {
        this.designation = designation;
        this.domaine = domaine;
    }

    public Specialite() {
    }
}
