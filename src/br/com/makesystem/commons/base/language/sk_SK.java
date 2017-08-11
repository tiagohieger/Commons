package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class sk_SK implements Serializable, HasLanguage {
// Slovak

    public final String[] monthsFull = {"január", "február", "marec", "apríl", "máj", "jún", "júl", "august", "september", "október", "november", "december"};
    public final String[] monthsShort = {"jan", "feb", "mar", "apr", "máj", "jún", "júl", "aug", "sep", "okt", "nov", "dec"};
    public final String[] weekdaysFull = {"nedeľa", "pondelok", "utorok", "streda", "štvrtok", "piatok", "sobota"};
    public final String[] weekdaysShort = {"Ne", "Po", "Ut", "St", "Št", "Pi", "So"};
    public final String[] weekdaysLetter = {"Ne", "Po", "Ut", "St", "Št", "Pi", "So"};

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
