package HRhibernateUtil;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue(value = "HRPersonnal")
public class HRPersonnal extends Person {

    public HRPersonnal(String firstName, String lastName, String email, String phone, String mailingAddress,String password) {
        super(firstName, lastName, email, phone, mailingAddress,password);
    }

    public void advertiseJob() {
            // TODO - implement HRPersonnal.advertiseJob
            throw new UnsupportedOperationException();
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
