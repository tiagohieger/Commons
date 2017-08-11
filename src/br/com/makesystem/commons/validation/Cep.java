
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
public class Cep {
    
    public static boolean isValid (final String cep) {

        if(cep == null || cep.isEmpty()){
            return false;
        }
        
        return !(cep.trim().length() != 8 || !cep.trim().matches("^[0-9]*\\d"));
    }
    
}
