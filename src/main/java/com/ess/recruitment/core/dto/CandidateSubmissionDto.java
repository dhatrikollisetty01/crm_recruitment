package com.ess.recruitment.core.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CandidateSubmissionDto {
    private Long id;
    private String candidateId;
    private String candidateName;
    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String email;
    private String role;
    private String preferredJobRole;
    private int experience;
    private String workingStatus;
    private String noticePeriod;
    private String status;
    private double currentCTC;
    private double expectedCTC;
    private LocalDate dateOfBirth;
    private String gender;
    private String maritalStatus;
    private String country;
    private String province;
    private String zipcode;
    private String city;
    private String address;
    private String linkedIn;
    private String portfolioWebsiteUrl;
    private String resumeCVUpload;




//    private String candidateCode;
//    private String jobId;
//    private int delFlag =1;
//    private String firstName;
//    private String middleName;
//    private String lastName;
//    private String email;
//    private String mobile;
//    private String address;
//    private String city;
//    private String zip;
//    private String state;
//    private String currentLocation;
//    private String totalExperience;
//    private String relevantExperience;
//    private String noticePeriod;
//    private String currentOrganization;
//    private String expectedCtc;
//    private String rate;
//    private String ctcType; // Hourly/Monthly/Yearly
//    private String linkedInUrl;
//    private String alternateContactNumber;
//    private String workAuthorization;
//    private Boolean willingToRelocate;
//    private Boolean workedWithClient;
//    private String clientDetails; // Textbox if worked with client is Yes
//    private Integer communicationSkills; // Rating 1 to 5
//    private String degree;
//    private String university;
//    private Date yearOfPassed;
//    private String country;
//    private Boolean consent;
//    private String resumeFile; // URL or identifier for the resume file
//    private String idProofFile;// URL or identifier for the ID proof
}
