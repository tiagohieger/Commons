package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class cs_CZ implements Serializable, HasLanguage {
// Czech

    public final String[] monthsFull = {"leden", "únor", "březen", "duben", "květen", "červen", "červenec", "srpen", "září", "říjen", "listopad", "prosinec"};
    public final String[] monthsShort = {"led", "úno", "bře", "dub", "kvě", "čer", "čvc", "srp", "zář", "říj", "lis", "pro"};
    public final String[] weekdaysFull = {"neděle", "pondělí", "úterý", "středa", "čtvrtek", "pátek", "sobota"};
    public final String[] weekdaysShort = {"ne", "po", "út", "st", "čt", "pá", "so"};
    public final String[] weekdaysLetter = {"Ne", "Po", "Út", "St", "Čt", "Pá", "So"};

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
