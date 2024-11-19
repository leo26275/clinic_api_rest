package com.lgcodes.demo_one.repo;

import com.lgcodes.demo_one.model.Medic;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicRepo extends IGenericRepo<Medic,Integer> {
}
