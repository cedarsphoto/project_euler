package eulerProblems;

public class Euler_Problem_1 {

    public static void main(String[] args) {
        // sets the limit for how high we want to go
        int cap = 1000;
        // these two numbers are the key ones from the problem
        int num1 = 3;
        int num2 = 5;
        // sets the running total to 0
        int output = 0;
        int i;

        for (i = 0; i < cap; i++) {
            // checks if the current number in sequence is cleanly divisible by num1 and num2
            if (((i % num1) == 0) || ((i % num2) == 0)) {
                output = output + i;
            }
        }

        System.out.println(output);
    }

}