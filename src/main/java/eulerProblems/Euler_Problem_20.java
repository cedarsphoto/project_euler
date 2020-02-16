package eulerProblems;

import java.math.BigInteger;

import static common.helper.CalculateFactorial;

public class Euler_Problem_20 {

    public static void main(String[] args){

        /*

        n! means n × (n − 1) × ... × 3 × 2 × 1
        For example, 10! = 10 × 9 × ... × 3 × 2 × 1 = 3628800,
        and the sum of the digits in the number 10! is 3 + 6 + 2 + 8 + 8 + 0 + 0 = 27.
        Find the sum of the digits in the number 100!

         */

        long value = 100;
        int total = 0;
        BigInteger result = CalculateFactorial(value);

        String strResult = result.toString();
        // int length = strResult.length();
        // System.out.println(length);

        for (int i=0; i < strResult.length();i++){
            int x = Character.getNumericValue(strResult.charAt(i));
            total = total + x;
        }
        System.out.println(total);
        }

    }

