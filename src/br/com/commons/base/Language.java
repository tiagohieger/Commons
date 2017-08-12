/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.commons.base;

import br.com.commons.base.language.pt_BR;
import br.com.commons.base.language.fr_FR;
import br.com.commons.base.language.uk_UA;
import br.com.commons.base.language.ne_NP;
import br.com.commons.base.language.hi_IN;
import br.com.commons.base.language.bg_BG;
import br.com.commons.base.language.hr_HR;
import br.com.commons.base.language.ro_RO;
import br.com.commons.base.language.et_EE;
import br.com.commons.base.language.ca_ES;
import br.com.commons.base.language.da_DK;
import br.com.commons.base.language.sl_SI;
import br.com.commons.base.language.bs_BA;
import br.com.commons.base.language.zh_CN;
import br.com.commons.base.language.es_ES;
import br.com.commons.base.language.tr_TR;
import br.com.commons.base.language.he_IL;
import br.com.commons.base.language.de_DE;
import br.com.commons.base.language.vi_VN;
import br.com.commons.base.language.nl_NL;
import br.com.commons.base.language.ko_KR;
import br.com.commons.base.language.is_IS;
import br.com.commons.base.language.fi_FI;
import br.com.commons.base.language.it_IT;
import br.com.commons.base.language.pl_PL;
import br.com.commons.base.language.hu_HU;
import br.com.commons.base.language.fa_ir;
import br.com.commons.base.language.sk_SK;
import br.com.commons.base.language.ru_RU;
import br.com.commons.base.language.nb_NO;
import br.com.commons.base.language.cs_CZ;
import br.com.commons.base.language.lv_LV;
import br.com.commons.base.language.lt_LT;
import br.com.commons.base.language.el_GR;
import br.com.commons.base.language.ja_JP;
import br.com.commons.base.language.pt_PT;
import br.com.commons.base.language.en;
import br.com.commons.base.language.gl_ES;
import br.com.commons.base.language.zh_TW;
import br.com.commons.base.language.sv_SE;
import br.com.commons.base.language.id_ID;
import br.com.commons.base.language.eu_ES;
import br.com.commons.base.language.th_TH;
import br.com.commons.base.language.ar;

/**
 *
 * @author Richeli Vargas
 */
public class Language {

    /**
     *
     * @param month 1 ... 12
     * @param locale
     * @return
     */
    public static String monthFull(final int month, final String locale) {
        return getLanguage(locale).getMonthsFull()[month - 1];
    }

    /**
     *
     * @param month 1 ... 12
     * @param locale
     * @return
     */
    public static String monthShort(final int month, final String locale) {
        return getLanguage(locale).getMonthsShort()[month - 1];
    }

    /**
     *
     * @param weekDay 0 ... 6
     * @param locale
     * @return
     */
    public static String weekdayFull(final int weekDay, final String locale) {
        return getLanguage(locale).getWeekdaysFull()[weekDay];
    }

    /**
     *
     * @param weekDay 0 ... 6
     * @param locale
     * @return
     */
    public static String weekdayShort(final int weekDay, final String locale) {
        return getLanguage(locale).getWeekdaysFull()[weekDay];
    }

    /**
     *
     * @param weekDay 0 ... 6
     * @param locale
     * @return
     */
    public static String weekdaysLetter(final int weekDay, final String locale) {
        return getLanguage(locale).getWeekdaysFull()[weekDay];
    }

    private static HasLanguage getLanguage(final String locale) {

        switch (locale) {
            case HasLanguage.ar:
                return new ar();
            case HasLanguage.bg_BG:
                return new bg_BG();
            case HasLanguage.bs_BA:
                return new bs_BA();
            case HasLanguage.ca_ES:
                return new ca_ES();
            case HasLanguage.cs_CZ:
                return new cs_CZ();
            case HasLanguage.da_DK:
                return new da_DK();
            case HasLanguage.de_DE:
                return new de_DE();
            case HasLanguage.el_GR:
                return new el_GR();
            case HasLanguage.en:
                return new en();
            case HasLanguage.es_ES:
                return new es_ES();
            case HasLanguage.et_EE:
                return new et_EE();
            case HasLanguage.eu_ES:
                return new eu_ES();
            case HasLanguage.fa_ir:
                return new fa_ir();
            case HasLanguage.fi_FI:
                return new fi_FI();
            case HasLanguage.fr_FR:
                return new fr_FR();
            case HasLanguage.gl_ES:
                return new gl_ES();
            case HasLanguage.he_IL:
                return new he_IL();
            case HasLanguage.hi_IN:
                return new hi_IN();
            case HasLanguage.hr_HR:
                return new hr_HR();
            case HasLanguage.hu_HU:
                return new hu_HU();
            case HasLanguage.id_ID:
                return new id_ID();
            case HasLanguage.is_IS:
                return new is_IS();
            case HasLanguage.it_IT:
                return new it_IT();
            case HasLanguage.ja_JP:
                return new ja_JP();
            case HasLanguage.ko_KR:
                return new ko_KR();
            case HasLanguage.lt_LT:
                return new lt_LT();
            case HasLanguage.lv_LV:
                return new lv_LV();
            case HasLanguage.nb_NO:
                return new nb_NO();
            case HasLanguage.ne_NP:
                return new ne_NP();
            case HasLanguage.nl_NL:
                return new nl_NL();
            case HasLanguage.pl_PL:
                return new pl_PL();
            case HasLanguage.pt_PT:
                return new pt_PT();
            case HasLanguage.ro_RO:
                return new ro_RO();
            case HasLanguage.ru_RU:
                return new ru_RU();
            case HasLanguage.sk_SK:
                return new sk_SK();
            case HasLanguage.sl_SI:
                return new sl_SI();
            case HasLanguage.sv_SE:
                return new sv_SE();
            case HasLanguage.th_TH:
                return new th_TH();
            case HasLanguage.tr_TR:
                return new tr_TR();
            case HasLanguage.uk_UA:
                return new uk_UA();
            case HasLanguage.vi_VN:
                return new vi_VN();
            case HasLanguage.zh_CN:
                return new zh_CN();
            case HasLanguage.zh_TW:
                return new zh_TW();
            case HasLanguage.pt_BR:
            default:
                return new pt_BR();
        }

    }
}
