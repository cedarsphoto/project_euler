package common;

import java.io.*;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.TreeSet;

public abstract class helper {

    public static boolean PrimeCheck(int num) {
        if (num == 2) {
            return true;
        } else {
            if (num <= 1 || num % 2 == 0) {
                return false;
            }

            long topLimit = (int) Math.sqrt(num);
            for (long i = 3; i <= topLimit; i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] IntArrayCreator(int size) {
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public static int[] MakePrimeArray(int size) {
        int[] primeArray = new int[size];
        int j = 0;
        for (int i = 2; i < size; i++) {
            if (PrimeCheck(i)) {
                primeArray[j] = i;
                j++;
            }
        }
        return primeArray;
    }

    public static int FindDivisors(long num) {
        int i;
        int divisorCount = 0;

        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisorCount++;
            }
        }
        return (divisorCount);
    }

    public static boolean EvenCheck(int num) {
        if (num % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static BigInteger CalculateFactorial(long num) {
        BigInteger result = BigInteger.ONE;

        for (long factor = 2; factor <= num; factor++) {
            result = result.multiply(BigInteger.valueOf(factor));
        }
        return result;
    }

    public static TreeSet PrimeSet(int num) {

        TreeSet<Integer> t = new TreeSet<Integer>();
        int i;
        for (i = 0; i < num; i++) {
            if (PrimeCheck(i)) {
                t.add(i);
            }
        }
        return t;

    }

   /* public static BufferedReader HelperFileReader(String filepath) throws IOException {
        String path = filepath;
        BufferedReader reader = new BufferedReader(new FileReader(path));
        // String currentLine = reader.readLine();
        reader.close();
    }*/

    public static int AlphabetValues(Character key) {

        String keyString = key.toString();

        HashMap<String, Integer> alphavalues = new HashMap<String, Integer>();
        alphavalues.put("A", 1);
        alphavalues.put("B", 2);
        alphavalues.put("C", 3);
        alphavalues.put("D", 4);
        alphavalues.put("E", 5);
        alphavalues.put("F", 6);
        alphavalues.put("G", 7);
        alphavalues.put("H", 8);
        alphavalues.put("I", 9);
        alphavalues.put("J", 10);
        alphavalues.put("K", 11);
        alphavalues.put("L", 12);
        alphavalues.put("M", 13);
        alphavalues.put("N", 14);
        alphavalues.put("O", 15);
        alphavalues.put("P", 16);
        alphavalues.put("Q", 17);
        alphavalues.put("R", 18);
        alphavalues.put("S", 19);
        alphavalues.put("T", 20);
        alphavalues.put("U", 21);
        alphavalues.put("V", 22);
        alphavalues.put("W", 23);
        alphavalues.put("X", 24);
        alphavalues.put("Y", 25);
        alphavalues.put("Z", 26);

        return (alphavalues.get(keyString));

    }


}