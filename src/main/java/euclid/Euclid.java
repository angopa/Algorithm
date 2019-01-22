package euclid;

/**
 * Created by Andres Gonzalez on 1/21/19
 * Euclide Algorithm <BR>
 *     It calculate GCD(A, B) - Calculate the greatest common divisor between two numbers A and B
 *
 */
public class Euclid {

    /**
     * Implementation using recursion<BR>
     *     22/6 = 3 quotient 4
     *     6/4 = 1 quotient 2
     *     4/2 = 2 quotient 0
     *
     * @param dividend
     * @param divisor
     * @return
     */
    public int gcd(int dividend, int divisor) {
        //Using modulus operator (%)
        int quotient = (dividend % divisor);
        // If quotient == 0 we find Greatest Common Divisor
        if (quotient != 0) {
            return gcd(divisor, quotient);
        } else {
            return divisor;
        }
    }

    /**
     * Implementation using loop <BR>
     *     22/6 = 3 quotient 4
     *     6/4 = 1 quotient 2
     *     4/2 = 2 quotient 0
     *
     * @param dividend
     * @param divisor
     * @return
     */
    public int gcd2(int dividend, int divisor) {
        //Using modulus operator (%)
        while(divisor != 0) {
            int temp = divisor;
            divisor = (dividend % divisor);
            dividend = temp;
        }
        return dividend;
    }
}
