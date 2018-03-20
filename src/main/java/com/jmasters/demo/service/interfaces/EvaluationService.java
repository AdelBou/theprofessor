package com.jmasters.demo.service.interfaces;

import com.jmasters.demo.model.Depot.Dossier;
import com.jmasters.demo.model.Depot.Information;
import com.jmasters.demo.model.Users.Candidat;
import com.jmasters.demo.model.Users.MembreCun;

import java.util.Set;

public interface EvaluationService {
    public  boolean evaluateInformation( MembreCun membreCun , Information information ,int note);
    public  boolean evaluateFinale( MembreCun membreCun ,Dossier dossier );
}
