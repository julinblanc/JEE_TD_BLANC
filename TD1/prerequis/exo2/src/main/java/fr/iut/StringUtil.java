package fr.iut;

import sun.util.resources.zh.CurrencyNames_zh_CN;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class StringUtil {

    /**
     * Retourne le nombre donné avec la monnaie du pays demandé
     * @param amount le montant donné
     * @param locale le pays dont on cherche sa monnaie
     * @return une chaîne de caractère
     */
    public static String prettyCurrencyPrint(final double amount, final Locale locale) {
        return NumberFormat.getCurrencyInstance(locale).format(amount);
    }

}
