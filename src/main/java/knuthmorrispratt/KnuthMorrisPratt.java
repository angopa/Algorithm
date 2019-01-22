package knuthmorrispratt;

/**
 * Created by Andres Gonzalez on 1/21/19
 */
public class KnuthMorrisPratt {

    /**
     * This method returns the index for the first match of the pattern into the array.
     * It will return -1 in case it does not match.<BR>
     *
     * <prep>
     *     array = a, b, a, z, a, c, a, b, a, b, a, b, a, c
     *
     *     pattern = a, b, a, b, a, c
     *
     *     lsp = 0, 0, 1, 2, 3, 0
     *
     *     -> 8
     * <prep/>
     *
     * @param array
     * @param pattern
     * @return
     */
    public int search(char[] array, char[] pattern) {
        int[] longestSuffixPrefix = computeLongestSuffixPrefixTable(pattern);
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            while(j > 0 && array[i] != pattern[j]) {
                j = longestSuffixPrefix[j - 1];
            }

            if (array[i] == pattern[j]){
                j++;
                if (j == pattern.length) {
                    return i - (j - 1);
                }
            }
        }
        return -1;
    }

    /**
     * This compute the table of the longest suffix and longest prefix on the pattern.
     * This is going to be use by Knuth-Morris-Pratt main algorithm.<BR>
     *
     * @param pattern
     * @return
     */
    public int[] computeLongestSuffixPrefixTable(char[] pattern) {
        int[] longestSuffixPrefix = new int[pattern.length];
        int j = 0;
        for (int i = 1; i < pattern.length; i++) {
            while (j > 0 && pattern[j] != pattern[i]) {
                j = longestSuffixPrefix[j-1];
            }

            if (pattern[j] == pattern[i]) {
                longestSuffixPrefix[i] = j + 1;
                j++;
            } else {
                longestSuffixPrefix[i] = 0;
            }
        }
        return longestSuffixPrefix;
    }
}
