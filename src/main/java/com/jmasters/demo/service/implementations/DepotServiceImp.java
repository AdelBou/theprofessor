package com.jmasters.demo.service.implementations;

import com.jmasters.demo.model.Depot.Dossier;
import com.jmasters.demo.model.Users.Candidat;
import com.jmasters.demo.service.interfaces.DepotService;
import org.springframework.stereotype.Service;

@Service
public class DepotServiceImp implements DepotService {
    @Override
    public boolean addDossierForCandidat(Dossier dossier, Candidat candidat) {
        return false;
    }

    @Override
    public boolean editDossierForCandidat(Dossier dossier, Candidat candidat) {
        return false;
    }

    @Override
    public boolean deleteDossierForCandidat(Dossier dossier, Candidat candidat) {
        return false;
    }
}
