package com.jmasters.demo.service.implementations;

import com.jmasters.demo.model.Depot.Dossier;
import com.jmasters.demo.model.Depot.Information;
import com.jmasters.demo.model.Users.Etablissement;
import com.jmasters.demo.repository.Depot.DossierRepository;
import com.jmasters.demo.repository.Depot.InformationRepository;
import com.jmasters.demo.service.interfaces.VerificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VerificationServiceImp implements VerificationService {

    @Autowired
    private InformationRepository informationRepository;

    @Autowired
    private DossierRepository dossierRepository;

    @Override
    public boolean verifyInformation(Etablissement etablissement, Information information) {
        information.setVerifie(true);
        informationRepository.save(information);
        return true;
    }

    @Override
    public boolean VerifyDossier(Etablissement etablissement, Dossier dossier) {
        boolean ok = true;
        for (Information inf : dossier.getInformations()) ok = ok && inf.isVerifie();
        if (ok) {
            dossier.setVerifie(true);
            dossierRepository.save(dossier);
            return true;
        }
        return true;
    }
}
