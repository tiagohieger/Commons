package br.com.commons.base.language;

import java.io.Serializable;
import br.com.commons.base.HasLanguage;

public class nb_NO implements Serializable, HasLanguage {
// Norwegian

    public final String[] monthsFull = {"januar", "februar", "mars", "april", "mai", "juni", "juli", "august", "september", "oktober", "november", "desember"};
    public final String[] monthsShort = {"jan", "feb", "mar", "apr", "mai", "jun", "jul", "aug", "sep", "okt", "nov", "des"};
    public final String[] weekdaysFull = {"søndag", "mandag", "tirsdag", "onsdag", "torsdag", "fredag", "lørdag"};
    public final String[] weekdaysShort = {"søn", "man", "tir", "ons", "tor", "fre", "lør"};
    public final String[] weekdaysLetter = {"Sø", "Ma", "Ti", "On", "To", "Fr", "Lø"};

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
