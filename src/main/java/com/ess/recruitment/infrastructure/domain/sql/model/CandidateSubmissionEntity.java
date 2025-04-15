package com.ess.recruitment.infrastructure.domain.sql.model;


import com.ess.recruitment.core.utils.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "CANDIDATE_SUBMISSION")
public class CandidateSubmissionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "CANDIDATE_ID")
    private String candidateId;

    @Column(name = "CANDIDATE_NAME")
    private String candidateName;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @Column(name = "MOBILE_NUMBER")
    private String mobileNumber;

    @Column(name = "EMAIL")
    private String email;

    @Column(name = "ROLE")
    private String role;

    @Column(name = "PREFERRED_JOB_ROLE")
    private String preferredJobRole;

    @Column(name = "EXPERIENCE")
    private int experience;

    @Column(name = "WORKING_STATUS")
    private String workingStatus;

    @Column(name = "NOTICE_PERIOD")
    private String noticePeriod;

    @Column(name = "STATUS")
    private String status;

    @Column(name = "CURRENT_CTC")
    private double currentCTC;

    @Column(name = "EXPECTED_CTC")
    private double expectedCTC;

    @Column(name = "DATE_OF_BIRTH")
    private LocalDate dateOfBirth;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "MARITAL_STATUS")
    private String maritalStatus;

    @Column(name = "COUNTRY")
    private String country;

    @Column(name = "PROVINCE")
    private String province;

    @Column(name = "ZIPCODE")
    private String zipcode;

    @Column(name = "CITY")
    private String city;

    @Column(name = "ADDRESS")
    private String address;

    @Column(name = "LINKEDIN")
    private String linkedIn;

    @Column(name = "PORTFOLIO_WEBSITE_URL")
    private String portfolioWebsiteUrl;

    @Column(name = "RESUME_CV_UPLOAD")
    private String resumeCVUpload;

//    @Column(name = "JOB_ID")
//    private String jobId;
//
//    @Column(name = "IS_ACTIVE")
//    private Integer delFlag = 1;
//
//    private String status;
//
//    @Column(name ="CANDIDATE_CODE")
//    private String candidateCode;
//
//    @Column(name = "FIRST_NAME")
//    private String firstName;
//
//    @Column(name = "MIDDLE_NAME")
//    private String middleName;
//
//    @Column(name = "LAST_NAME")
//    private String lastName;
//
//    @Column(name = "EMAIL")
//    private String email;
//
//    @Column(name = "MOBILE")
//    private String mobile;
//
//    @Column(name = "ADDRESS")
//    private String address;
//
//    @Column(name ="CITY")
//    private String city;
//
//    @Column(name = "ZIP")
//    private String zip;
//
//    @Column(name="State")
//    private String state;
//
//    @Column(name = "CURRENT_LOCATION")
//    private String currentLocation;
//
//    @Column(name = "TOTAL_EXPERIENCE")
//    private String totalExperience;
//
//    @Column(name = "RELEVANT_EXPERIENCE")
//    private String relevantExperience;
//
//    @Column(name = "NOTICE_PERIOD")
//    private String noticePeriod;
//
//    @Column(name = "CURRENT_ORGANIZATION")
//    private String currentOrganization;
//
//    @Column(name = "EXPECTED_CTC")
//    private String expectedCtc;
//
//    @Column(name = "RATE")
//    private String rate;
//
//   @Column(name = "CtcType")
//    private String ctcType; // Hourly/Monthly/Yearly
//
//    @Column(name = "LINKED_IN_URL")
//    private String linkedInUrl;
//
//    @Column(name = "ALTERNATE_CONTACT_NUMBER")
//    private String alternateContactNumber;
//
//    @Column(name = "WORK_AUTHORIZATION")
//    private String workAuthorization;
//
//    @Column(name = "WILLING_TO_RELOCATION")
//    private Boolean willingToRelocate;
//
//    @Column(name = "WORKED_WITH_CLIENT")
//    private Boolean workedWithClient;
//
//    @Column(name = "CLIENT_DETAILS")
//    private String clientDetails; // Only populated if workedWithClient is true
//
//    @Column(name = "COMMUNICATION_SKILLS")
//    private Integer communicationSkills; // Rating from 1 to 5
//
//    @Column(name="DEGREE")
//    private String degree;
//
//    @Column(name="UNIVERSITY")
//    private String university;
//
//    @Column(name = "YEAR_OF_PASSED")
//    @Temporal(TemporalType.DATE)
//    private Date yearOfPassed;
//
//    @Column(name = "country")
//    private String country;
//
//    @Column()
//    private Boolean consent;
//
//    @Column(name = "RESUME_FILE")
//    private String resumeFile; // URL or identifier for the resume file
//
//    @Column(name = "ID_PROOF_FILE")
//    private String idProofFile; // URL or identifier for the ID proof
}
