package com.systex.springboot.demo1.domain.common.service;

import com.systex.springboot.demo1.domain.PointType;
import com.systex.springboot.demo1.domain.common.repository.PointTypeRepository;

import java.util.List;
import java.util.UUID;

public class PointTypeServiceImpl implements PointTypeService{
    private PointTypeRepository repository;

    public PointTypeServiceImpl(PointTypeRepository repository) {
        this.repository = repository;
    }

    @Override
    public UUID createPointType(PointType type) {
        UUID id=repository.save(type);
        return id;
    }

    @Override
    public List<PointType> allTypes() {
        return repository.getAll();
    }
}

