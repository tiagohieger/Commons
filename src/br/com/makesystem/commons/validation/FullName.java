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
public class FullName {

    public static boolean isValid(final String fullName) {

        if (fullName == null || fullName.isEmpty()) {
            return false;
        }
        
        final String[] names = fullName.split(" ");
        
        if(names == null){
        	return false;
        }
        
        return fullName.replaceAll(" ", "").length() >= 5 && (names.length >= 2 ? !names[0].equalsIgnoreCase(names[1]) : false);
    }

}
