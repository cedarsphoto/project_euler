package eulerProblems;

import java.util.HashMap;

import static common.helper.EvenCheck;

public class Euler_Problem_14 {

    public static void main(String[] args) {
        //Collatz Sequence -

        long maxVal = 0;
        long maxValx = 0;
        long termCount = 1;
        int x;//starting value
        HashMap<Integer,Integer> hmap = new HashMap<Integer, Integer>();

        for(x = 2;x < 1000000 ;x++) {
            termCount = 0;
//todo add some kind of Hashmap "cache" so when we learn that 10 gets to 1 in 7 hops we can save some calculations
            for (int i = x; i != 1; ) {
                if (EvenCheck(i)) {
                    i = i / 2;
                    termCount++;

                } else {
                    //if a number is odd, the it's ALWAYS even next so we can divide by 2 and increment the counter twice
                    i = ((3 * i) + 1) / 2;
                    termCount ++;
                    termCount ++;
                }
            }
            if(termCount > maxVal){
                maxVal = termCount;
                maxValx = x;
            }

        }
        System.out.println("Starting number " + maxValx + " has " + maxVal + " terms.");
     }
}
