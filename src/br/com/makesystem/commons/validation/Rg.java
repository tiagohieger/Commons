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
public class Rg {

    public static boolean isValid(final String rg) {        
        return (rg != null && !rg.trim().isEmpty() && rg.replaceAll("[0-9]", "").isEmpty());
    }
    
}
