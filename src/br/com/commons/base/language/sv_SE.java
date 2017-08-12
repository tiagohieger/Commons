package br.com.commons.base.language;

import java.io.Serializable;
import br.com.commons.base.HasLanguage;

public class sv_SE implements Serializable, HasLanguage {
// Swedish

    public final String[] monthsFull = {"januari", "februari", "mars", "april", "maj", "juni", "juli", "augusti", "september", "oktober", "november", "december"};
    public final String[] monthsShort = {"jan", "feb", "mar", "apr", "maj", "jun", "jul", "aug", "sep", "okt", "nov", "dec"};
    public final String[] weekdaysFull = {"söndag", "måndag", "tisdag", "onsdag", "torsdag", "fredag", "lördag"};
    public final String[] weekdaysShort = {"sön", "mån", "tis", "ons", "tor", "fre", "lör"};
    public final String[] weekdaysLetter = {"Sö", "Må", "Ti", "On", "To", "Fr", "Lö"};

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
