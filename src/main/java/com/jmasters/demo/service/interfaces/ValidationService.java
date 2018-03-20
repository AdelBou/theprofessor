package com.jmasters.demo.service.interfaces;

import com.jmasters.demo.model.Depot.Dossier;
import com.jmasters.demo.model.Depot.Information;
import com.jmasters.demo.model.Users.MembreCun;
import com.jmasters.demo.model.Users.Validateur;

public interface ValidationService {
    public  boolean validateInformation(Validateur validateur , Information information);
    public  boolean validateDossier(Validateur validateur , Dossier dossier);

}
