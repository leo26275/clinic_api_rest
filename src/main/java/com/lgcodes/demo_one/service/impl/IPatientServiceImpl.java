package com.lgcodes.demo_one.service.impl;

import com.lgcodes.demo_one.model.Patient;

import java.util.List;

public interface IPatientServiceImpl {
    Patient save(Patient patient);
    Patient update(Patient patient, Integer id);
    List<Patient> findAll();
    Patient fiendById(Integer id);
    void delete(Integer id);
}
