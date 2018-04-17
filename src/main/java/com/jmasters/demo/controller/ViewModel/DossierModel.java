package com.jmasters.demo.controller.ViewModel;

import java.util.Date;

public class DossierModel {
    public String name;
    public String prenom;
    public String etablissement;
    public String diplome;
    public String dateObtention;
    public String specialite;
    public String dateClassA;


    public int notePremierCycleCoef = 1;
    public int noteGraduationCoef = 1;
    public int noteSecondCycleCoef = 1;
    public int notePostGraduationCoef = 1;
    public int noteOuvragesCoef = 1;
    public int noteManuelsCoef = 1;
    public int notePolycopesCoef = 1;
    public int noteMasterCoef = 1;
    public int noteMagisterCoef = 1;
    public int noteDoctoratCoef = 1;
    public int noteRevuPeriodiqueIntCoef = 1;
    public int noteOuvrageEditeIntCoef = 1;
    public int noteProcedingEditeIntCoef = 1;
    public int noteRevuPeriodiqueNasCoef = 1;
    public int noteOuvrageEditeNasCoef = 1;
    public int noteProcedingEditeNasCoef = 1;
    public int noteCommunicationCoef = 1;
    public int noteResponsableProjetCoef = 1;
    public int noteAnimationScientifiqueCoef = 1;
    public int noteResponsabiliteAdministrativesCoef = 1;
    public int noteResidenceOrganesCoef = 1;

    public int calculeSomme() {
        return (notePremierCycle +
                noteGraduation +
                noteSecondCycle +
                notePostGraduation +
                noteOuvrages +
                noteManuels +
                notePolycopes +
                noteMaster +
                noteMagister +
                noteDoctorat +
                noteRevuPeriodiqueInt +
                noteOuvrageEditeInt +
                noteProcedingEditeInt +
                noteRevuPeriodiqueNas +
                noteOuvrageEditeNas +
                noteProcedingEditeNas +
                noteCommunication +
                noteResponsableProjet +
                noteAnimationScientifique +
                noteResponsabiliteAdministratives +
                noteResidenceOrganes)
                ;
    }

    public void calculeAutomaticPoint() {
        notePremierCycle = notePremierCycleCoef * premierCycle;
        noteGraduation = noteGraduationCoef * graduation;
        noteSecondCycle = noteSecondCycleCoef * secondCycle;
        notePostGraduation = notePostGraduationCoef * postGraduation;
        noteOuvrages = noteOuvragesCoef * ouvrages;
        noteManuels = noteManuelsCoef * manuels;
        notePolycopes = notePolycopesCoef * polycopes;
        noteMaster = noteMasterCoef * master;
        noteMagister = noteMagisterCoef * noteMagisterCoef;
        noteDoctorat = noteDoctoratCoef * doctorat;
        noteRevuPeriodiqueInt = noteRevuPeriodiqueIntCoef * revuPeriodiqueInt;
        noteOuvrageEditeInt = noteOuvrageEditeIntCoef * ouvrageEditeInt;
        noteProcedingEditeInt = noteProcedingEditeIntCoef * procedingEditeInt;
        noteRevuPeriodiqueNas = noteRevuPeriodiqueNasCoef * revuPeriodiqueNas;
        noteOuvrageEditeNas = noteOuvrageEditeNasCoef * ouvrageEditeNas;
        noteProcedingEditeNas = noteProcedingEditeNasCoef * procedingEditeNas;
        /*
        noteCommunication =   noteCommunicationCoef  * communication;
        noteResponsableProjet =  noteResponsableProjetCoef noteResponsableProjetCoef
        noteAnimationScientifique =  noteAnimationScientifiqueCoef noteAnimationScientifiqueCoef
        noteResponsabiliteAdministratives =  noteResponsabiliteAdministrativesCoef noteResponsabiliteAdministrativesCoef
        noteResidenceOrganes =  noteResidenceOrganesCoef  noteResidenceOrganesCoef*/
        noteCommunication = 0;
        noteResponsableProjet = 0;
        noteAnimationScientifique = 0;
        noteResponsabiliteAdministratives = 0;
        noteResidenceOrganes = 0;
    }

    public int getNotePremierCycleCoef() {
        return notePremierCycleCoef;
    }

    public void setNotePremierCycleCoef(int notePremierCycleCoef) {
        this.notePremierCycleCoef = notePremierCycleCoef;
    }

    public int getNoteGraduationCoef() {
        return noteGraduationCoef;
    }

    public void setNoteGraduationCoef(int noteGraduationCoef) {
        this.noteGraduationCoef = noteGraduationCoef;
    }

    public int getNoteSecondCycleCoef() {
        return noteSecondCycleCoef;
    }

    public void setNoteSecondCycleCoef(int noteSecondCycleCoef) {
        this.noteSecondCycleCoef = noteSecondCycleCoef;
    }

    public int getNotePostGraduationCoef() {
        return notePostGraduationCoef;
    }

    public void setNotePostGraduationCoef(int notePostGraduationCoef) {
        this.notePostGraduationCoef = notePostGraduationCoef;
    }

    public int getNoteOuvragesCoef() {
        return noteOuvragesCoef;
    }

    public void setNoteOuvragesCoef(int noteOuvragesCoef) {
        this.noteOuvragesCoef = noteOuvragesCoef;
    }

    public int getNoteManuelsCoef() {
        return noteManuelsCoef;
    }

    public void setNoteManuelsCoef(int noteManuelsCoef) {
        this.noteManuelsCoef = noteManuelsCoef;
    }

    public int getNotePolycopesCoef() {
        return notePolycopesCoef;
    }

    public void setNotePolycopesCoef(int notePolycopesCoef) {
        this.notePolycopesCoef = notePolycopesCoef;
    }

    public int getNoteMasterCoef() {
        return noteMasterCoef;
    }

    public void setNoteMasterCoef(int noteMasterCoef) {
        this.noteMasterCoef = noteMasterCoef;
    }

    public int getNoteMagisterCoef() {
        return noteMagisterCoef;
    }

    public void setNoteMagisterCoef(int noteMagisterCoef) {
        this.noteMagisterCoef = noteMagisterCoef;
    }

    public int getNoteDoctoratCoef() {
        return noteDoctoratCoef;
    }

    public void setNoteDoctoratCoef(int noteDoctoratCoef) {
        this.noteDoctoratCoef = noteDoctoratCoef;
    }

    public int getNoteRevuPeriodiqueIntCoef() {
        return noteRevuPeriodiqueIntCoef;
    }

    public void setNoteRevuPeriodiqueIntCoef(int noteRevuPeriodiqueIntCoef) {
        this.noteRevuPeriodiqueIntCoef = noteRevuPeriodiqueIntCoef;
    }

    public int getNoteOuvrageEditeIntCoef() {
        return noteOuvrageEditeIntCoef;
    }

    public void setNoteOuvrageEditeIntCoef(int noteOuvrageEditeIntCoef) {
        this.noteOuvrageEditeIntCoef = noteOuvrageEditeIntCoef;
    }

    public int getNoteProcedingEditeIntCoef() {
        return noteProcedingEditeIntCoef;
    }

    public void setNoteProcedingEditeIntCoef(int noteProcedingEditeIntCoef) {
        this.noteProcedingEditeIntCoef = noteProcedingEditeIntCoef;
    }

    public int getNoteRevuPeriodiqueNasCoef() {
        return noteRevuPeriodiqueNasCoef;
    }

    public void setNoteRevuPeriodiqueNasCoef(int noteRevuPeriodiqueNasCoef) {
        this.noteRevuPeriodiqueNasCoef = noteRevuPeriodiqueNasCoef;
    }

    public int getNoteOuvrageEditeNasCoef() {
        return noteOuvrageEditeNasCoef;
    }

    public void setNoteOuvrageEditeNasCoef(int noteOuvrageEditeNasCoef) {
        this.noteOuvrageEditeNasCoef = noteOuvrageEditeNasCoef;
    }

    public int getNoteProcedingEditeNasCoef() {
        return noteProcedingEditeNasCoef;
    }

    public void setNoteProcedingEditeNasCoef(int noteProcedingEditeNasCoef) {
        this.noteProcedingEditeNasCoef = noteProcedingEditeNasCoef;
    }

    public int getNoteCommunicationCoef() {
        return noteCommunicationCoef;
    }

    public void setNoteCommunicationCoef(int noteCommunicationCoef) {
        this.noteCommunicationCoef = noteCommunicationCoef;
    }

    public int getNoteResponsableProjetCoef() {
        return noteResponsableProjetCoef;
    }

    public void setNoteResponsableProjetCoef(int noteResponsableProjetCoef) {
        this.noteResponsableProjetCoef = noteResponsableProjetCoef;
    }

    public int getNoteAnimationScientifiqueCoef() {
        return noteAnimationScientifiqueCoef;
    }

    public void setNoteAnimationScientifiqueCoef(int noteAnimationScientifiqueCoef) {
        this.noteAnimationScientifiqueCoef = noteAnimationScientifiqueCoef;
    }

    public int getNoteResponsabiliteAdministrativesCoef() {
        return noteResponsabiliteAdministrativesCoef;
    }

    public void setNoteResponsabiliteAdministrativesCoef(int noteResponsabiliteAdministrativesCoef) {
        this.noteResponsabiliteAdministrativesCoef = noteResponsabiliteAdministrativesCoef;
    }

    public int getNoteResidenceOrganesCoef() {
        return noteResidenceOrganesCoef;
    }

    public void setNoteResidenceOrganesCoef(int noteResidenceOrganesCoef) {
        this.noteResidenceOrganesCoef = noteResidenceOrganesCoef;
    }

    public int getNotePremierCycle() {
        return notePremierCycle;
    }

    public void setNotePremierCycle(int notePremierCycle) {
        this.notePremierCycle = notePremierCycle;
    }

    public int getNoteGraduation() {
        return noteGraduation;
    }

    public void setNoteGraduation(int noteGraduation) {
        this.noteGraduation = noteGraduation;
    }

    public int getNoteSecondCycle() {
        return noteSecondCycle;
    }

    public void setNoteSecondCycle(int noteSecondCycle) {
        this.noteSecondCycle = noteSecondCycle;
    }

    public int getNotePostGraduation() {
        return notePostGraduation;
    }

    public void setNotePostGraduation(int notePostGraduation) {
        this.notePostGraduation = notePostGraduation;
    }

    public int getNoteOuvrages() {
        return noteOuvrages;
    }

    public void setNoteOuvrages(int noteOuvrages) {
        this.noteOuvrages = noteOuvrages;
    }

    public int getNoteManuels() {
        return noteManuels;
    }

    public void setNoteManuels(int noteManuels) {
        this.noteManuels = noteManuels;
    }

    public int getNotePolycopes() {
        return notePolycopes;
    }

    public void setNotePolycopes(int notePolycopes) {
        this.notePolycopes = notePolycopes;
    }

    public int getNoteMaster() {
        return noteMaster;
    }

    public void setNoteMaster(int noteMaster) {
        this.noteMaster = noteMaster;
    }

    public int getNoteMagister() {
        return noteMagister;
    }

    public void setNoteMagister(int noteMagister) {
        this.noteMagister = noteMagister;
    }

    public int getNoteDoctorat() {
        return noteDoctorat;
    }

    public void setNoteDoctorat(int noteDoctorat) {
        this.noteDoctorat = noteDoctorat;
    }

    public int getNoteRevuPeriodiqueInt() {
        return noteRevuPeriodiqueInt;
    }

    public void setNoteRevuPeriodiqueInt(int noteRevuPeriodiqueInt) {
        this.noteRevuPeriodiqueInt = noteRevuPeriodiqueInt;
    }

    public int getNoteOuvrageEditeInt() {
        return noteOuvrageEditeInt;
    }

    public void setNoteOuvrageEditeInt(int noteOuvrageEditeInt) {
        this.noteOuvrageEditeInt = noteOuvrageEditeInt;
    }

    public int getNoteProcedingEditeInt() {
        return noteProcedingEditeInt;
    }

    public void setNoteProcedingEditeInt(int noteProcedingEditeInt) {
        this.noteProcedingEditeInt = noteProcedingEditeInt;
    }

    public int getNoteRevuPeriodiqueNas() {
        return noteRevuPeriodiqueNas;
    }

    public void setNoteRevuPeriodiqueNas(int noteRevuPeriodiqueNas) {
        this.noteRevuPeriodiqueNas = noteRevuPeriodiqueNas;
    }

    public int getNoteOuvrageEditeNas() {
        return noteOuvrageEditeNas;
    }

    public void setNoteOuvrageEditeNas(int noteOuvrageEditeNas) {
        this.noteOuvrageEditeNas = noteOuvrageEditeNas;
    }

    public int getNoteProcedingEditeNas() {
        return noteProcedingEditeNas;
    }

    public void setNoteProcedingEditeNas(int noteProcedingEditeNas) {
        this.noteProcedingEditeNas = noteProcedingEditeNas;
    }

    public int getNoteCommunication() {
        return noteCommunication;
    }

    public void setNoteCommunication(int noteCommunication) {
        this.noteCommunication = noteCommunication;
    }

    public int getNoteResponsableProjet() {
        return noteResponsableProjet;
    }

    public void setNoteResponsableProjet(int noteResponsableProjet) {
        this.noteResponsableProjet = noteResponsableProjet;
    }

    public int getNoteAnimationScientifique() {
        return noteAnimationScientifique;
    }

    public void setNoteAnimationScientifique(int noteAnimationScientifique) {
        this.noteAnimationScientifique = noteAnimationScientifique;
    }

    public int getNoteResponsabiliteAdministratives() {
        return noteResponsabiliteAdministratives;
    }

    public void setNoteResponsabiliteAdministratives(int noteResponsabiliteAdministratives) {
        this.noteResponsabiliteAdministratives = noteResponsabiliteAdministratives;
    }

    public int getNoteResidenceOrganes() {
        return noteResidenceOrganes;
    }

    public void setNoteResidenceOrganes(int noteResidenceOrganes) {
        this.noteResidenceOrganes = noteResidenceOrganes;
    }

    //deuxieme
    //Nombre d'Années d’enseignement en premier cycle
    public int premierCycle;

    public int notePremierCycle;

    //Nombre d'Années d’enseignement en Graduation
    public int graduation;
    public int noteGraduation;
    //Nombre d'Années d’enseignement en second cycle (master)
    public int secondCycle;
    public int noteSecondCycle;
    //Nombre d'Années d’enseignement en post-Graduation
    public int postGraduation;
    public int notePostGraduation;
    //Nombre d'ouvrages édités
    public int ouvrages;
    public int noteOuvrages;
    //Nombre de manuels édités
    public int manuels;
    public int noteManuels;
    //Nombre de polycopes édités (> 100 pages)
    public int polycopes;
    public int notePolycopes;

    //3eme
    //Nombre de mémoire de fin d’études de masters encadrés et soutenus
    public int master;
    public int noteMaster;
    //Nombre de mémoires de magister dirigés et soutenus
    public int magister;
    public int noteMagister;
    //Nombre de thèses de doctorat ou de doctorat d’état dirigées et soutenues
    public int doctorat;
    public int noteDoctorat;


    //scientifique
    //Publications internationales
    //Nombre de revues pèriodiques
    public int revuPeriodiqueInt;
    public int noteRevuPeriodiqueInt;
    //Nombre d'ouvrages édités
    public int ouvrageEditeInt;
    public int noteOuvrageEditeInt;
    //Nombre d'actes et proceding édités
    public int procedingEditeInt;
    public int noteProcedingEditeInt;
    //Publications nationales
    //Nombre de revues pèriodiques
    public int revuPeriodiqueNas;
    public int noteRevuPeriodiqueNas;
    //Nombre d'ouvrages édités
    public int ouvrageEditeNas;
    public int noteOuvrageEditeNas;
    //Nombre d'actes et proceding édités
    public int procedingEditeNas;
    public int noteProcedingEditeNas;

    //Communication
    public String communication;
    public int noteCommunication;
    //Responsable ou membre d'un projet de recherche
    public String responsableProjet;
    public int noteResponsableProjet;
    //Animations scientifiques
    public String animationScientifique;
    public int noteAnimationScientifique;
    //Responsabilités administratives
    public String responsabiliteAdministratives;
    public int noteResponsabiliteAdministratives;
    //Présidence d'organes d'évaluation pédagogique et scientifique
    public String presidenceOrganes;
    public int noteResidenceOrganes;

   //coloque et maitrise expertice
    public  int colloque;

    public int getColloque() {
        return colloque;
    }

    public void setColloque(int colloque) {
        this.colloque = colloque;
    }

    //links
    String premierCycleLink;
    String masterLink;
    String graduationLink;
    String postGraduationFileLink;
    String ouvrageEditeFileLink;
    String nbManuelFileLink;
    String nbPolycopesFileLink;

    String masterEncadreFileLink;
    String magisterEncadreFileLink;
    String doctoratEncadreFileLink;

    String periodiqueIntFileLink;
    String ouvrageIntFileLink;
    String procedingIntFileLink;

    String revuesNasFileLink;
    String ouvrageNasFileLink;
    String procedingNasFileLink;

    String CommunicationLink;
    String responsableRechercheFileLink;
    String AnimationScientifiqueFileLink;

    String ResponsableAdministrativesFileLink;
    String OrganeEvaluationFileLink;


    public String getMasterLink() {
        return masterLink;
    }

    public void setMasterLink(String masterLink) {
        this.masterLink = masterLink;
    }

    public String getGraduationLink() {
        return graduationLink;
    }

    public void setGraduationLink(String graduationLink) {
        this.graduationLink = graduationLink;
    }

    public String getPostGraduationFileLink() {
        return postGraduationFileLink;
    }

    public void setPostGraduationFileLink(String postGraduationFileLink) {
        this.postGraduationFileLink = postGraduationFileLink;
    }

    public String getOuvrageEditeFileLink() {
        return ouvrageEditeFileLink;
    }

    public void setOuvrageEditeFileLink(String ouvrageEditeFileLink) {
        this.ouvrageEditeFileLink = ouvrageEditeFileLink;
    }

    public String getNbManuelFileLink() {
        return nbManuelFileLink;
    }

    public void setNbManuelFileLink(String nbManuelFileLink) {
        this.nbManuelFileLink = nbManuelFileLink;
    }

    public String getNbPolycopesFileLink() {
        return nbPolycopesFileLink;
    }

    public void setNbPolycopesFileLink(String nbPolycopesFileLink) {
        this.nbPolycopesFileLink = nbPolycopesFileLink;
    }

    public String getMasterEncadreFileLink() {
        return masterEncadreFileLink;
    }

    public void setMasterEncadreFileLink(String masterEncadreFileLink) {
        this.masterEncadreFileLink = masterEncadreFileLink;
    }

    public String getMagisterEncadreFileLink() {
        return magisterEncadreFileLink;
    }

    public void setMagisterEncadreFileLink(String magisterEncadreFileLink) {
        this.magisterEncadreFileLink = magisterEncadreFileLink;
    }

    public String getDoctoratEncadreFileLink() {
        return doctoratEncadreFileLink;
    }

    public void setDoctoratEncadreFileLink(String doctoratEncadreFileLink) {
        this.doctoratEncadreFileLink = doctoratEncadreFileLink;
    }

    public String getPeriodiqueIntFileLink() {
        return periodiqueIntFileLink;
    }

    public void setPeriodiqueIntFileLink(String periodiqueIntFileLink) {
        this.periodiqueIntFileLink = periodiqueIntFileLink;
    }

    public String getOuvrageIntFileLink() {
        return ouvrageIntFileLink;
    }

    public void setOuvrageIntFileLink(String ouvrageIntFileLink) {
        this.ouvrageIntFileLink = ouvrageIntFileLink;
    }

    public String getProcedingIntFileLink() {
        return procedingIntFileLink;
    }

    public void setProcedingIntFileLink(String procedingIntFileLink) {
        this.procedingIntFileLink = procedingIntFileLink;
    }

    public String getRevuesNasFileLink() {
        return revuesNasFileLink;
    }

    public void setRevuesNasFileLink(String revuesNasFileLink) {
        this.revuesNasFileLink = revuesNasFileLink;
    }

    public String getOuvrageNasFileLink() {
        return ouvrageNasFileLink;
    }

    public void setOuvrageNasFileLink(String ouvrageNasFileLink) {
        this.ouvrageNasFileLink = ouvrageNasFileLink;
    }

    public String getProcedingNasFileLink() {
        return procedingNasFileLink;
    }

    public void setProcedingNasFileLink(String procedingNasFileLink) {
        this.procedingNasFileLink = procedingNasFileLink;
    }

    public String getCommunicationLink() {
        return CommunicationLink;
    }

    public void setCommunicationLink(String communicationLink) {
        CommunicationLink = communicationLink;
    }

    public String getResponsableRechercheFileLink() {
        return responsableRechercheFileLink;
    }

    public void setResponsableRechercheFileLink(String responsableRechercheFileLink) {
        this.responsableRechercheFileLink = responsableRechercheFileLink;
    }

    public String getAnimationScientifiqueFileLink() {
        return AnimationScientifiqueFileLink;
    }

    public void setAnimationScientifiqueFileLink(String animationScientifiqueFileLink) {
        AnimationScientifiqueFileLink = animationScientifiqueFileLink;
    }

    public String getResponsableAdministrativesFileLink() {
        return ResponsableAdministrativesFileLink;
    }

    public void setResponsableAdministrativesFileLink(String responsableAdministrativesFileLink) {
        ResponsableAdministrativesFileLink = responsableAdministrativesFileLink;
    }

    public String getOrganeEvaluationFileLink() {
        return OrganeEvaluationFileLink;
    }

    public void setOrganeEvaluationFileLink(String organeEvaluationFileLink) {
        OrganeEvaluationFileLink = organeEvaluationFileLink;
    }

    public int getMaster() {
        return master;
    }

    public void setMaster(int master) {
        this.master = master;
    }

    public int getMagister() {
        return magister;
    }

    public void setMagister(int magister) {
        this.magister = magister;
    }

    public int getDoctorat() {
        return doctorat;
    }

    public void setDoctorat(int doctorat) {
        this.doctorat = doctorat;
    }

    public int getRevuPeriodiqueInt() {
        return revuPeriodiqueInt;
    }

    public void setRevuPeriodiqueInt(int revuPeriodiqueInt) {
        this.revuPeriodiqueInt = revuPeriodiqueInt;
    }

    public int getOuvrageEditeInt() {
        return ouvrageEditeInt;
    }

    public void setOuvrageEditeInt(int ouvrageEditeInt) {
        this.ouvrageEditeInt = ouvrageEditeInt;
    }

    public int getProcedingEditeInt() {
        return procedingEditeInt;
    }

    public void setProcedingEditeInt(int procedingEditeInt) {
        this.procedingEditeInt = procedingEditeInt;
    }

    public int getRevuPeriodiqueNas() {
        return revuPeriodiqueNas;
    }

    public void setRevuPeriodiqueNas(int revuPeriodiqueNas) {
        this.revuPeriodiqueNas = revuPeriodiqueNas;
    }

    public int getOuvrageEditeNas() {
        return ouvrageEditeNas;
    }

    public void setOuvrageEditeNas(int ouvrageEditeNas) {
        this.ouvrageEditeNas = ouvrageEditeNas;
    }

    public int getProcedingEditeNas() {
        return procedingEditeNas;
    }

    public void setProcedingEditeNas(int procedingEditeNas) {
        this.procedingEditeNas = procedingEditeNas;
    }

    public String getCommunication() {
        return communication;
    }

    public void setCommunication(String communication) {
        this.communication = communication;
    }

    public String getResponsableProjet() {
        return responsableProjet;
    }

    public void setResponsableProjet(String responsableProjet) {
        this.responsableProjet = responsableProjet;
    }

    public String getAnimationScientifique() {
        return animationScientifique;
    }

    public void setAnimationScientifique(String animationScientifique) {
        this.animationScientifique = animationScientifique;
    }

    public String getResponsabiliteAdministratives() {
        return responsabiliteAdministratives;
    }

    public void setResponsabiliteAdministratives(String responsabiliteAdministratives) {
        this.responsabiliteAdministratives = responsabiliteAdministratives;
    }

    public String getPresidenceOrganes() {
        return presidenceOrganes;
    }

    public void setPresidenceOrganes(String presidenceOrganes) {
        this.presidenceOrganes = presidenceOrganes;
    }

    public int getPremierCycle() {
        return premierCycle;
    }

    public void setPremierCycle(int premierCycle) {
        this.premierCycle = premierCycle;
    }

    public int getGraduation() {
        return graduation;
    }

    public void setGraduation(int graduation) {
        this.graduation = graduation;
    }

    public int getSecondCycle() {
        return secondCycle;
    }

    public void setSecondCycle(int secondCycle) {
        this.secondCycle = secondCycle;
    }

    public int getPostGraduation() {
        return postGraduation;
    }

    public void setPostGraduation(int postGraduation) {
        this.postGraduation = postGraduation;
    }

    public int getOuvrages() {
        return ouvrages;
    }

    public void setOuvrages(int ouvrages) {
        this.ouvrages = ouvrages;
    }

    public int getManuels() {
        return manuels;
    }

    public void setManuels(int manuels) {
        this.manuels = manuels;
    }

    public int getPolycopes() {
        return polycopes;
    }

    public void setPolycopes(int polycopes) {
        this.polycopes = polycopes;
    }

    public String getDateClassA() {
        return dateClassA;
    }

    public void setDateClassA(String dateClassA) {
        this.dateClassA = dateClassA;
    }

    public String getSpecialite() {
        return specialite;
    }

    public void setSpecialite(String specialite) {
        this.specialite = specialite;
    }

    public String getDateObtention() {
        return dateObtention;
    }

    public void setDateObtention(String dateObtention) {
        this.dateObtention = dateObtention;
    }

    public String getDiplome() {
        return diplome;
    }

    public void setDiplome(String diplome) {
        this.diplome = diplome;
    }

    public String getEtablissement() {
        return etablissement;
    }

    public void setEtablissement(String etablissement) {
        this.etablissement = etablissement;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public DossierModel() {
    }

    public String getPremierCycleLink() {
        return premierCycleLink;
    }

    public void setPremierCycleLink(String premierCycleLink) {
        this.premierCycleLink = premierCycleLink;
    }

    @Override
    public String toString() {
        return "DossierModel{" +
                "name='" + name + '\'' +
                ", prenom='" + prenom + '\'' +
                ", etablissement='" + etablissement + '\'' +
                ", diplome='" + diplome + '\'' +
                ", dateObtention='" + dateObtention + '\'' +
                ", specialite='" + specialite + '\'' +
                ", dateClassA='" + dateClassA + '\'' +
                ", premierCycle=" + premierCycle +
                ", premierCycleLink='" + premierCycleLink + '\'' +
                ", graduation=" + graduation +
                ", secondCycle=" + secondCycle +
                ", postGraduation=" + postGraduation +
                ", ouvrages=" + ouvrages +
                ", manuels=" + manuels +
                ", polycopes=" + polycopes +
                ", master=" + master +
                ", magister=" + magister +
                ", doctorat=" + doctorat +
                ", revuPeriodiqueInt=" + revuPeriodiqueInt +
                ", ouvrageEditeInt=" + ouvrageEditeInt +
                ", procedingEditeInt=" + procedingEditeInt +
                ", revuPeriodiqueNas=" + revuPeriodiqueNas +
                ", ouvrageEditeNas=" + ouvrageEditeNas +
                ", procedingEditeNas=" + procedingEditeNas +
                ", communication='" + communication + '\'' +
                ", responsableProjet='" + responsableProjet + '\'' +
                ", animationScientifique='" + animationScientifique + '\'' +
                ", responsabiliteAdministratives='" + responsabiliteAdministratives + '\'' +
                ", presidenceOrganes='" + presidenceOrganes + '\'' +
                '}';
    }
}
