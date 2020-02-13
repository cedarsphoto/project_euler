package eulerProblems;

import static common.helper.PrimeCheck;

public class Euler_Problem_7 {

    public static void main(String[] args)
    {
        int counter=0;
        int x = 1;

        do {
            x++;
            if (PrimeCheck(x))
            {
                counter++;
            }
        } while (counter != 10001);

        System.out.println(x);
    }

}
