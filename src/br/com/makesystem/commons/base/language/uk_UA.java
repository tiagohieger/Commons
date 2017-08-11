package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class uk_UA implements Serializable, HasLanguage {
// Ukrainian

    public final String[] monthsFull = {"січень", "лютий", "березень", "квітень", "травень", "червень", "липень", "серпень", "вересень", "жовтень", "листопад", "грудень"};
    public final String[] monthsShort = {"січ", "лют", "бер", "кві", "тра", "чер", "лип", "сер", "вер", "жов", "лис", "гру"};
    public final String[] weekdaysFull = {"неділя", "понеділок", "вівторок", "середа", "четвер", "п‘ятниця", "субота"};
    public final String[] weekdaysShort = {"нд", "пн", "вт", "ср", "чт", "пт", "сб"};
    public final String[] weekdaysLetter = {"нд", "пн", "вт", "ср", "чт", "пт", "сб"};

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
