/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.context.annotation.Scope;
import spring.mvc.models.Job;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import spring.mvc.models.HRPersonnal;
import spring.mvc.models.Person;

/**
 *
 * @author M.Noman
 */

@Controller
@SessionAttributes("sessionPerson")
public class HRPersonnalController {
    
    @RequestMapping(value = "/jobAd",method = RequestMethod.POST)
    public ModelAndView advertiseJob(@ModelAttribute Job job,@ModelAttribute("sessionPerson") Person person){
       
        job.setHrPersonnal((HRPersonnal)person);
        
        job.createJob();
        
        ModelAndView model = new ModelAndView("HRPersonnal/Home");
        model.addObject("create","Job Posted");
        return model;
    }
}
