/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.mvc.models;

import HRhibernateUtil.HibernateHelper;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author M.Noman
 */
@Entity
@Table(name = "JOB")
public class Job implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;
    
    @Column(name = "jobTitle",nullable = false,length = 30)
    private String jobTitle;
    
    @Column(name = "jobExperience",nullable = false,length = 15)
    private String jobExperience;
   
    @Column(name = "jobDescription",nullable = false,length = 500)
    private String jobDescription;
    
    @Column(name = "status",nullable = false,columnDefinition = "varchar(15) default 'notreviewed'")
    private String status = "notreviewed";
    
    @ManyToOne
    @JoinColumn(name = "HRPERSON_ID")
    private HRPersonnal hrPersonnal;

    public Job() {
        super();
    }
    
    public Job(String jobTitle, String jobExperience, String jobDescription) {
        this.jobTitle = jobTitle;
        this.jobExperience = jobExperience;
        this.jobDescription = jobDescription;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public HRPersonnal getHrPersonnal() {
        return hrPersonnal;
    }

    public void setHrPersonnal(HRPersonnal hrPersonnal) {
        this.hrPersonnal = hrPersonnal;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobExperience() {
        return jobExperience;
    }

    public void setJobExperience(String jobExperience) {
        this.jobExperience = jobExperience;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
    
     public List<Job> getAll(){
        HibernateHelper obj = HibernateHelper.getInstance();
        List<Job> list = obj.getAllJobs();
        return list;
    }
     public void createJob(){
         HibernateHelper obj = HibernateHelper.getInstance();
         obj.create(this);
     }
}
