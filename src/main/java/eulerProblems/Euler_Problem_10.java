package eulerProblems;

import static common.helper.PrimeCheck;


public class Euler_Problem_10 {

    public static void main(String[] args)
    {
        int limit = 2000000;
        long sumPrimes = 0;
        for (int i=2; i < limit; i++)
        {
            if(PrimeCheck(i))
            {sumPrimes = sumPrimes+i;}
        }
        System.out.println(sumPrimes);
    }

}
