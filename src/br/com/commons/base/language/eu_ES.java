package br.com.commons.base.language;

import java.io.Serializable;
import br.com.commons.base.HasLanguage;

public class eu_ES implements Serializable, HasLanguage {
// Basque

    public final String[] monthsFull = {"urtarrila", "otsaila", "martxoa", "apirila", "maiatza", "ekaina", "uztaila", "abuztua", "iraila", "urria", "azaroa", "abendua"};
    public final String[] monthsShort = {"urt", "ots", "mar", "api", "mai", "eka", "uzt", "abu", "ira", "urr", "aza", "abe"};
    public final String[] weekdaysFull = {"igandea", "astelehena", "asteartea", "asteazkena", "osteguna", "ostirala", "larunbata"};
    public final String[] weekdaysShort = {"ig.", "al.", "ar.", "az.", "og.", "or.", "lr."};
    public final String[] weekdaysLetter = {"ig.", "al.", "ar.", "az.", "og.", "or.", "lr."};

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
