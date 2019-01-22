package bruteforce;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by Andres Gonzalez on 1/21/19
 * Brute Force Algorithm <BR>
 *     It search for a pattern into an array, if the pattern is found it will return the index fo the array
 *     where the first letter of the pattern was found.
 *     <BR>
 *     If not match was found it will return -1

 */
public class BruteForce {

    /**
     * This method searches for the pattern into an array and return the index of the first that matches,
     * if not match is found -1 is returned<BR>
     *     array = abcdef
     *     pattern = def -> 3
     *
     * @param array
     * @param pattern
     * @return
     */
    public int firstMatch(char[] array, char[] pattern) {
        for (int a = 0; a <= array.length - pattern.length; a++) {
            for (int n = 0; n < pattern.length; n++) {
                if (array[a+n] != pattern[n]) break;
                if (n == pattern.length-1) return a;
            }
        }
        return -1;
    }

    /**
     * This method searches for a pattern into an array, and return an array of indexes where the pattern match
     * if not match is found an array of -1 us returned.<BR>
     *     array = abcdefgrabhdhabcodoshabdkjasdkjnaabc
     *     patter = abc -> [0, 13, 33, -1,..., -1]
     *
     * @param array
     * @param pattern
     * @return
     */
    public int[] everyMatch(char[] array, char[] pattern) {
        int[] found = new int[array.length];
        Arrays.fill(found, -1);
        int index = 0;
        for (int a = 0; a <= array.length - pattern.length; a++) {
            for (int n = 0; n < pattern.length; n++) {
                if (array[a+n] != pattern[n]) break;
                if (n == pattern.length-1) {
                    found[index++] = a;
                }
            }
        }
        return found;
    }
}
