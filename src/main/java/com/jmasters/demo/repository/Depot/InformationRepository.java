package com.jmasters.demo.repository.Depot;

import com.jmasters.demo.model.Depot.Information;

import org.springframework.data.jpa.repository.JpaRepository;

public interface InformationRepository extends JpaRepository<Information, Long> {
}
