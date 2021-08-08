package com.engine.closeby.closeby.controller;

import com.engine.closeby.closeby.model.Professional;
import com.engine.closeby.closeby.repo.ProfessionalRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfessionalController {

    @Autowired
    private ProfessionalRepo professionalRepo;

    @PostMapping(value = "/professional")
    public ResponseEntity<Professional> addNewProfessional(@RequestBody Professional professional) {



        Professional p = professionalRepo.save(professional);

        return new ResponseEntity<>(p, HttpStatus.CREATED);


    }
}
