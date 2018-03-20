package com.jmasters.demo.service.implementations;

import com.jmasters.demo.model.Evaluation.Cun;
import com.jmasters.demo.model.Users.Candidat;
import com.jmasters.demo.model.Users.MembreCun;
import com.jmasters.demo.model.Users.Utilisateur;
import com.jmasters.demo.repository.Users.*;
import com.jmasters.demo.service.interfaces.AuthService;
import com.jmasters.demo.service.interfaces.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.validation.ValidationProviderResolver;

@Service
public class AuthServiceImp implements AuthService {
    @Autowired
    private  CompteRepository compteRepository ;

    @Autowired
    private UtilisateurRepository utilisateurRepository;

   @Autowired
   private CandidatRepository candidatRepository;

   @Autowired
   private MembreCunRepository membreCunRepository;

   @Autowired
   private ValidateurRepository validateurRepository;

   @Autowired
   private EtablissementRepository etablissementRepository;





}
