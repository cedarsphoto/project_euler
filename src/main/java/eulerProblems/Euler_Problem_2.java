package eulerProblems;

public class Euler_Problem_2 {

    public static void main(String[] args) {
        int i;
        int output =0;
        int seed1 = 0;
        int seed2 = 0;
        int n=0;

        for (i=0;i<4000000;i++) {
            if ((n % 2) == 0)
            { output = n + output;}
            else if (n >= 4000000)
            { break;}
            n = seed1+seed2;
            seed1 = seed2;
            seed2=n;
            n=seed1+seed2;
        }
        System.out.println("problem 2 - " + output);

    }

}
