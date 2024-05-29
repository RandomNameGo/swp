package com.example.demoValid.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

import java.time.LocalDate;

@Getter
@Setter
@Entity
@Table(name = "intern")
public class Intern {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "intern_id", nullable = false)
    private Integer id;

    @NotNull
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private UserAccount user;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "company_id", nullable = false)
    private Company company;

    @Size(max = 50)
    @NotNull
    @Nationalized
    @Column(name = "full_name", nullable = false, length = 50)
    private String fullName;

    @Column(name = "date_of_birth")
    private LocalDate dateOfBirth;

    @Nationalized
    @Lob
    @Column(name = "work_history")
    private String workHistory;

    @Nationalized
    @Lob
    @Column(name = "education_background")
    private String educationBackground;

    @Column(name = "task_result")
    private Integer taskResult;

}