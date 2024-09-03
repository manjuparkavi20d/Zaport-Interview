package com.example.spaceMission.model;

import java.persistence.*;

@Entity
Public Class SpaceMissionModel{

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long Id;

    @NotBlank
    private String missionName;

    @NotBlank
    private LocalDate launchDate;

    private MissionType missionType;

    private MissionStatus status;

    private Integer crewSize;
}