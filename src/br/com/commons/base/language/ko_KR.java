package br.com.commons.base.language;

import java.io.Serializable;
import br.com.commons.base.HasLanguage;

public class ko_KR implements Serializable, HasLanguage {
// Korean

    public final String[] monthsFull = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};
    public final String[] monthsShort = {"1월", "2월", "3월", "4월", "5월", "6월", "7월", "8월", "9월", "10월", "11월", "12월"};
    public final String[] weekdaysFull = {"일요일", "월요일", "화요일", "수요일", "목요일", "금요일", "토요일"};
    public final String[] weekdaysShort = {"일", "월", "화", "수", "목", "금", "토"};
    public final String[] weekdaysLetter = {"일", "월", "화", "수", "목", "금", "토"};

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
