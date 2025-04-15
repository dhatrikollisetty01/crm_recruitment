package com.ess.recruitment.infrastructure.domain.sql.model;

import com.ess.recruitment.core.utils.*;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table
public class JobsEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "JOB_ID")
    private Long jobId;

    @NotBlank(message = "Job code must not be empty")
    @Column(name = "JOB_CODE")
    private String jobCode;


    private String status;


    @Column(name = "JOB_TITLE")
    private String jobTitle;

    @NotNull(message = "Active status must be specified")
    @Column(name = "IS_ACTIVE")
    private Integer delFlag = 1;  // Default to active

    @NotNull(message = "Employment type is required")
    @Enumerated(EnumType.STRING)
    private EmploymentType employmentType;

    @NotEmpty(message = "Primary skills must not be empty")
    @ElementCollection
    @Column(name = "PRIMARY_SKILLS")
    private List<String> primarySkills;

    @ElementCollection
    @Column(name = "SECONDARY_SKILLS")
    private List<String> secondarySkills;


    @Column(name = "WORK_EXPERIENCE")
    private int workExperience;


    @Column(name = "NO_OF_POSITIONS")
    private int noOfPositions;


    @Column(name = "TECHNOLOGY")
    private String technology;


    @Column(name = "JOB_DESCRIPTION")
    private String jobDescription;


    @Column(name = "REL_EXP")
    private int relevantExperience;


    @Column(name = "DOMAIN")
    private String domain;


    @Column(name = "PAY_RATE")
    private String payRate;


    @Column(name = "TA_ASSIGNEE")
    private String taAssignee;


    @Column(name = "LOCATION")
    private String location;


    @Column(name = "CREATE_DATE")
    private Date createDate;


    @Column(name = "TARGET_DATE")
    private Date targetDate;


    @Enumerated(EnumType.STRING)
    private WorkType workType;


    @Column(name = "LANGUAGES_REQUIRED")
    private String languagesRequired;


    @Enumerated(EnumType.STRING)
    private Priority priority;


    @Column(name = "PROJECT_ID")
    private String projectId;


    @Column(name = "CLIENT_JOB_ID")
    private String clientJobId;


    @Column(name = "NO_OF_SUBMISSION")
    private int noOfSubmission;


    @Column(name = "VENDOR")
    private String vendor;


    @ElementCollection
    @Column(name = "ACCOUNT_MANAGER")
    private List<String> accountManager;
}
