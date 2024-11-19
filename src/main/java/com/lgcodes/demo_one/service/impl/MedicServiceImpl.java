package com.lgcodes.demo_one.service.impl;

import com.lgcodes.demo_one.model.Medic;
import com.lgcodes.demo_one.repo.IGenericRepo;
import com.lgcodes.demo_one.repo.IMedicRepo;
import com.lgcodes.demo_one.service.IMedicService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class MedicServiceImpl extends CRUDImpl<Medic, Integer> implements IMedicService {

    private final IMedicRepo repo;

    @Override
    protected IGenericRepo<Medic, Integer> getRepo() {
        return repo;
    }
}
