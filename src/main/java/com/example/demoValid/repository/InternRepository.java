package com.example.demoValid.repository;

import com.example.demoValid.entity.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface InternRepository extends JpaRepository<Intern, Integer> {

    @Query("select i from Intern i where i.fullName like %?1%")
    List<Intern> findByName(String name);
}