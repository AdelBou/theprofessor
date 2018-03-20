package com.jmasters.demo.repository.Users;

import com.jmasters.demo.model.Users.Compte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteRepository extends  JpaRepository<Compte, Long> {

}
