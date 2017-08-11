/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.makesystem.commons.validation;

import java.util.Date;

// Não funciona no GWT
// import java.util.Calendar;
// import java.util.regex.Pattern;

/**
 *
 * @author riche
 */
public class Time {

    public static boolean isOver18YearsOld(final Date date) {
        return ((new Date()).getTime() - date.getTime()) >= 567648000000L;
    }

    private static final String dd = "dd";
    private static final String MM = "MM";
    private static final String yyyy = "yyyy";
    private static final String HH = "HH";
    private static final String mm = "mm";
    private static final String ss = "ss";

    public static boolean isValid(final String pattern, final String date) {

        if (pattern == null || pattern.trim().isEmpty()) {
            return false;
        } else if (date == null || date.trim().isEmpty()) {
            return false;
        }

        final int startDay = pattern.indexOf(dd);
        final int endDay = startDay + dd.length();

        final int startMonth = pattern.indexOf(MM);
        final int endMonth = startMonth + MM.length();

        final int startYear = pattern.indexOf(yyyy);
        final int endYear = startYear + yyyy.length();

        final int startHour = pattern.indexOf(HH);
        final int endHour = startHour + HH.length();

        final int startMinute = pattern.indexOf(mm);
        final int endMinute = startMinute + mm.length();

        final int startSecond = pattern.indexOf(ss);
        final int endSecond = startSecond + ss.length();

        if (startDay < 0
                && startMonth < 0
                && startYear < 0
                && startHour < 0
                && startMinute < 0
                && startSecond < 0) {
            return false;
        }

        try {

            final int day = startDay < 0 ? 1 : Integer.parseInt(date.substring(startDay, endDay));
            final int month = startMonth < 0 ? 1 : Integer.parseInt(date.substring(startMonth, endMonth));
            final int year = startYear < 0 ? 1900 : Integer.parseInt(date.substring(startYear, endYear));
            final int hour = startHour < 0 ? 0 : Integer.parseInt(date.substring(startHour, endHour));
            final int minute = startMinute < 0 ? 0 : Integer.parseInt(date.substring(startMinute, endMinute));
            final int second = startSecond < 0 ? 0 : Integer.parseInt(date.substring(startSecond, endSecond));
            
            if (day < 1 || day > 31) {
                return false;
            } else if (month < 1 || month > 12) {
                return false;
            } else if (year < 1900 || year > 2100) {
                return false;
            } else if (hour < 0 || hour > 23) {
                return false;
            } else if (minute < 0 || minute > 59) {
                return false;
            } else if (second < 0 || second > 59) {
                return false;
            }

            final int daysInCurrentMonth = new Date(year-1900, month, 0).getDate();
                       
            if(day > daysInCurrentMonth){
                return false;
            }

        } catch (Throwable throwable) {
            return false;
        }

        return true;
    }
}
