package fr.iut;

import org.junit.Assert;
import org.junit.Test;

import java.util.Locale;

/**
 * Tests de la classe StringUtilTest
 */
public class StringUtilTest {

    @Test
    public void prettyCurrencyPrintTest() {
        assert("210,00 €".equals(StringUtil.prettyCurrencyPrint(210, Locale.FRANCE)));
        Assert.assertEquals("￥1,600.00", StringUtil.prettyCurrencyPrint(1600, Locale.CHINA));
    }
}
