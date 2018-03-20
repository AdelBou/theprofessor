package com.jmasters.demo.repository.Depot;

import com.jmasters.demo.model.Depot.Dossier;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DossierRepository extends JpaRepository<Dossier, Long> {
}
