package com.jmasters.demo.repository.Users;

import com.jmasters.demo.model.Users.MembreCun;
import com.jmasters.demo.model.Users.Validateur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ValidateurRepository   extends JpaRepository<Validateur, Long> {
}
