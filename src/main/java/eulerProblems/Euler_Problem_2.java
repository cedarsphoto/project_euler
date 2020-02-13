package eulerProblems;

public class Euler_Problem_2 {

    public static void main(String[] args) {
        int i;
        int output =2;
        int seed1 = 1;
        int seed2 = 2;
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
