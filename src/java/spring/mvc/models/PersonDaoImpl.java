/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.mvc.models;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author numan
 */
@Repository
public class PersonDaoImpl implements PersonDao {

    private SessionFactory sessionFactory = HRhibernateUtil.HRhibernateUtil.getSessionFactory();
    
    @Override
    @SuppressWarnings("unchecked")
    public Person findByUserName(String email) {
        //To change body of generated methods, choose Tools | Templates.
        List<Person> persons;
        persons = sessionFactory.getCurrentSession()
                .createQuery("from Person where email = ?")
                .setParameter(0, email)
                .list();
        if(!persons.isEmpty()){
            return persons.get(0);
        }else{
            return null;
        }
    }
    
}
