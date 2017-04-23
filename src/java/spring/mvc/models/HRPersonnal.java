package spring.mvc.models;

import HRhibernateUtil.HibernateHelper;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

@Entity
@DiscriminatorValue(value = "HRPersonnal")
public class HRPersonnal extends Person implements Serializable{
    
    
    @OneToMany(mappedBy = "hrPersonnal",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private transient List<Job> jobAd;

    public HRPersonnal() {
        super();
        jobAd = new ArrayList<>();
    }
    
    public HRPersonnal(String firstName, String lastName, String email, String phone, String mailingAddress,String password) {
        super(firstName, lastName, email, phone, mailingAddress,password);
    }

    public List<Job> getJobAd() {
        return jobAd;
    }

    public void setJobAd(List<Job> jobAd) {
        this.jobAd = jobAd;
    }

    public void advertiseJob() {
            // TODO - implement HRPersonnal.advertiseJob
            throw new UnsupportedOperationException();
    }

    public List<Applicant> getApplicant(){
        HibernateHelper h = HibernateHelper.getInstance();
        List<Applicant> list = h.getAll();
        return list;
    }
    
    public void reviewApplication() {
            // TODO - implement HRPersonnal.reviewApplication
            throw new UnsupportedOperationException();
    }

    public void sendCallforInterview() {
            // TODO - implement HRPersonnal.sendCallforInterview
            throw new UnsupportedOperationException();
    }

    public void rejectionLetter() {
            // TODO - implement HRPersonnal.rejectionLetter
            throw new UnsupportedOperationException();
    }

    public void sendEmailtoSME() {
            // TODO - implement HRPersonnal.sendEmailtoSME
            throw new UnsupportedOperationException();
    }

    public void viewRatings() {
            // TODO - implement HRPersonnal.viewRatings
            throw new UnsupportedOperationException();
    }

    public void topFive() {
            // TODO - implement HRPersonnal.topFive
            throw new UnsupportedOperationException();
    }

}
