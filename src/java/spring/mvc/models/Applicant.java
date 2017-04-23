package spring.mvc.models;


import HRhibernateUtil.HRhibernateUtil;
import HRhibernateUtil.HibernateHelper;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;

@Entity
@DiscriminatorValue("Applicant")
@WebService(serviceName = "ApplicantService")
public class Applicant extends Person implements Serializable{
    
    @Column(name = "srcOfInfo",length = 50)
    private String srcOfInfo;
    
    @Column(name = "experience",length = 15)
    private String experience;
    
    @Column(name = "cvPath",length = 100)
    private String cvPath;
    
    @Column(name = "coverLetter",length = 150)
    private String coverLetter;
    
    
    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "APPLICANT_JOB"
            ,joinColumns = {@JoinColumn(name = "person_id")}
            ,inverseJoinColumns = {@JoinColumn(name = "ID")})
    private transient List<Job> jopApp;

    public Applicant(){
        super();
        jopApp = new ArrayList<>();
    }
    
    public Applicant(String srcOfInfo, String experience, String cvPath, String coverLetter, String firstName, String lastName, String email, String phone, String mailingAddress,String password) {
        super(firstName, lastName, email, phone, mailingAddress,password);
        this.srcOfInfo = srcOfInfo;
        this.experience = experience;
        this.cvPath = cvPath;
        this.coverLetter = coverLetter;
    }
    public List<Job> getJopApp() {
        return jopApp;
    }
    
    public void setJopApp(List<Job> jopApp) {
        this.jopApp = jopApp;
    }
    
    public String getSrcOfInfo() {
            return this.srcOfInfo;
    }

    public void setSrcOfInfo(String srcOfInfo) {
            this.srcOfInfo = srcOfInfo;
    }

    public String getExperience() {
            return this.experience;
    }

    public void setExperience(String experience) {
            this.experience = experience;
    }

    public String getCvPath() {
            return this.cvPath;
    }

    public void setCvPath(String cvPath) {
            this.cvPath = cvPath;
    }

    public String getCoverLetter() {
            return this.coverLetter;
    }
    
    public List<Job> getNonReviewed(){
        List<Job> list;
        list = new ArrayList<>();
        
        jopApp.stream().filter((job) -> 
                (job.getStatus().equals("notreviewed"))).forEach((job) -> {
            list.add(job);
        });
        return list;
    }

    public void setCoverLetter(String coverLetter) {
            this.coverLetter = coverLetter;
    }

    public boolean applyforJob(Integer jobID) {
            // TODO - implement Applicant.applyforJob
            HibernateHelper h = HibernateHelper.getInstance();
            
            Job job = h.retrieveJob(jobID);
            
            jopApp.add(job);
            
            h.create(this);
            
            return false;
    }
    @WebMethod(operationName = "SearchByName")
    public  List<Applicant> searchByName( String name){
       try{
            List<Applicant> list = null;
            //HibernateHelper obj = HibernateHelper.getInstance();
            SessionFactory sessionFactory = HRhibernateUtil.getSessionFactory();
            if(!sessionFactory.getCurrentSession().getTransaction().isActive())
                sessionFactory.getCurrentSession().getTransaction().begin();
         
            Criterion crtrn = Restrictions.like("firstName","%" + name + "%");
            Criterion crtrn1 = Restrictions.like("lastName","%" + name + "%");
            list =  sessionFactory.getCurrentSession()
                    .createCriteria(Applicant.class)
                    .add(Restrictions.or(crtrn,crtrn1))
                    .list();

            sessionFactory.getCurrentSession().close();
            return list;
        }catch(RuntimeException re){
            return null;
        }
    }
   
}