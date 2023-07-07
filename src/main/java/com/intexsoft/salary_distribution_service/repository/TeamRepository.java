package com.intexsoft.salary_distribution_service.repository;

import com.intexsoft.salary_distribution_service.model.db.Team;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface TeamRepository extends JpaRepository<Team, Long> {
    List<Team> findAllByCodenameContainsAllIgnoreCase(String codename);
}
