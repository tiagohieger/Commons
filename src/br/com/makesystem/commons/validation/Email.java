/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.makesystem.commons.validation;

/**
 *
 * @author riche
 */
public class Email {

    public static boolean isValid(final String email) {

        if (email == null || email.isEmpty()) {
            return false;
        }
        
        return email.matches(
                "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
    }

}
