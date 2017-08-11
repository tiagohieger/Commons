package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class es_ES implements Serializable, HasLanguage {
// Spanish

    public final String[] monthsFull = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    public final String[] monthsShort = {"ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic"};
    public final String[] weekdaysFull = {"domingo", "lunes", "martes", "miércoles", "jueves", "viernes", "sábado"};
    public final String[] weekdaysShort = {"dom", "lun", "mar", "mié", "jue", "vie", "sáb"};
    public final String[] weekdaysLetter = {"Do", "Lu", "Ma", "Mi", "Ju", "Vi", "Sa"};

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
