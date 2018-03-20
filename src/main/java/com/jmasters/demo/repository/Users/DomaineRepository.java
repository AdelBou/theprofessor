package com.jmasters.demo.repository.Users;

import com.jmasters.demo.model.Users.Domaine;
import com.jmasters.demo.model.Users.Etablissement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DomaineRepository extends JpaRepository<Domaine, Long> {
}
