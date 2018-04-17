package com.jmasters.demo;

import com.jmasters.demo.controller.Route.HomeController;
import com.jmasters.demo.model.Depot.Dossier;
import com.jmasters.demo.model.Depot.Information;
import com.jmasters.demo.model.Users.MembreCun;
import com.jmasters.demo.repository.Depot.DossierRepository;
import com.jmasters.demo.repository.Evaluation.CunRepository;
import com.jmasters.demo.repository.Evaluation.GrilleRepository;
import com.jmasters.demo.repository.Users.*;
import com.jmasters.demo.service.implementations.VerificationServiceImp;
import com.jmasters.demo.service.interfaces.VerificationService;
import com.jmasters.demo.service.storage.StorageProperties;
import com.jmasters.demo.service.storage.StorageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;

import java.io.File;

@SpringBootApplication
@EnableConfigurationProperties(StorageProperties.class)
public class DemoApplication  {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}
}
