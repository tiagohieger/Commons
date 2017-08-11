package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class ru_RU implements Serializable, HasLanguage {
// Russian

    public final String[] monthsFull = {"января", "февраля", "марта", "апреля", "мая", "июня", "июля", "августа", "сентября", "октября", "ноября", "декабря"};
    public final String[] monthsShort = {"янв", "фев", "мар", "апр", "май", "июн", "июл", "авг", "сен", "окт", "ноя", "дек"};
    public final String[] weekdaysFull = {"воскресенье", "понедельник", "вторник", "среда", "четверг", "пятница", "суббота"};
    public final String[] weekdaysShort = {"вс", "пн", "вт", "ср", "чт", "пт", "сб"};
    public final String[] weekdaysLetter = {"вс", "пн", "вт", "ср", "чт", "пт", "сб"};

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
