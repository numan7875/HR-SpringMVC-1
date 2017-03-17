package HRhibernateUtil;


import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Applicant")
public class Applicant extends Person {
    
    @Column(name = "srcOfInfo")
    private String srcOfInfo;
    
    @Column(name = "experience")
    private String experience;
    
    @Column(name = "cvPath")
    private String cvPath;
    
    @Column(name = "coverLetter")
    private String coverLetter;

    public Applicant(String srcOfInfo, String experience, String cvPath, String coverLetter, String firstName, String lastName, String email, String phone, String mailingAddress,String password) {
        super(firstName, lastName, email, phone, mailingAddress,password);
        this.srcOfInfo = srcOfInfo;
        this.experience = experience;
        this.cvPath = cvPath;
        this.coverLetter = coverLetter;
    }

    public Applicant(String firstName, String lastName, String email, String phone, String mailingAddress,String password) {
        super(firstName, lastName, email, phone, mailingAddress,password);
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

    public void setCoverLetter(String coverLetter) {
            this.coverLetter = coverLetter;
    }

    public boolean applyforJob() {
            // TODO - implement Applicant.applyforJob
            throw new UnsupportedOperationException();
    }

}
