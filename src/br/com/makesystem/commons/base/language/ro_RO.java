package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class ro_RO implements Serializable, HasLanguage {
// Romanian

    public final String[] monthsFull = {"ianuarie", "februarie", "martie", "aprilie", "mai", "iunie", "iulie", "august", "septembrie", "octombrie", "noiembrie", "decembrie"};
    public final String[] monthsShort = {"ian", "feb", "mar", "apr", "mai", "iun", "iul", "aug", "sep", "oct", "noi", "dec"};
    public final String[] weekdaysFull = {"duminică", "luni", "marţi", "miercuri", "joi", "vineri", "sâmbătă"};
    public final String[] weekdaysShort = {"D", "L", "Ma", "Mi", "J", "V", "S"};
    public final String[] weekdaysLetter = {"D", "L", "Ma", "Mi", "J", "V", "S"};

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
