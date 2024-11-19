package com.lgcodes.demo_one.service.impl;

import com.lgcodes.demo_one.model.Patient;
import com.lgcodes.demo_one.repo.IGenericRepo;
import com.lgcodes.demo_one.repo.IPatientRepo;
import com.lgcodes.demo_one.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@Service
public class PatientServiceImpl extends CRUDImpl<Patient, Integer> implements IPatientService {

    private final IPatientRepo repo;

    @Override
    protected IGenericRepo<Patient, Integer> getRepo() {
        return repo;
    }
}
