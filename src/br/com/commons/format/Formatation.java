/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.commons.format;

import br.com.commons.base.HasLanguage;
import br.com.commons.base.Language;
import br.com.commons.util.CalcTime;
import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Richeli Vargas
 */
public class Formatation {

    public static String document(final String document) {

        final StringBuilder formatedDocument = new StringBuilder();

        // cnpj
        if (document.length() == 14) {
            formatedDocument.append(document.substring(0, 2));
            formatedDocument.append(".");
            formatedDocument.append(document.substring(2, 5));
            formatedDocument.append(".");
            formatedDocument.append(document.substring(5, 8));
            formatedDocument.append("/");
            formatedDocument.append(document.substring(8, 12));
            formatedDocument.append("-");
            formatedDocument.append(document.substring(12, 14));
        } // cpf
        else if (document.length() == 11) {
            formatedDocument.append(document.substring(0, 3));
            formatedDocument.append(".");
            formatedDocument.append(document.substring(3, 6));
            formatedDocument.append(".");
            formatedDocument.append(document.substring(6, 9));
            formatedDocument.append("-");
            formatedDocument.append(document.substring(9, 11));
        }

        return formatedDocument.toString();

    }

    /**
     *
     * @param seg
     * @return HH:mm:ss
     */
    public static String seconds(final int seg) {

        if (seg < 0) {
            return "??:??:??";
        }

        final int segundos = (seg % 60);
        final int minutos = (seg / 60) % 60;
        final int horas = (seg / 60) / 60;

        final StringBuffer builder = new StringBuffer();

        if (horas < 10) {
            builder.append("0");
        }
        builder.append(horas);

        builder.append(":");

        if (minutos < 10) {
            builder.append("0");
        }
        builder.append(minutos);

        builder.append(":");

        if (segundos < 10) {
            builder.append("0");
        }
        builder.append(segundos);

        return builder.toString();
    }

    /**
     *
     * @param seg
     * @return
     */
    public static String secondsII(final int seg) {

        if (seg < 0) {
            return "??h ??min";
        }

        // final int segundos = (seg % 60);
        final int minutos = (seg / 60) % 60;
        final int horas = (seg / 60) / 60;

        final StringBuffer builder = new StringBuffer();

        builder.append(horas);
        builder.append("h ");
        builder.append(minutos);
        builder.append("min");

        return builder.toString();
    }

    public static String secondsIII(final int seg) {

        if (seg < 0) {
            return "??:??";
        }

        final int segundos = (seg % 60);
        final int minutos = (seg / 60) % 60;

        final StringBuffer builder = new StringBuffer();

        if (minutos < 10) {
            builder.append("0");
        }
        builder.append(minutos);

        builder.append(":");

        if (segundos < 10) {
            builder.append("0");
        }
        builder.append(segundos);

        return builder.toString();
    }

    public static String phoneNumber(final String phone) {

        final StringBuilder formated = new StringBuilder();

        formated.append("(");
        formated.append(phone.substring(0, 2));
        formated.append(") ");
        formated.append(phone.substring(2, phone.length() - 4));
        formated.append("-");
        formated.append(phone.substring(phone.length() - 4));

        return formated.toString();
    }

    public static String currency(final double value) {

        final BigDecimal bigDecimal = new BigDecimal(String.valueOf(value)).setScale(2, BigDecimal.ROUND_FLOOR);
        final String[] values = bigDecimal.toString().split("\\.");

        final StringBuilder builder = new StringBuilder(values[0]);

        final int countDot = (builder.toString().length() / 3) - (builder.toString().length() % 3 == 0 ? 1 : 0);

        for (int i = 0, p = 1; i < countDot; i++, p++) {
            builder.insert(builder.toString().length() - ((3 * p) + i), ".");
        }

        builder.append(",");
        builder.append(values[1]);

        return builder.toString();
    }

    public static String integer(final double value) {

        final BigDecimal bigDecimal = new BigDecimal(String.valueOf(value)).setScale(2, BigDecimal.ROUND_FLOOR);
        final String[] values = bigDecimal.toString().split("\\.");

        final StringBuilder builder = new StringBuilder(values[0]);

        final int countDot = (builder.toString().length() / 3) - (builder.toString().length() % 3 == 0 ? 1 : 0);

        for (int i = 0, p = 1; i < countDot; i++, p++) {
            builder.insert(builder.toString().length() - ((3 * p) + i), ".");
        }

        return builder.toString();
    }

    public static String bytes(final long size) {

        final String value = String.valueOf(size);
        final int length = value.length();

        if (length > 15) {
            return ((int) ((double) size / (Math.pow(1000, 5)))) + " HB";
        } else if (length > 12) {
            return ((int) ((double) size / (Math.pow(1000, 4)))) + " TB";
        } else if (length > 9) {
            return ((int) ((double) size / (Math.pow(1000, 3)))) + " GB";
        } else if (length > 6) {
            return ((int) ((double) size / (Math.pow(1000, 2)))) + " MB";
        } else if (length > 3) {
            return ((int) ((double) size / (Math.pow(1000, 1)))) + " KB";
        } else {
            return size + " Bytes";
        }
    }

    public static String barcode(final String barcodeNumber) {

        if (barcodeNumber == null) {
            return "";
        }

        final StringBuilder builder = new StringBuilder();

        final String[] chars = barcodeNumber.split("");

        int count = 0;
        for (String character : chars) {
            builder.append(character);
            count++;

            switch (count) {
                case 5:
                case 15:
                case 26:
                    builder.append(".");
                    break;
                case 10:
                case 21:
                case 32:
                case 33:
                    builder.append(" ");
                    break;
            }
        }

        return builder.toString();
    }

    public static String dateTime(final Date date) {
        return date(date) + " " + time(date);
    }

    @SuppressWarnings("deprecation")
    public static String date(final Date date) {

        if (date == null) {
            return "??/??/????";
        }

        final StringBuilder formated = new StringBuilder();

        final int day = date.getDate();
        final int month = date.getMonth() + 1;
        final int year = date.getYear() + 1900;

        if (day < 10) {
            formated.append("0");
        }
        formated.append(String.valueOf(day));
        formated.append("/");
        if (month < 10) {
            formated.append("0");
        }
        formated.append(String.valueOf(month));
        formated.append("/");
        formated.append(String.valueOf(year));

        return formated.toString();
    }
    
    public static String longDate(final Date date) {

        if (date == null) {
            return "?? ?? ????";
        }

        final StringBuilder formated = new StringBuilder();

        final int day = date.getDate();
        final int month = date.getMonth() + 1;
        final int year = date.getYear() + 1900;

        if (day < 10) {
            formated.append("0");
        }
        formated.append(String.valueOf(day));
        formated.append(" ");
        formated.append(Language.monthFull(month, HasLanguage.pt_BR));
        formated.append(" ");
        formated.append(String.valueOf(year));

        return formated.toString();
    }
    
    public static String shorDate(final Date date) {

        if (date == null) {
            return "?? ?? ????";
        }

        final StringBuilder formated = new StringBuilder();

        final int day = date.getDate();
        final int month = date.getMonth() + 1;
        final int year = date.getYear() + 1900;

        if (day < 10) {
            formated.append("0");
        }
        formated.append(String.valueOf(day));
        formated.append(" ");
        formated.append(Language.monthShort(month, HasLanguage.pt_BR));
        formated.append(" ");
        formated.append(String.valueOf(year));

        return formated.toString();
    }
    
    public static String longMonthAndYear(final Date date) {

        if (date == null) {
            return "?? ????";
        }

        final StringBuilder formated = new StringBuilder();

        final int month = date.getMonth() + 1;
        final int year = date.getYear() + 1900;

        formated.append(Language.monthFull(month, HasLanguage.pt_BR));
        formated.append(" ");
        formated.append(String.valueOf(year));

        return formated.toString();
    }
    
    public static String shorMonthAndYear(final Date date) {

        if (date == null) {
            return "?? ????";
        }

        final StringBuilder formated = new StringBuilder();

        final int month = date.getMonth() + 1;
        final int year = date.getYear() + 1900;

        formated.append(Language.monthShort(month, HasLanguage.pt_BR));
        formated.append(" ");
        formated.append(String.valueOf(year));

        return formated.toString();
    }

    @SuppressWarnings("deprecation")
    public static String time(final Date date) {

        if (date == null) {
            return "??:??:??";
        }

        final StringBuilder formated = new StringBuilder();

        final int hours = date.getHours();
        final int minutes = date.getMinutes();
        final int seconds = date.getSeconds();

        if (hours < 10) {
            formated.append("0");
        }
        formated.append(String.valueOf(hours));
        formated.append(":");

        if (minutes < 10) {
            formated.append("0");
        }
        formated.append(String.valueOf(minutes));
        formated.append(":");

        if (seconds < 10) {
            formated.append("0");
        }
        formated.append(String.valueOf(seconds));

        return formated.toString();
    }

    /**
     * Recebe uma data em milisegundos e formata quanto tempo se passou até
     * agora.<br/>
     * Ex.: Um dia e 5 horas<br/>
     * Ex.: Uma hora e 8 minutos<br/>
     * Ex.: 10 horas e um minuto<br/>
     *
     * @param startAt
     * @return
     */
    public static String liveStamp(final Long startAt) {
        return calcLiveStamp((new Date()).getTime() - startAt);
    }

    /**
     * Recebe uma data e formata quanto tempo se passou até agora.<br/>
     * Ex.: Um dia e 5 horas<br/>
     * Ex.: Uma hora e 8 minutos<br/>
     * Ex.: 10 horas e um minuto<br/>
     *
     * @param startAt
     * @return
     */
    public static String liveStamp(final Date startAt) {
        return calcLiveStamp((new Date()).getTime() - startAt.getTime());
    }

    /**
     * Recebe duas datas em milisegundos e formata quanto tempo se entre
     * elas.<br/>
     * Ex.: Um dia e 5 horas<br/>
     * Ex.: Uma hora e 8 minutos<br/>
     * Ex.: 10 horas e um minuto<br/>
     *
     * @param startAt
     * @param endAt
     * @return
     */
    public static String liveStamp(final Long startAt, final Long endAt) {
        return calcLiveStamp(endAt - startAt);
    }

    /**
     * Recebe duas datas e formata quanto tempo se entre elas.<br/>
     * Ex.: Um dia e 5 horas<br/>
     * Ex.: Uma hora e 8 minutos<br/>
     * Ex.: 10 horas e um minuto<br/>
     *
     * @param startAt
     * @param endAt
     * @return
     */
    public static String liveStamp(final Date startAt, final Date endAt) {
        final long time = endAt.getTime() - startAt.getTime();
        return calcLiveStamp(time);
    }

    /**
     * Recebe uma quantia em milisegundos e retorna quanto tempo há nessa
     * quantia.<br/>
     * Ex.: Um dia e 5 horas<br/>
     * Ex.: Uma hora e 8 minutos<br/>
     * Ex.: 10 horas e um minuto<br/>
     *
     * @param startAt
     * @param endAt
     * @return
     */
    public static String calcLiveStamp(final Long time) {

        final int days = CalcTime.countDays(time);
        final int hours = CalcTime.countHours(time);
        final int minutes = CalcTime.countMinutes(time);
        final int seconds = CalcTime.countSeconds(time);

        final int hours_calc = hours - (days * 24);
        final int minutes_calc = minutes - (hours * 60);
        final int seconds_calc = seconds - (minutes * 60);

        final StringBuilder text = new StringBuilder();

        if (days > 0) {
            text.append(days == 1 ? "um dia" : days + " dias");
            text.append(" ");
        }

        if (hours_calc > 0) {
            if (days > 0) {
                text.append("e");
                text.append(" ");
            }
            text.append(hours_calc == 1 ? "uma hora" : hours_calc + " horas");
            text.append(" ");
        }

        if (minutes_calc > 0 && days == 0) {
            if (hours_calc > 0) {
                text.append("e");
                text.append(" ");
            }
            text.append(minutes_calc == 1 ? "um minuto" : minutes_calc + " minutos");
            text.append(" ");
        }

        if (seconds_calc > 0 && days == 0 && hours_calc == 0) {
            if (minutes_calc > 0) {
                text.append("e");
                text.append(" ");
            }
            text.append(seconds_calc == 1 ? "um segundo" : seconds_calc + " segundos");
        }

        return text.toString();
    }
}
