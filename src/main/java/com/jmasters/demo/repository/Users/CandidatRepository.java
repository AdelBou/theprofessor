package com.jmasters.demo.repository.Users;

import com.jmasters.demo.model.Users.Candidat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CandidatRepository extends JpaRepository<Candidat, Long> {
}
