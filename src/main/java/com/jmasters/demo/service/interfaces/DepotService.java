package com.jmasters.demo.service.interfaces;

import com.jmasters.demo.model.Depot.Dossier;
import com.jmasters.demo.model.Users.Candidat;

public interface DepotService {

    public  boolean addDossierForCandidat(Dossier dossier, Candidat candidat);
    public  boolean editDossierForCandidat(Dossier dossier,Candidat candidat);
    public  boolean deleteDossierForCandidat(Dossier dossier,Candidat candidat);

}
