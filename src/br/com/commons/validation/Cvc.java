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
public class Cvc {

    public static boolean isValid(final String cvc) {
        
        if(cvc == null || cvc.trim().isEmpty() || !cvc.replaceAll("[0-9]", "").isEmpty()){
            return false;
        }
        
        return cvc.trim().length() == 3;
    }
    
}
