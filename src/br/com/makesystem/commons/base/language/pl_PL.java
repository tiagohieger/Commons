package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class pl_PL implements Serializable, HasLanguage {
// Polish

    public final String[] monthsFull = {"styczeń", "luty", "marzec", "kwiecień", "maj", "czerwiec", "lipiec", "sierpień", "wrzesień", "październik", "listopad", "grudzień"};
    public final String[] monthsShort = {"sty", "lut", "mar", "kwi", "maj", "cze", "lip", "sie", "wrz", "paź", "lis", "gru"};
    public final String[] weekdaysFull = {"niedziela", "poniedziałek", "wtorek", "środa", "czwartek", "piątek", "sobota"};
    public final String[] weekdaysShort = {"niedz.", "pn.", "wt.", "śr.", "cz.", "pt.", "sob."};
    public final String[] weekdaysLetter = {"N", "Pn", "Wt", "Śr", "Cz", "Pt", "So"};

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
