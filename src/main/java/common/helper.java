package common;

import java.util.Collection;
import java.util.List;
import java.util.TreeSet;

public abstract class helper {

    public static boolean PrimeCheck(int num) {
        if(num ==2 ){
            return true;
        }
        else {
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
                j++;}
            }
            return primeArray;
        }

     public static int FindDivisors(long num){
         int i;
         int divisorCount = 0;

         for (i=1;i <= num; i++) {
             if(num % i == 0) {
                 divisorCount++;
             }
         }
         return(divisorCount);
     }

     public static boolean EvenCheck(int num) {
        if (num % 2 == 0) {
            return true;
        }
        else {
            return false;
        }
     }

    public static TreeSet PrimeSet(int num) {

        TreeSet<Integer> t = new TreeSet<Integer>();
        int i;
        for (i=0; i < num; i++) {
            if (PrimeCheck(i))
            {
                t.add(i);
            }
        }
        return t;

    }
}




