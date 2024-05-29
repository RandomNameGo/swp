package com.example.demoValid.service;

import com.example.demoValid.entity.Intern;
import com.example.demoValid.repository.InternRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class InternServiceImpl implements InternService {

    @Autowired
    private InternRepository internRepository;

    @Override
    public List<Intern> findAllIntern() {
        return internRepository.findAll();
    }

    @Override
    public List<Intern> findInternByName(String name) {
        return internRepository.findByName(name);
    }

    @Override
    public Optional<Intern> findInternById(int id) {
        return internRepository.findById(id);
    }
}
