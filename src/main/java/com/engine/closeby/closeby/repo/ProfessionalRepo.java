package com.engine.closeby.closeby.repo;

import com.engine.closeby.closeby.model.Professional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface ProfessionalRepo extends JpaRepository<Professional,Long> {
}
