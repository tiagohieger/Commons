package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class fa_ir implements Serializable, HasLanguage {
// Farsi

    public final String[] monthsFull = {"دسامبر", "نوامبر", "اکتبر", "سپتامبر", "اوت", "ژوئیه", "ژوئن", "مه", "آوریل", "مارس", "فوریه", "ژانویه"};
    public final String[] monthsShort = {"دسامبر", "نوامبر", "اکتبر", "سپتامبر", "اوت", "ژوئیه", "ژوئن", "مه", "آوریل", "مارس", "فوریه", "ژانویه"};
    public final String[] weekdaysFull = {"شنبه", "جمعه", "پنجشنبه", "چهارشنبه", "سه شنبه", "دوشنبه", "یکشنبه"};
    public final String[] weekdaysShort = {"شنبه", "جمعه", "پنجشنبه", "چهارشنبه", "سه شنبه", "دوشنبه", "یکشنبه"};
    public final String[] weekdaysLetter = {"شنبه", "جمعه", "پنجشنبه", "چهارشنبه", "سه شنبه", "دوشنبه", "یکشنبه"};

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
