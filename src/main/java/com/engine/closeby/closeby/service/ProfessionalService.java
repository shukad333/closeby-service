package com.engine.closeby.closeby.service;

import com.engine.closeby.closeby.model.Profession;
import com.engine.closeby.closeby.model.Professional;
import com.engine.closeby.closeby.repo.ProfessionalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalService {

    @Autowired
    private ProfessionalRepo professionalRepo;

    public Professional save(Professional p) {
        for(Profession profession : p.getProfessions()) {
            profession.setProfessional(p);
        }

        return professionalRepo.save(p);
    }


    public List<Professional> findAll() {

        return professionalRepo.findAll();
    }
}
