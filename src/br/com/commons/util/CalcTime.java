/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.commons.util;

import java.util.Date;

/**
 *
 * @author Richeli Vargas
 */
public class CalcTime {

    public static int daysBetween(Date d1, Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
    }
    
    public static int hoursBetween(Date d1, Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60 * 60));
    }
    
    public static int minutesBetween(Date d1, Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / (1000 * 60));
    }
    
    public static int secondsBetween(Date d1, Date d2) {
        return (int) ((d2.getTime() - d1.getTime()) / 1000);
    }
    
    public static int countDays(long time) {
        return (int) (time / (1000 * 60 * 60 * 24));
    }
    
    public static int countHours(long time) {
        return (int) (time / (1000 * 60 * 60));
    }
    
    public static int countMinutes(long time) {
        return (int) (time / (1000 * 60));
    }
    
    public static int countSeconds(long time) {
        return (int) (time / 1000);
    }

}
