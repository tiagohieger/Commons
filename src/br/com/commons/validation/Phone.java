/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.commons.validation;

/**
 *
 * @author riche
 */
public class Phone {

    public static boolean isValid(final String phone) {

        if (phone == null || phone.trim().isEmpty() 
                || !phone.replaceAll("[0-9]", "").isEmpty() || phone.startsWith("0")) {
            return false;
        }
        return phone.trim().length() == 11 || phone.trim().length() == 10;
    }

}
