import java.util.*;

/*
This program prompts the user for a whole number and calulates the sum of the digits
*/
public class Question3 {

    public static void main(String args[])
    {
        int number, remainder, sumOfDigits;
        Scanner scanner= new Scanner(System.in);

        remainder = 0;
        sumOfDigits = 0;

        System.out.println("\nType a three digits number");
        number = scanner.nextInt();

        while(number>0){

            remainder = number%10;
            sumOfDigits = sumOfDigits + remainder;
            number = number/10;

        }

        System.out.print("\nThe sum of Digits is "+ sumOfDigits);
    }
}
