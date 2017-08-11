package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class ca_ES implements Serializable, HasLanguage {
// Catalan

    public final String[] monthsFull = {"Gener", "Febrer", "Març", "Abril", "Maig", "juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre"};
    public final String[] monthsShort = {"Gen", "Feb", "Mar", "Abr", "Mai", "Jun", "Jul", "Ago", "Set", "Oct", "Nov", "Des"};
    public final String[] weekdaysFull = {"diumenge", "dilluns", "dimarts", "dimecres", "dijous", "divendres", "dissabte"};
    public final String[] weekdaysShort = {"diu", "dil", "dim", "dmc", "dij", "div", "dis"};
    public final String[] weekdaysLetter = {"dg", "dl", "dt", "dc", "dj", "dv", "ds"};

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
