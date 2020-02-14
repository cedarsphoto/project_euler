/* package eulerProblems;

import java.util.Iterator;
import java.util.TreeSet;

import static common.helper.PrimeSet;

public class Euler_Problem_3 {

    public static void main(String[] args)
    {
     //The prime factors of 13195 are 5, 7, 13 and 29.
        //
        //What is the largest prime factor of the number 600851475143 ?
        // For a given number, calculate a prime > does it equal target? > find next prime? > repeat

        {
            int target = 13;
            int value = 0;
            int first;
            int i =0;
            TreeSet<Integer> t2 = PrimeSet(target);
            Iterator<Integer> it = t2.descendingIterator();

            Integer current = 0;
            // I am stuck figuring out the best way to iterate through the contents of the list of primes I have
            while(it.hasNext())
            {

                if (i=0){
                    i = it.next();
                        }



            }


        }

    }
}
*/