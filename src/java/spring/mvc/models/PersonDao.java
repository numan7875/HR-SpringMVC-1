/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spring.mvc.models;

/**
 *
 * @author numan
 */
public interface PersonDao {
    Person findByUserName(String email);
}
