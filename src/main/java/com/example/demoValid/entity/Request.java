package com.example.demoValid.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Nationalized;

@Getter
@Setter
@Entity
@Table(name = "request")
public class Request {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="user_id")
    @JsonIgnore
    private UserAccount userAccount;

    @Size(max = 50)
    @NotNull
    @NotEmpty
    @Nationalized
    @Column(name = "request_type", nullable = false, length = 50)
    private String requestType;

    @NotNull
    @NotEmpty
    @Nationalized
    @Lob
    @Column(name = "request_description", nullable = false)
    private String requestDescription;

    @Column(name = "request_status")
    private Integer requestStatus;

}