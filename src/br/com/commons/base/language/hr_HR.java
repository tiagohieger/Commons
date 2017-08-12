package br.com.commons.base.language;

import java.io.Serializable;
import br.com.commons.base.HasLanguage;

public class hr_HR implements Serializable, HasLanguage {
// Croatian

    public final String[] monthsFull = {"sijećanj", "veljača", "ožujak", "travanj", "svibanj", "lipanj", "srpanj", "kolovoz", "rujan", "listopad", "studeni", "prosinac"};
    public final String[] monthsShort = {"sij", "velj", "ožu", "tra", "svi", "lip", "srp", "kol", "ruj", "lis", "stu", "pro"};
    public final String[] weekdaysFull = {"nedjelja", "ponedjeljak", "utorak", "srijeda", "četvrtak", "petak", "subota"};
    public final String[] weekdaysShort = {"ned", "pon", "uto", "sri", "čet", "pet", "sub"};
    public final String[] weekdaysLetter = {"Ne", "Po", "Ut", "Sr", "Če", "Pe", "Su"};

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
