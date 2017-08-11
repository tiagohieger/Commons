package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class bs_BA implements Serializable, HasLanguage {
// Bosnian

    public final String[] monthsFull = {"januar", "februar", "mart", "april", "maj", "juni", "juli", "august", "septembar", "oktobar", "novembar", "decembar"};
    public final String[] monthsShort = {"jan", "feb", "mar", "apr", "maj", "jun", "jul", "aug", "sep", "okt", "nov", "dec"};
    public final String[] weekdaysFull = {"nedjelja", "ponedjeljak", "utorak", "srijeda", "cetvrtak", "petak", "subota"};
    public final String[] weekdaysShort = {"ne", "po", "ut", "sr", "če", "pe", "su"};
    public final String[] weekdaysLetter = {"n", "p", "u", "s", "č", "p", "s"};

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
