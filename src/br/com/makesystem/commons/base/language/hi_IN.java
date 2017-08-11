package br.com.makesystem.commons.base.language;

import java.io.Serializable;
import br.com.makesystem.commons.base.HasLanguage;

public class hi_IN implements Serializable, HasLanguage {

    public final String[] monthsFull = {"जनवरी", "फरवरी", "मार्च", "अप्रैल", "मई", "जून", "जुलाई", "अगस्त", "सितम्बर", "अक्टूबर", "नवम्बर", "दिसम्बर"};
    public final String[] monthsShort = {"जन", "फर", "मार्च", "अप्रैल", "मई", "जून", "जु", "अग", "सित", "अक्टू", "नव", "दिस"};
    public final String[] weekdaysFull = {"रविवार", "सोमवार", "मंगलवार", "बुधवार", "गुरुवार", "शुक्रवार", "शनिवार"};
    public final String[] weekdaysShort = {"रवि", "सोम", "मंगल", "बुध", "गुरु", "शुक्र", "शनि"};
    public final String[] weekdaysLetter = {"रवि", "सोम", "मंगल", "बुध", "गुरु", "शुक्र", "शनि"};

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
