package knuthmorrispratt;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Created by Andres Gonzalez on 1/21/19
 */
public class KnuthMorrisPrattTest {

    KnuthMorrisPratt knuthMorrisPratt;

    @Before
    public void init() {
        knuthMorrisPratt = new KnuthMorrisPratt();
    }

    @Test
    public void searchTest() {
        String array = new String ("abazacabababac");
        String pattern = new String ("ababac");
        Assert.assertEquals(8, knuthMorrisPratt.search(array.toCharArray(), pattern.toCharArray()));

        array = new String ("aabaaaabacaz");
        pattern = new String ("aabacaz");
        Assert.assertEquals(5, knuthMorrisPratt.search(array.toCharArray(), pattern.toCharArray()));

        array = new String ("this is a test");
        pattern = new String ("is a");
        Assert.assertEquals(5, knuthMorrisPratt.search(array.toCharArray(), pattern.toCharArray()));

        array = new String ("cantfintheindex");
        pattern = new String ("foo");
        Assert.assertEquals(-1, knuthMorrisPratt.search(array.toCharArray(), pattern.toCharArray()));
    }

    @Test
    public void computeLongestSuffixPrefixTableTest() {
        char[] patter = new char[]{'a', 'b', 'a', 'b', 'a', 'c'};
        int[] expect = new int[] {0, 0, 1, 2, 3, 0};
        Assert.assertArrayEquals(expect, knuthMorrisPratt.computeLongestSuffixPrefixTable(patter));

        patter = new char[]{'a', 'a', 'b', 'a', 'c'};
        expect = new int[] {0, 1, 0, 1, 0};
        Assert.assertArrayEquals(expect, knuthMorrisPratt.computeLongestSuffixPrefixTable(patter));

        patter = new char[]{'a', 'b', 'c', 'd', 'a', 'b', 'c', 'a'};
        expect = new int[] {0, 0, 0, 0, 1, 2, 3, 1};
        Assert.assertArrayEquals(expect, knuthMorrisPratt.computeLongestSuffixPrefixTable(patter));
    }
}
