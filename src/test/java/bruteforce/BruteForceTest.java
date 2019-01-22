package bruteforce;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

/**
 * Created by Andres Gonzalez on 1/21/19
 */
public class BruteForceTest {
    BruteForce bruteForce;
    char[] array;

    @Before
    public void init() {
        bruteForce = new BruteForce();
        String s = new String("abcdefgrabhdhabcodoshabdkjasdkjnaabc");
        array = s.toCharArray();
    }

    @Test
    public void firstMatchTest() {
        Assert.assertEquals(3, bruteForce.firstMatch(array, new char[] {'d', 'e', 'f'}));
        Assert.assertEquals(5, bruteForce.firstMatch(array, new char[] {'f'}));
        Assert.assertEquals(18, bruteForce.firstMatch(array, new char[] {'o', 's'}));
        Assert.assertEquals(-1, bruteForce.firstMatch(array, new char[] {'z', 'z'}));
    }

    @Test
    public void everyMatchesTest() {
        int[] expect = new int[array.length];
        Arrays.fill(expect, -1);
        expect[0] = 0;
        expect[1] = 13;
        expect[2] = 33;
        Assert.assertArrayEquals(expect, bruteForce.everyMatch(array, new char[]{'a','b','c'}));
    }
}
