package com.jmasters.demo.repository.Evaluation;

import com.jmasters.demo.model.Evaluation.Grille;
import com.jmasters.demo.model.Users.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrilleRepository extends JpaRepository<Grille, Long> {
}
