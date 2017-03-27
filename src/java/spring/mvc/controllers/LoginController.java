/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import spring.mvc.models.Person;

/**
 *
 * @author M.Noman
 */

@Controller
@SessionAttributes("sessionPerson")
public class LoginController {
    
    @RequestMapping("/login")
    public String showLogin(){
        return "LogIn-SignUp/Login";
    }
    
    @RequestMapping(value = "/loginHR",method = RequestMethod.POST)
    public ModelAndView loginToHR(@ModelAttribute Person person){
        
        ModelAndView model = new ModelAndView();
        person = person.checkSignin();
        
        if(person != null && !person.getDecriminatorValue().equals("Applicant")){
            String type = person.getDecriminatorValue();
            model.addObject("sessionPerson",person);
            
            model.setViewName(type + "/Home");
        }else{
            model.setViewName("LogIn-SignUp/Login");
            model.addObject("message", "Email/Password is incorrect!");
        }
        
        return model;
    }
    
    
}
