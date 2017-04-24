package spring.mvc.models;


import HRhibernateUtil.HibernateHelper;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import org.springframework.context.annotation.Scope;

@Entity
@Table(name = "PERSON")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue(value="person")
public class Person implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id",nullable = false)
    private Integer ID;

    @Column(name = "firstName",nullable = false,length = 20)
    private String firstName;

    @Column(name = "lastName",nullable = false,length = 20)
    private String lastName;

    @Column(name = "EMAIL",nullable = false,length = 50)
    private String email;
    
    @Column(name = "password",length = 100)
    private String password;

    @Column(name = "PHONE",nullable = false,length = 15)
    private String phone;

    @Column(name = "mailingAddress",nullable = false,length = 70)
    private String mailingAddress;
    
    @Column(name = "enabled",nullable = false)
    private boolean enabled;
    
    private transient Set<PersonRole> personRole = new HashSet<PersonRole>(0);

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    public Set<PersonRole> getPersonRole() {
        return personRole;
    }

    public void setPersonRole(Set<PersonRole> personRole) {
        this.personRole = personRole;
    }
    
    @Transient
    public String getDecriminatorValue() {
        return this.getClass().getAnnotation(DiscriminatorValue.class).value();
    }

    public Person() {
        super();
    }

    public Person(String firstName, String lastName, String email, String phone, String mailingAddress,String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.mailingAddress = mailingAddress;
        this.password = password;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getFirstName() {
            return this.firstName;
    }

    /**
     * 
     * @param firstName
     */
    public void setFirstName(String firstName) {
            // TODO - implement Person.setFirstName
            this.firstName = firstName;
    }

    public String getLastName() {
            return this.lastName;
    }

    /**
     * 
     * @param lastName
     */
    public void setLastName(String lastName) {
            // TODO - implement Person.setLastName
            this.lastName = lastName;
    }

    public String getName(){
        return firstName + " " + lastName;
    }
    
    public String getEmail() {
            return this.email;
    }

    /**
     * 
     * @param email
     */
    public void setEmail(String email) {
            // TODO - implement Person.setEmail
            this.email = email;
    }

    public String getPhone() {
            return this.phone;
    }

    /**
     * 
     * @param phone
     */
    public void setPhone(String phone) {
            // TODO - implement Person.setPhone
            this.phone = phone;
    }

    public String getMailingAddress() {
            return this.mailingAddress;
    }

    /**
     * 
     * @param mailingAddress
     */
    public void setMailingAddress(String mailingAddress) {
            // TODO - implement Person.setMailingAddress
            this.mailingAddress = mailingAddress;
    }
    
    public  Person checkSignin(){
        HibernateHelper obj = HibernateHelper.getInstance();
        Person person = obj.isExist(this);
        return person;
    }
}
