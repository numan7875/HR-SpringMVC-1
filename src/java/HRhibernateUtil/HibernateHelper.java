/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HRhibernateUtil;

import static HRhibernateUtil.HRhibernateUtil.getSessionFactory;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import spring.mvc.models.Applicant;
import spring.mvc.models.Job;
import spring.mvc.models.Person;

/**
 *
 * @author M.Noman
 */
public class HibernateHelper {
    
    private static HibernateHelper mHibernateHelper = null;
    
    private HibernateHelper(){
        super();
    }
    
    public static HibernateHelper getInstance(){
        if(mHibernateHelper == null){
            mHibernateHelper = new HibernateHelper();
        }
        return mHibernateHelper;
    }
    
    public void create(Person person){
        Session sessionOf = getSessionFactory().openSession();

        sessionOf.beginTransaction();

        sessionOf.save(person);

        sessionOf.getTransaction().commit();

        sessionOf.close();
    }
     
    public void create(Job job){
        Session sessionOf = getSessionFactory().openSession();
        sessionOf.beginTransaction();
        sessionOf.save(job);
        sessionOf.getTransaction().commit();
        sessionOf.close();
    }
    
    public List<Job> getAllJobs(){
        List<Job> list;
        Session sessionOf = getSessionFactory().openSession();
        sessionOf.beginTransaction();
        
        Query query = sessionOf.createQuery("from Job");
        list = query.list();
        sessionOf.close();
        
        return list;
    }
    
    public Person isExist(Person person){
        
        Session sessionOf = getSessionFactory().openSession();
        sessionOf.beginTransaction();
        Query query = sessionOf.createQuery(
                "from Person as P where P.email = :email and P.password = :password")
                .setParameter("email", person.getEmail())
                .setParameter("password", person.getPassword());
        
        List<Person> list = query.list();
        
        sessionOf.close();
        
        if(list.size()>= 1)
            return list.get(0);
        return null;
    }
    
    public Job retrieveJob(Integer jobID){
        
        Session sessionOf = getSessionFactory().openSession();
        sessionOf.beginTransaction();
        
        Query query = sessionOf.createQuery(
                "from Job as j where j.id = :id")
                .setParameter("id", jobID);
        
        List<Job> list = query.list();
        sessionOf.close();
        
        if(list.size() >= 1){
            return list.get(0);
        }
        return null;
    }
    
    public List<Applicant> getAll(){
        Session sessionOf = getSessionFactory().openSession();
        sessionOf.beginTransaction();
        Person person = new Person("sdf", "sfds", "numan@gmail.com", "dfsf", "sfsd", "123456");
       Query query = sessionOf.createQuery(
                "from Person as P where P.experience is not null");
       
        List<Person> list1 = query.list();
        List<Applicant> list = query.list();
        sessionOf.close();
        return list;
    }
}
