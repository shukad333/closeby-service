package com.engine.closeby.closeby.controller;

import com.engine.closeby.closeby.model.Profession;
import com.engine.closeby.closeby.model.Professional;
import com.engine.closeby.closeby.repo.ProfessionalRepo;
import com.engine.closeby.closeby.service.ProfessionalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfessionalController {

    @Autowired
    private ProfessionalService professionalService;

    @PostMapping(value = "/professionals")
    public ResponseEntity<Professional> addNewProfessional(@RequestBody Professional professional) {



        Professional p = professionalService.save(professional);

        return new ResponseEntity<>(p, HttpStatus.CREATED);


    }

    @GetMapping(value = "/professionals")
    public ResponseEntity<List<Professional>> getAll() {
        return new ResponseEntity<>(professionalService.findAll(),HttpStatus.OK);
    }

    @PutMapping(value = "/professionals/{professionalId}/profession")
    public ResponseEntity<Professional> addProfession(@PathVariable("professionalId") Long professionalId, @RequestBody Profession profession) {

        return new ResponseEntity<>(professionalService.add(professionalId,profession),HttpStatus.CREATED);
    }
}
