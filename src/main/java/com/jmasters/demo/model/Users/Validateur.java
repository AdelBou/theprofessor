package com.jmasters.demo.model.Users;

import com.jmasters.demo.model.Depot.Dossier;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;

@Entity
public class Validateur extends Compte{
    @OneToMany(mappedBy = "validateur")
    private Set<Dossier> dossiers;

}
