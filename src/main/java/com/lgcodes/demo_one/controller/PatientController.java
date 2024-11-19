package com.lgcodes.demo_one.controller;

import com.lgcodes.demo_one.dto.PatientDto;
import com.lgcodes.demo_one.model.Patient;
import com.lgcodes.demo_one.service.IPatientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@RestController
@RequestMapping("/patients")
public class PatientController {
    private final IPatientService service;
    private final ModelMapper modelMapper;

    @GetMapping
    public ResponseEntity<List<PatientDto>> findAll(){

        List<PatientDto> list = service.findAll().stream().map(this::convertToDto).collect(Collectors.toList());

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PatientDto> findById(@PathVariable Integer id){
        PatientDto patient = this.convertToDto(service.findById(id));
        return new ResponseEntity<>(patient, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<PatientDto> save(@Valid @RequestBody PatientDto patient){
        Patient patiento = service.save(this.convertToEntity(patient));
        return new ResponseEntity<>(this.convertToDto(patiento), HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PatientDto> update
            (@Valid @RequestBody PatientDto patient, @PathVariable Integer id){
        patient.setIdPatient(id);
        Patient patiento = service.update(this.convertToEntity(patient), id);
        return new ResponseEntity<>(this.convertToDto(patiento), HttpStatus.OK);
    }

    @DeleteMapping ("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        service.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    private PatientDto convertToDto(Patient patient){
        return modelMapper.map(patient, PatientDto.class);
    }
    private Patient convertToEntity(PatientDto patientDto){
        return modelMapper.map(patientDto, Patient.class);
    }
}
