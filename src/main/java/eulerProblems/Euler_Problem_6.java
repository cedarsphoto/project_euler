package eulerProblems;

import java.lang.reflect.Array;
import static common.helper.IntArrayCreator;

public class Euler_Problem_6 {

    public static void main (String[] args) {
        int size = 100;
        int j = 0;
        int[] squareOfSum = IntArrayCreator(size);
        int sumOsq = 0;

        for(int i=0; i < Array.getLength(squareOfSum); i++) {
            j=j+squareOfSum[i];

        }

        int sqOsum = j*j;
        System.out.println(sqOsum);

        for(int k=1; k < size+1; k++) {
            sumOsq = sumOsq+k*k;
        }
        System.out.println(sqOsum-sumOsq);

    }

}
