package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class th_TH implements Serializable, HasLanguage {
// Thai

    public final String[] monthsFull = {"มกราคม", "กุมภาพันธ์", "มีนาคม", "เมษายน", "พฤษภาคม", "มิถุนายน", "กรกฎาคม", "สิงหาคม", "กันยายน", "ตุลาคม", "พฤศจิกายน", "ธันวาคม"};
    public final String[] monthsShort = {"ม.ค.", "ก.พ.", "มี.ค.", "เม.ย.", "พ.ค.", "มิ.ย.", "ก.ค.", "ส.ค.", "ก.ย.", "ต.ค.", "พ.ย.", "ธ.ค."};
    public final String[] weekdaysFull = {"อาทติย", "จันทร", "องัคาร", "พุธ", "พฤหสั บดี", "ศกุร", "เสาร"};
    public final String[] weekdaysShort = {"อ.", "จ.", "อ.", "พ.", "พฤ.", "ศ.", "ส."};
    public final String[] weekdaysLetter = {"อ.", "จ.", "อ.", "พ.", "พฤ.", "ศ.", "ส."};

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
