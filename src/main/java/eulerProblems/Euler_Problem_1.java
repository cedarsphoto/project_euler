package eulerProblems;

public class Euler_Problem_1 {

    public static void main(String[] args) {
        int cap = 1000;
        int num1 = 3;
        int num2 = 5;
        int output = 0;
        int i;

        for (i = 0; i < cap; i++) {
            if (((i % num1) == 0) || ((i % num2) == 0)) {
                output = output + 1;
            }
        }
    }

}