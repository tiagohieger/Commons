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
public class Document {

    private static final int[] pesoCpf = {11, 10, 9, 8, 7, 6, 5, 4, 3, 2};
    private static final int[] pesoCnpj = {6, 5, 4, 3, 2, 9, 8, 7, 6, 5, 4, 3, 2};

    private static int calcularDigito(String str, int[] peso) {
        int soma = 0;
        for (int indice = str.length() - 1, digito; indice >= 0; indice--) {
            digito = Integer.parseInt(str.substring(indice, indice + 1));
            soma += digito * peso[peso.length - str.length() + indice];
        }
        soma = 11 - soma % 11;
        return soma > 9 ? 0 : soma;
    }

    public static boolean isCpf(String cpf) {
        if (cpf == null || cpf.length() != 11) {
            return false;
        }
        
        if(cpf.replaceAll(cpf.substring(0, 1), "").isEmpty()){
            return false;
        }

        final Integer digit1 = calcularDigito(cpf.substring(0, 9), pesoCpf);
        final Integer digit2 = calcularDigito(cpf.substring(0, 9) + digit1, pesoCpf);
        return cpf.equals(cpf.substring(0, 9) + digit1.toString() + digit2.toString());
    }

    public static boolean isCnpj(String cnpj) {
        if (cnpj == null || cnpj.length() != 14) {
            return false;
        }

        if(cnpj.replaceAll(cnpj.substring(0, 1), "").isEmpty()){
            return false;
        }
        
        final Integer digit1 = calcularDigito(cnpj.substring(0, 12), pesoCnpj);
        final Integer digit2 = calcularDigito(cnpj.substring(0, 12) + digit1, pesoCnpj);
        return cnpj.equals(cnpj.substring(0, 12) + digit1.toString() + digit2.toString());
    }

    public static boolean isValid(String document) {
        return isCnpj(document) || isCpf(document);
    }

}
