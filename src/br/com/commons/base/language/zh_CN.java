package br.com.commons.base.language;

import java.io.Serializable;
import br.com.commons.base.HasLanguage;

public class zh_CN implements Serializable, HasLanguage {
// Simplified Chinese

    public final String[] monthsFull = {"一月", "二月", "三月", "四月", "五月", "六月", "七月", "八月", "九月", "十月", "十一月", "十二月"};
    public final String[] monthsShort = {"一", "二", "三", "四", "五", "六", "七", "八", "九", "十", "十一", "十二"};
    public final String[] weekdaysFull = {"星期日", "星期一", "星期二", "星期三", "星期四", "星期五", "星期六"};
    public final String[] weekdaysShort = {"日", "一", "二", "三", "四", "五", "六"};
    public final String[] weekdaysLetter = {"日", "一", "二", "三", "四", "五", "六"};

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
