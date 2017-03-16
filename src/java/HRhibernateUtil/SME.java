package HRhibernateUtil;

import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue("SME")
public class SME extends Person {

    public SME(String firstName, String lastName, String email, String phone, String mailingAddress,String password) {
        super(firstName, lastName, email, phone, mailingAddress,password);
    }

    public void confirmInterview() {
            // TODO - implement SME.confirmInterview
            throw new UnsupportedOperationException();
    }

    public void sendEmailtoInterviewer() {
            // TODO - implement SME.sendEmailtoInterviewer
            throw new UnsupportedOperationException();
    }

    public void provideRating() {
            // TODO - implement SME.provideRating
            throw new UnsupportedOperationException();
    }

}
