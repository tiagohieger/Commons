package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class gl_ES implements Serializable, HasLanguage {
// Galician

    public final String[] monthsFull = {"Xaneiro", "Febreiro", "Marzo", "Abril", "Maio", "Xuño", "Xullo", "Agosto", "Setembro", "Outubro", "Novembro", "Decembro"};
    public final String[] monthsShort = {"xan", "feb", "mar", "abr", "mai", "xun", "xul", "ago", "sep", "out", "nov", "dec"};
    public final String[] weekdaysFull = {"domingo", "luns", "martes", "mércores", "xoves", "venres", "sábado"};
    public final String[] weekdaysShort = {"dom", "lun", "mar", "mér", "xov", "ven", "sab"};
    public final String[] weekdaysLetter = {"Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sa"};

    public final String[] getMonthsFull() {
        return monthsFull;
    }

    public final String[] getMonthsShort() {
        return monthsShort;
    }

    public final String[] getWeekdaysFull() {
        return weekdaysFull;
    }

    public final String[] getWeekdaysShort() {
        return weekdaysShort;
    }

    public final String[] getWeekdaysLetter() {
        return weekdaysLetter;
    }
}
