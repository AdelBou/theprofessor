package com.jmasters.demo.service.implementations;

import com.jmasters.demo.model.Depot.Dossier;
import com.jmasters.demo.model.Depot.Information;
import com.jmasters.demo.model.Users.MembreCun;
import com.jmasters.demo.service.interfaces.EvaluationService;
import org.springframework.stereotype.Service;

@Service
public class EvaluationServiceImp implements EvaluationService {
    @Override
    public boolean evaluateInformation(MembreCun membreCun, Information information, int note) {
        return false;
    }

    @Override
    public boolean evaluateFinale(MembreCun membreCun, Dossier dossier) {
        return false;
    }
}
