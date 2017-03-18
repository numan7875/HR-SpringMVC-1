/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.mvc.controllers;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;
import spring.mvc.models.Person;

/**
 *
 * @author M.Noman
 */

@Controller
public class LoginController {
    
    @RequestMapping("/login")
    public String showLogin(){
        return "LogIn-SignUp/Login";
    }
    @RequestMapping(value = "/loginHR",method = RequestMethod.POST)
    public String PostLogin(@ModelAttribute Person person){
        
        return "index";
    }
    @RequestMapping(value = "/loginHR",method = RequestMethod.GET)
    public String getLogin(Model model){
        Person person = new Person();
        model.addAttribute("loginPerson", person);
        return "LogIn-SignUp/Login";
    }
}
