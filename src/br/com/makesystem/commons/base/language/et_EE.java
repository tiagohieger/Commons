package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class et_EE implements Serializable, HasLanguage {
// Estonian

    public final String[] monthsFull = {"jaanuar", "veebruar", "märts", "aprill", "mai", "juuni", "juuli", "august", "september", "oktoober", "november", "detsember"};
    public final String[] monthsShort = {"jaan", "veebr", "märts", "apr", "mai", "juuni", "juuli", "aug", "sept", "okt", "nov", "dets"};
    public final String[] weekdaysFull = {"pühapäev", "esmaspäev", "teisipäev", "kolmapäev", "neljapäev", "reede", "laupäev"};
    public final String[] weekdaysShort = {"püh", "esm", "tei", "kol", "nel", "ree", "lau"};
    public final String[] weekdaysLetter = {"P", "E", "T", "K", "N", "R", "L"};

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
