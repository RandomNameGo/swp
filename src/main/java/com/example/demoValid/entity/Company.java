package com.example.demoValid.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "company")
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "company_id", nullable = false)
    private Integer id;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "company_name", nullable = false, length = 50)
    private String companyName;

    @NotNull
    @Nationalized
    @Lob
    @Column(name = "description", nullable = false)
    private String description;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "location", nullable = false, length = 50)
    private String location;

}