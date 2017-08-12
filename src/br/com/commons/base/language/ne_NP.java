package br.com.commons.base.language;

import java.io.Serializable;
import br.com.commons.base.HasLanguage;

public class ne_NP implements Serializable, HasLanguage {
// Nepali

    public final String[] monthsFull = {"जनवरी", "फेब्रुअरी", "मार्च", "अप्रिल", "मे", "जुन", "जुलाई", "अगस्त", "सेप्टेम्बर", "अक्टोबर", "नोवेम्बर", "डिसेम्बर"};
    public final String[] monthsShort = {"जन", "फेब्रु", "मार्च", "अप्रिल", "मे", "जुन", "जुल", "अग", "सेप्टे", "अक्टो", "नोभे", "डिसे"};
    public final String[] weekdaysFull = {"सोमबार", "मङ्लबार", "बुधबार", "बिहीबार", "शुक्रबार", "शनिबार", "आईतबार"};
    public final String[] weekdaysShort = {"सोम", "मंगल्", "बुध", "बिही", "शुक्र", "शनि", "आईत"};
    public final String[] weekdaysLetter = {"सोम", "मंगल्", "बुध", "बिही", "शुक्र", "शनि", "आईत"};

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
