package br.com.commons.base.language;

import java.io.Serializable;
import br.com.commons.base.HasLanguage;

public class hu_HU implements Serializable, HasLanguage {
// Hungarian

    public final String[] monthsFull = {"január", "február", "március", "április", "május", "június", "július", "augusztus", "szeptember", "október", "november", "december"};
    public final String[] monthsShort = {"jan", "febr", "márc", "ápr", "máj", "jún", "júl", "aug", "szept", "okt", "nov", "dec"};
    public final String[] weekdaysFull = {"vasárnap", "hétfő", "keXxXx", "szerda", "csütörtök", "péntek", "szombat"};
    public final String[] weekdaysShort = {"V", "H", "K", "SZe", "CS", "P", "SZo"};
    public final String[] weekdaysLetter = {"V", "H", "K", "Sze", "Cs", "P", "Szo"};

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
