package br.com.commons.base.language;

import java.io.Serializable;
import br.com.commons.base.HasLanguage;

public class pt_BR implements Serializable, HasLanguage {
// Brazilian Portuguese

    public final String[] monthsFull = {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
    public final String[] monthsShort = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez"};
    public final String[] weekdaysFull = {"domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira", "sexta-feira", "sábado"};
    public final String[] weekdaysShort = {"dom", "seg", "ter", "qua", "qui", "sex", "sab"};
    public final String[] weekdaysLetter = {"Do", "Se", "Te", "Qu", "Qu", "Se", "Sa"};

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
