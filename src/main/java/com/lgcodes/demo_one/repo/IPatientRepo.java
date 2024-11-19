package com.lgcodes.demo_one.repo;

import com.lgcodes.demo_one.model.Patient;
import org.springframework.stereotype.Repository;

@Repository
public interface IPatientRepo extends IGenericRepo<Patient, Integer> {

}
