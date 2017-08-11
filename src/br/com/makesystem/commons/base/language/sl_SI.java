package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class sl_SI implements Serializable, HasLanguage {
// Slovenian

    public final String[] monthsFull = {"januar", "februar", "marec", "april", "maj", "junij", "julij", "avgust", "september", "oktober", "november", "december"};
    public final String[] monthsShort = {"jan", "feb", "mar", "apr", "maj", "jun", "jul", "avg", "sep", "okt", "nov", "dec"};
    public final String[] weekdaysFull = {"nedelja", "ponedeljek", "torek", "sreda", "četrtek", "petek", "sobota"};
    public final String[] weekdaysShort = {"ned", "pon", "tor", "sre", "čet", "pet", "sob"};
    public final String[] weekdaysLetter = {"Ne", "Po", "To", "Sr", "Če", "Pe", "So"};

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
