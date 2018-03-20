package com.jmasters.demo.repository.Users;

import com.jmasters.demo.model.Users.Utilisateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {
}
