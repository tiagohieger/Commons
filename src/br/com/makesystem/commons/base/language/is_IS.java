package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class is_IS implements Serializable, HasLanguage {
// Icelandic

    public final String[] monthsFull = {"janúar", "febrúar", "mars", "apríl", "maí", "júní", "júlí", "ágúst", "september", "október", "nóvember", "desember"};
    public final String[] monthsShort = {"jan", "feb", "mar", "apr", "maí", "jún", "júl", "ágú", "sep", "okt", "nóv", "des"};
    public final String[] weekdaysFull = {"sunnudagur", "mánudagur", "þriðjudagur", "miðvikudagur", "fimmtudagur", "föstudagur", "laugardagur"};
    public final String[] weekdaysShort = {"sun", "mán", "þri", "mið", "fim", "fös", "lau"};
    public final String[] weekdaysLetter = {"Su", "Má", "Þr", "Mi", "Fi", "Fö", "La"};

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
