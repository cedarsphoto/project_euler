package eulerProblems;

public class Euler_Problem_4 {

    public static void main (String [] args) {
        int number1;
        int number2;
        int number3 = 0;
        int maxPal=0;

        for (number1 = 999, number2 = 999; number1 > 0;){
            if(number2 ==0)
            {number1--;
            number2=999;}
            number3 = CalcNum(number1,number2);
            if (PalindromeCheck(number3) == true) {
                System.out.println(number3+" is a palindrome"+number1 + " - "+number2);
                if (number3 > maxPal)
                {
                    maxPal = number3;
                }
            }
            number2--;
        }
    System.out.println(maxPal);
    }

    public static int CalcNum(int number1, int number2)
    {
        int numberCalc = number1 * number2;
        return numberCalc;
    }

    public static boolean PalindromeCheck(int number3) {
        int base = number3;
        int number4 = 0;

        while (number3 !=0) {
            number4 = number4 * 10 + number3 % 10;
            number3 = number3 / 10;
        }

        if (number4 == base) {
            return true;
        } else {
            return false;
        }

    }


}
