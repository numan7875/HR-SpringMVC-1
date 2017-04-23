package spring.mvc.models;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.DiscriminatorValue;

@Entity
@DiscriminatorValue(value = "HRManager")
public class HRManager extends Person implements Serializable {
   
    public HRManager(){
        super();
    }
    
    public HRManager(String firstName, String lastName, String email, String phone, String mailingAddress,String password) {
        super(firstName, lastName, email, phone, mailingAddress,password);
    }
    
    public void submitFeedback() {
            // TODO - implement HRManager.submitFeedback
            throw new UnsupportedOperationException();
    }

    public void confirmInterview() {
            // TODO - implement HRManager.confirmInterview
            throw new UnsupportedOperationException();
    }

    public void letterOfOffer() {
            // TODO - implement HRManager.letterOfOffer
            throw new UnsupportedOperationException();
    }

    public void rejectionLetter() {
            // TODO - implement HRManager.rejectionLetter
            throw new UnsupportedOperationException();
    }

}
