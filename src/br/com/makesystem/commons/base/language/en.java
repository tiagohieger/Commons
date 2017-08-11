package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class en implements Serializable, HasLanguage {
// English

    public final String[] monthsFull = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
    public final String[] monthsShort = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
    public final String[] weekdaysFull = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
    public final String[] weekdaysShort = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
    public final String[] weekdaysLetter = {"S", "M", "T", "W", "T", "F", "S"};

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
