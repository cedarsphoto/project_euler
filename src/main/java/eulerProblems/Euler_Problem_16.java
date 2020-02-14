package eulerProblems;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Euler_Problem_16 {

    public static void main(String[] args) {
        // 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
        //
        //What is the sum of the digits of the number 2^1000?
        BigInteger bigint;
        int total = 0;

        bigint = new BigInteger("2");
        BigInteger result = bigint.pow(1000);

        String resultstring = result.toString();
        for (int i = 0; i < resultstring.length(); i++) {
            char c = resultstring.charAt(i);
            int d = Character.getNumericValue(c);
            total = total + d;

        }
        System.out.println(total);
    }
}
