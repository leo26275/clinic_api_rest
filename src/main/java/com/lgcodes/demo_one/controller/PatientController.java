package com.lgcodes.demo_one.controller;

import com.lgcodes.demo_one.model.Patient;
import com.lgcodes.demo_one.service.PatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/patients")
public class PatientController {
    private final PatientService service;

    @GetMapping
    public List<Patient> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Patient findById(@PathVariable Integer id){
        return service.fiendById(id);
    }

    @PostMapping
    public Patient save(@RequestBody Patient patient){
        return service.save(patient);
    }

    @PutMapping("/{id}")
    public Patient update(@RequestBody Patient patient, @PathVariable Integer id){
        patient.setIdPatient(id);
        return service.save(patient);
    }

    @DeleteMapping ("/{id}")
    public void delete(@PathVariable Integer id){
        service.delete(id);
    }
}
