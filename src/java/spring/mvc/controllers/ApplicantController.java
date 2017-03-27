/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.mvc.controllers;

import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import spring.mvc.models.Job;
import spring.mvc.models.Applicant;

/**
 *
 * @author M.Noman
 */
@Controller
public class ApplicantController {
    
    @RequestMapping(value = "/hello")
    public ModelAndView initializeApplicantPage(HttpServletRequest request, HttpServletResponse reponse){
        ModelAndView mv = new ModelAndView("index");
        
        Job job = new Job();
        List<Job> list = job.getAll();
        
        mv.addObject("jobs", list);
        return mv;
    }
    
    @RequestMapping(value = "/jobApplication",method = RequestMethod.POST)
    public String applyForJob(@ModelAttribute Applicant person
            ,@RequestParam("jobID") String jobID
                                    /*,@RequestParam("description") String description*/){
     
        person.applyforJob(Integer.parseInt(jobID));
        
        
        return "redirect:hello";
    }
    

}
