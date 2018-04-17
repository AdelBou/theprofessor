package com.jmasters.demo.controller.Route;

import com.jmasters.demo.controller.ViewModel.DossierModel;
import com.jmasters.demo.model.Depot.Dossier;
import com.jmasters.demo.model.Depot.Information;
import com.jmasters.demo.model.Users.Domaine;
import com.jmasters.demo.model.Users.Etablissement;
import com.jmasters.demo.model.Users.Specialite;
import com.jmasters.demo.service.TestService;
import com.jmasters.demo.service.interfaces.DepotService;
import com.jmasters.demo.service.storage.StorageFileNotFoundException;
import com.jmasters.demo.service.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.jws.WebParam;
import javax.validation.Valid;
import java.lang.reflect.Array;
import java.util.*;

@Controller
public class DepotController {

    @Autowired
    private StorageService storageService;


    @Autowired
    private TestService testService;
/*@ GetMapping("/Depot")
    public String Depot(Dossier dossier) {
      //model.addAttribute("dossier", new DossierModel());return "/Depot";
    }*/

    @RequestMapping(value = "/DepotEdit", method = RequestMethod.GET)
    public String DepotEdit(DossierModel dossierModel, Model model) {
        List<Etablissement> etablissements = new ArrayList<Etablissement>();
        Etablissement etablissement = new Etablissement();
        etablissement.setDesignation("esi");
        etablissements.add(etablissement);
        etablissement = new Etablissement();
        etablissement.setDesignation("usthb");
        etablissements.add(etablissement);
        List<Specialite> specialites = new ArrayList<>();
        Specialite specialite = new Specialite();
        specialite.setDesignation("informatique");
        specialites.add(specialite);
        specialite = new Specialite();
        specialite.setDesignation("geologie");
        specialites.add(specialite);
        model.addAttribute("dossierModel",testService.dossierModel);
        model.addAttribute("etab", etablissements);
        model.addAttribute("specialites", specialites);
        System.out.print("adel== "+testService.dossierModel.toString());
        return "Depot";

    }

    @RequestMapping(value = "/Depot", method = RequestMethod.GET)
    public String Depot(DossierModel dossierModel, Model model) {
        List<Etablissement> etablissements = new ArrayList<Etablissement>();
        Etablissement etablissement = new Etablissement();
        etablissement.setDesignation("esi");
        etablissements.add(etablissement);
        etablissement.setDesignation("usthb");
        etablissements.add(etablissement);
        List<Specialite> specialites = new ArrayList<>();
        Specialite specialite = new Specialite();
        specialite.setDesignation("informatique");
        specialites.add(specialite);
        specialite = new Specialite();
        specialite.setDesignation("geologie");
        specialites.add(specialite);
        model.addAttribute("etab", etablissements);
        model.addAttribute("specialites", specialites);
        System.out.print("adel ");
        return "Depot";
    }
    /*
    @PostMapping("/Depot")
    public String Depot(@ModelAttribute DossierModel dossierModel) {
        System.out.println("adel ok"+dossierModel.toString());
       // depotService.addDossierForCandidat(dossier,candidat);
        return "/login";

    }*/

    @RequestMapping(value = "/Depot", method = RequestMethod.POST)
    public String Depot(@RequestParam("premierCycleFile") MultipartFile premierCycle,
                        @RequestParam("masterFile") MultipartFile master,
                        @RequestParam("graduationFile") MultipartFile graduation,

                        @RequestParam("postGraduationFile") MultipartFile postGraduationFile,
                        @RequestParam("ouvrageEditeFile") MultipartFile ouvrageEditeFile,
                        @RequestParam("nbManuelFile") MultipartFile nbManuelFile,
                        @RequestParam("nbPolycopesFile") MultipartFile nbPolycopesFile,

                        @RequestParam("masterEncadreFile") MultipartFile masterEncadreFile,
                        @RequestParam("magisterEncadreFile") MultipartFile magisterEncadreFile,
                        @RequestParam("doctoratEncadreFile") MultipartFile doctoratEncadreFile,

                        @RequestParam("periodiqueIntFile") MultipartFile periodiqueIntFile,
                        @RequestParam("ouvrageIntFile") MultipartFile ouvrageIntFile,
                        @RequestParam("procedingIntFile") MultipartFile procedingIntFile,

                        @RequestParam("revuesNasFile") MultipartFile revuesNasFile,
                        @RequestParam("ouvrageNasFile") MultipartFile ouvrageNasFile,
                        @RequestParam("procedingNasFile") MultipartFile procedingNasFile,

                        @RequestParam("communicationFile") MultipartFile communication,
                        @RequestParam("responsableRechercheFile") MultipartFile responsableRechercheFile,
                        @RequestParam("AnimationScientifiqueFile") MultipartFile animationScientifiqueFile,

                        @RequestParam("ResponsableAdministrativesFile") MultipartFile responsableAdministrativesFile,
                        @RequestParam("OrganeEvaluationFile") MultipartFile organeEvaluationFile

                       , @Valid DossierModel dossierModel,
                        BindingResult bindingResult, Model model,
                        RedirectAttributes redirectAttributes) {

        if (bindingResult.hasErrors()) {
            System.out.print("adel " + bindingResult.getAllErrors().toString());
            return "/Depot";
        }

        if (!premierCycle.isEmpty()){
        storageService.store(premierCycle);
        dossierModel.setPremierCycleLink(premierCycle.getOriginalFilename());
        }
        if (!graduation.isEmpty()){
        storageService.store(graduation);
        dossierModel.setGraduationLink(graduation.getOriginalFilename());}

        if (!master.isEmpty()) {
            storageService.store(master);
            dossierModel.setMasterLink(master.getOriginalFilename());
        }
        if (!postGraduationFile.isEmpty()) {
            storageService.store(postGraduationFile);
            dossierModel.setPostGraduationFileLink(postGraduationFile.getOriginalFilename());
        }
        if (!ouvrageEditeFile.isEmpty()) {
        storageService.store(ouvrageEditeFile);
        dossierModel.setOuvrageEditeFileLink(ouvrageEditeFile.getOriginalFilename());
        }
        if (!nbManuelFile.isEmpty()) {
        storageService.store(nbManuelFile);
        dossierModel.setNbManuelFileLink(nbManuelFile.getOriginalFilename());
        }
        if (!nbPolycopesFile.isEmpty()) {
        storageService.store(nbPolycopesFile);
        dossierModel.setNbPolycopesFileLink(nbPolycopesFile.getOriginalFilename());
        }
        if (!masterEncadreFile.isEmpty()) {
        storageService.store(masterEncadreFile);
        dossierModel.setMasterEncadreFileLink(masterEncadreFile.getOriginalFilename());
        }
        if (!magisterEncadreFile.isEmpty()) {
        storageService.store(magisterEncadreFile);
        dossierModel.setMagisterEncadreFileLink(magisterEncadreFile.getOriginalFilename());
        }
        if (!doctoratEncadreFile.isEmpty()) {
        storageService.store(doctoratEncadreFile);
        dossierModel.setDoctoratEncadreFileLink(doctoratEncadreFile.getOriginalFilename());
        }
        if (!periodiqueIntFile.isEmpty()) {
        storageService.store(periodiqueIntFile);
        dossierModel.setPeriodiqueIntFileLink(periodiqueIntFile.getOriginalFilename());
        }
        if (!ouvrageEditeFile.isEmpty()) {
        storageService.store(ouvrageEditeFile);
        dossierModel.setOuvrageIntFileLink(ouvrageEditeFile.getOriginalFilename());
        }
        if (!procedingIntFile.isEmpty()) {
        storageService.store(procedingIntFile);
        dossierModel.setProcedingIntFileLink(procedingIntFile.getOriginalFilename());
        }
        if (!revuesNasFile.isEmpty()) {
        storageService.store(revuesNasFile);
        dossierModel.setRevuesNasFileLink(revuesNasFile.getOriginalFilename());
        }
        if (!ouvrageIntFile.isEmpty()) {
        storageService.store(ouvrageIntFile);
        dossierModel.setOuvrageIntFileLink(ouvrageIntFile.getOriginalFilename());
        }
        if (!procedingNasFile.isEmpty()) {
        storageService.store(procedingNasFile);
        dossierModel.setProcedingNasFileLink(procedingNasFile.getOriginalFilename());
        }
        if (!ouvrageNasFile.isEmpty()) {
        storageService.store(ouvrageNasFile);
        dossierModel.setOuvrageNasFileLink(ouvrageNasFile.getOriginalFilename());
        }
        if (!communication.isEmpty()) {
        storageService.store(communication);
        dossierModel.setCommunicationLink(communication.getOriginalFilename());
        }
        if (!responsableRechercheFile.isEmpty()) {
        storageService.store(responsableRechercheFile);
        dossierModel.setResponsableRechercheFileLink(responsableRechercheFile.getOriginalFilename());
        }
        if (!animationScientifiqueFile.isEmpty()) {
        storageService.store(animationScientifiqueFile);
        dossierModel.setAnimationScientifiqueFileLink(animationScientifiqueFile.getOriginalFilename());
        }
        if (!responsableAdministrativesFile.isEmpty()) {
        storageService.store(responsableAdministrativesFile);
        dossierModel.setResponsableAdministrativesFileLink(responsableAdministrativesFile.getOriginalFilename());
        }
        if (!organeEvaluationFile.isEmpty()) {
        storageService.store(organeEvaluationFile);
        dossierModel.setOrganeEvaluationFileLink(organeEvaluationFile.getOriginalFilename());
        }


        dossierModel.calculeAutomaticPoint();
        System.out.print("adel " + dossierModel.toString());

        testService.dossierModel=dossierModel;
        return "/Depot";
    }

    @ExceptionHandler(StorageFileNotFoundException.class)
    public ResponseEntity<?> handleStorageFileNotFound(StorageFileNotFoundException exc) {
        return ResponseEntity.notFound().build();
    }
}
