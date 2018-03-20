package com.jmasters.demo;

import com.jmasters.demo.model.Users.MembreCun;
import com.jmasters.demo.repository.Depot.DossierRepository;
import com.jmasters.demo.repository.Evaluation.CunRepository;
import com.jmasters.demo.repository.Evaluation.GrilleRepository;
import com.jmasters.demo.repository.Users.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
	@Autowired
	private  CompteRepository compteRepository;
	@Autowired
	private ValidateurRepository validateurRepository;
	@Autowired
	private MembreCunRepository membreCunRepository;

	@Autowired
	private SpecialiteRepository specialiteRepository;

	@Autowired
	private DomaineRepository domaineRepository;

	@Autowired
	private CandidatRepository candidatRepository;
	@Autowired
	private CunRepository cunRepository;

	@Autowired
	private GrilleRepository grilleRepository;

	@Autowired
	private CritereRepository critereRepository;

	@Autowired
	private DossierRepository dossierRepository;

    @Autowired
    private UtilisateurRepository userRepository;


	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {


	}
}
