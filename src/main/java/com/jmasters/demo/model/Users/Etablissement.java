package com.jmasters.demo.model.Users;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Etablissement extends Compte{

    private int code_etablissement;
    private  String designation;
    private  String lieu;
    @OneToMany(mappedBy = "etablissement")
    private Set<Candidat> candidats;

    public int getCode_etablissement() {
        return code_etablissement;
    }

    public void setCode_etablissement(int code_etablissement) {
        this.code_etablissement = code_etablissement;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getLieu() {
        return lieu;
    }

    public void setLieu(String lieu) {
        this.lieu = lieu;
    }

    public Set<Candidat> getCandidats() {
        return candidats;
    }

    public void setCandidats(Set<Candidat> candidats) {
        this.candidats = candidats;
    }

    public Etablissement() {
    }
}
