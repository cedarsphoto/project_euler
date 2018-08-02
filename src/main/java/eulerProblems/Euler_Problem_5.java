package eulerProblems;

import java.lang.reflect.Array;
import static common.helper.PrimeCheck;

public class Euler_Problem_5 {

    public static void main(String[] args) {
        int x=1;
        int y;
        boolean test = false;
        int [] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        int size = Array.getLength(numbers);

        do {
            for (y=0; y < size; y++)
            {
                if ((numbers[y] != 0) && (x % numbers[y] != 0))
                {
                    x++;
                    test=false;
                    break;
                } else {
                    test = true;
                }
            }
        } while (test == false);
        System.out.println(x);
    }


}
