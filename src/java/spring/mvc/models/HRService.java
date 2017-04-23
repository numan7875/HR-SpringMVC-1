/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.mvc.models;

import java.util.List;
import javax.jws.WebService;

/**
 *
 * @author numan
 */
@WebService(serviceName = "HRSystemService")
public class HRService {
    public List<Job> getAllJob(){
        return new Job().getAll();
    }
    public List<Applicant> searchApplicantbyName(String name){
        return new Applicant().searchByName(name);
    }
    public String searchById(int id){
        return new Job().searchByID(id);
    }
}
