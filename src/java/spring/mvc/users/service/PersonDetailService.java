/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.mvc.users.service;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import spring.mvc.models.Person;
import spring.mvc.models.PersonDao;
import spring.mvc.models.PersonRole;

/**
 *
 * @author numan
 */
@Service("userDetailsService")
public class PersonDetailService implements UserDetailsService{

    @Autowired
    private PersonDao personDao;
    
    
    
    private List<GrantedAuthority> buildUserAuthority(Set<PersonRole> personRoles) {

        Set<GrantedAuthority> setAuths = new HashSet<>();

        // Build person's authorities
        personRoles.forEach((personRole) -> {
            setAuths.add(new SimpleGrantedAuthority(personRole.getUserRole()));
        });

        List<GrantedAuthority> Result = new ArrayList<>(setAuths);

        return Result;
    }
    
    // Converts Person person to
	// org.springframework.security.core.userdetails.User
	private User buildUserForAuthentication(Person person,
		List<GrantedAuthority> authorities) {
		return new User(person.getEmail(),person.getPassword()
                        ,person.isEnabled(),true,true,true,authorities);
	}
    
    
    
    @Override    
    @Transactional(readOnly=true)
    public UserDetails loadUserByUsername(String email)
            throws UsernameNotFoundException {
        //To change body of generated methods, choose Tools | Templates.
        Person person = personDao.findByUserName(email);
        List<GrantedAuthority> authorities =
                                      buildUserAuthority(person.getPersonRole());
        return buildUserForAuthentication(person, authorities);
    }
    
}
