package com.engine.closeby.closeby.repo;

import com.engine.closeby.closeby.model.Profession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessionRepo extends JpaRepository<Profession,Long> {
}
