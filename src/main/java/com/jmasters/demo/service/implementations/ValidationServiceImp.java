package com.jmasters.demo.service.implementations;

import com.jmasters.demo.model.Depot.Dossier;
import com.jmasters.demo.model.Depot.Information;
import com.jmasters.demo.model.Users.Etablissement;
import com.jmasters.demo.model.Users.Validateur;
import com.jmasters.demo.repository.Depot.DossierRepository;
import com.jmasters.demo.repository.Depot.InformationRepository;
import com.jmasters.demo.repository.Users.ValidateurRepository;
import com.jmasters.demo.service.interfaces.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ValidationServiceImp implements ValidationService{
    @Autowired
    private InformationRepository informationRepository;

    @Autowired
    private DossierRepository dossierRepository;

    @Override
    public boolean validateInformation(Validateur validateur, Information information) {
        information.setValide(true);
        informationRepository.save(information);
        return true;
    }

    @Override
    public boolean validateDossier(Validateur validateur , Dossier dossier) {
        boolean ok = true;
        for (Information inf : dossier.getInformations()) ok = ok && inf.isValide();
        if (ok) {
            dossier.setValide(true);
            dossierRepository.save(dossier);
            return true;
        }
        return true;
    }
}
