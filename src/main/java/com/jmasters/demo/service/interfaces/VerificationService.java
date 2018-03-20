package com.jmasters.demo.service.interfaces;

import com.jmasters.demo.model.Depot.Dossier;
import com.jmasters.demo.model.Depot.Information;
import com.jmasters.demo.model.Users.Etablissement;
import com.jmasters.demo.model.Users.Validateur;

public interface VerificationService {
    public  boolean verifyInformation(Etablissement etablissement, Information information);
    public  boolean VerifyDossier(Etablissement etablissement, Dossier dossier);
}
