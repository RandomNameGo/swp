package com.example.demoValid.service;

import com.example.demoValid.entity.Intern;

import java.util.List;
import java.util.Optional;

public interface InternService {

    List<Intern> findAllIntern();

    List<Intern> findInternByName(String name);

    Optional<Intern> findInternById(int id);

}
