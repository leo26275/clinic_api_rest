package com.lgcodes.demo_one.service;

import com.lgcodes.demo_one.model.Patient;
import com.lgcodes.demo_one.repo.IPatientRepo;
import com.lgcodes.demo_one.service.impl.IPatientServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class PatientService implements IPatientServiceImpl {
    private final IPatientRepo repo;

    @Override
    public Patient save(Patient patient) {
        return repo.save(patient);
    }

    @Override
    public Patient update(Patient patient, Integer id) {
        return repo.save(patient);
    }

    @Override
    public List<Patient> findAll() {
        return repo.findAll();
    }

    @Override
    public Patient fiendById(Integer id) {
        Optional<Patient> op = repo.findById(id);
        return op.isPresent() ? op.get() : new Patient();
    }

    @Override
    public void delete(Integer id) {
        repo.deleteById(id);
    }
}
