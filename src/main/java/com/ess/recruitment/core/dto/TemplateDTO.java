package com.ess.recruitment.core.dto;

import com.ess.recruitment.core.utils.WorkType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TemplateDTO implements Serializable {

    private Long templateId;
    private String title;
    private  int status;
    private String templateCode;
    private List<String> primarySkills=new ArrayList<>();
    private List<String> secondarySkills=new ArrayList<>();
    private  List<String> technicalSkills=new ArrayList<>();
    private String city;
    private String country;
    private String state;
    private int workExperience;
    private WorkType workType;
    private String languagesRequired;
    private String jobDescription;
    private String approvalFlow;
    private String qualifications;

}
