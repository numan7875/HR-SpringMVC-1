/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.mvc.controllers;

import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import spring.mvc.models.Applicant;
import spring.mvc.models.HRPersonnal;
import spring.mvc.models.Job;

/**
 *
 * @author M.Noman
 */
@Controller
public class AjaxController {
    
    @RequestMapping(value = "/jobAdvertisement",method = RequestMethod.GET)
    public ModelAndView ajaxPage(){
        ModelAndView model = new ModelAndView();
        model.setViewName("HRPersonnal/JobAdvertisement");
        return model;
    }
    @RequestMapping(value = "/applicants",method = RequestMethod.GET)
    public ModelAndView showApplicants(HttpServletRequest request){
        ModelAndView model = new ModelAndView();
        HRPersonnal person = (HRPersonnal)request.getSession().getAttribute("sessionPerson");
        List<Applicant> list = person.getApplicant();
        
        List<Applicant> nonReviewedApp;
        List<Job> nonReviewedJob;
        
        nonReviewedApp = new ArrayList<>();
        nonReviewedJob = new ArrayList<>();
        
        list.stream().filter((applicant) -> 
                (!applicant.getNonReviewed().isEmpty())).map((applicant) -> {
            nonReviewedJob.addAll(applicant.getNonReviewed());
            return applicant;
        }).forEach((applicant) -> {
            nonReviewedApp.add(applicant);
        });
        
        model.addObject("nonReviewedApp",nonReviewedApp);
        model.addObject("nonReviewedJob",nonReviewedJob);
        
        model.setViewName("HRPersonnal/JobApplicants");
        return model;
    }
    @RequestMapping(value = "/interviewStatus",method = RequestMethod.GET)
    public ModelAndView showInterviewStatus(){
        ModelAndView model = new ModelAndView();
        model.setViewName("HRPersonnal/InterviewStatus");
        return model;
    }
    @RequestMapping(value = "/profile",method = RequestMethod.GET)
    public ModelAndView showProfile(){
        ModelAndView model = new ModelAndView();
        model.setViewName("LogIn-SignUp/EditProfile");
        return model;
    }
}
