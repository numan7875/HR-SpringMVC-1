/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.mvc.models;

import java.io.Serializable;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
/**
 *
 * @author numan
 */

@Entity
@Table(name = "user_roles",
	uniqueConstraints = @UniqueConstraint(
		columnNames = { "userrole", "EMAIL" }))
public class PersonRole implements Serializable {
    

	private Integer userRoleId;
	private transient Person user;
	private String userRole;

	public PersonRole() {
	}

	public PersonRole(Person user, String userRole) {
		this.user = user;
		this.userRole = userRole;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "user_role_id",
		unique = true, nullable = false)
	public Integer getUserRoleId() {
		return this.userRoleId;
	}

	public void setUserRoleId(Integer userRoleId) {
		this.userRoleId = userRoleId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EMAIL", nullable = false)
	public Person getUser() {
		return this.user;
	}

	public void setUser(Person user) {
		this.user = user;
	}

	@Column(name = "userrole", nullable = false, length = 45)
	public String getUserRole() {
		return this.userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

}
