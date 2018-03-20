package com.jmasters.demo.repository.Users;

import com.jmasters.demo.model.Users.Compte;
import com.jmasters.demo.model.Users.MembreCun;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MembreCunRepository extends JpaRepository<MembreCun, Long> {
}
