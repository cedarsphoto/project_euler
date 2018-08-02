package common;

public class helper {

    public static boolean PrimeCheck(int num) {
        if (num <= 2 || num % 2 == 0) {
            return false;
        }

        long topLimit = (int) Math.sqrt(num);
        for (long i = 3; i < topLimit; i += 2) {
            if (num % i == 0) {
                return false;
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
    }

