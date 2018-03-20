package com.jmasters.demo.model.Users;

import javax.persistence.Entity;

@Entity
public class Etablissement extends Compte{

    int code_etablissement;
    String designation;
    String lieu;


}
