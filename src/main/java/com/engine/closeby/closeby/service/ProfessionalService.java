package com.engine.closeby.closeby.service;

import com.engine.closeby.closeby.model.Profession;
import com.engine.closeby.closeby.model.Professional;
import com.engine.closeby.closeby.repo.ProfessionRepo;
import com.engine.closeby.closeby.repo.ProfessionalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessionalService {

    @Autowired
    private ProfessionalRepo professionalRepo;

    @Autowired
    private ProfessionRepo professionRepo;

    public Professional save(Professional p) {
        for(Profession profession : p.getProfessions()) {
            profession.setProfessional(p);
        }

        return professionalRepo.save(p);
    }


    public List<Professional> findAll() {

        return professionalRepo.findAll();
    }

    public Professional add(long professionalId,Profession profession) {

        Professional professional = professionalRepo.getById(professionalId);

        if(null==professional)
            return null;

        profession.setProfessional(professional);
        professionRepo.save(profession);
        return professionalRepo.findById(professional.getId()).get();


    }
}
