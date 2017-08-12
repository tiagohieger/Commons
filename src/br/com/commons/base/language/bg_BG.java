package br.com.commons.base.language;

import java.io.Serializable;
import br.com.commons.base.HasLanguage;

public class bg_BG implements Serializable, HasLanguage {
// Bulgarian

    public final String[] monthsFull = {"януари", "февруари", "март", "април", "май", "юни", "юли", "август", "септември", "октомври", "ноември", "декември"};
    public final String[] monthsShort = {"янр", "фев", "мар", "апр", "май", "юни", "юли", "авг", "сеп", "окт", "ное", "дек"};
    public final String[] weekdaysFull = {"неделя", "понеделник", "вторник", "сряда", "четвъртък", "петък", "събота"};
    public final String[] weekdaysShort = {"нд", "пн", "вт", "ср", "чт", "пт", "сб"};
    public final String[] weekdaysLetter = {"Н", "П", "В", "С", "Ч", "П", "С"};

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
