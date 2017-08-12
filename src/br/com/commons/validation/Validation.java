/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.commons.validation;

import java.util.Date;

/**
 *
 * @author riche
 */
public class Validation {
 
    public static boolean isDocumentValid(final String document){
        return Document.isValid(document);
    }
    
    public static boolean isCpfValid(final String cpf){
        return Document.isCpf(cpf);
    }
    
    public static boolean isCnpjValid(final String cnpj){
        return Document.isCnpj(cnpj);
    }
    
    public static boolean isCepValid(final String cep){
        return Cep.isValid(cep);
    }
    
    public static boolean isEmailValid(final String email){
        return Email.isValid(email);
    }
    
    public static boolean isPhoneValid(final String phone){
        return Phone.isValid(phone);
    }
    
    public static boolean isCreditCardValid(final String creditCard){
        return CreditCard.isValid(creditCard);
    }
    
    public static boolean isCvcValid(final String creditCard){
        return Cvc.isValid(creditCard);
    }
    
    public static boolean isRgValid(final String creditCard){
        return Rg.isValid(creditCard);
    }
    
    public static boolean isOver18YearsOld(final Date date){
        return Time.isOver18YearsOld(date);
    }
 
    public static boolean isFullNameValid(final String fullName){
        return FullName.isValid(fullName);
    }
    
    public static boolean isDateValid(final String pattern, final String date){
        return Time.isValid(pattern, date);
    }    
}
