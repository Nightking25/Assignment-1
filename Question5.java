import java.util.Random;

/*
  This program generates a random number between 0 and 100
  and outputs the square, cube, square root, natural logarithm
  and base 10 logarithm
*/
public class Question5 {
      public static void main(String[] args) {
            double square, cube, squareRoot, naturalLog, base10Log;
            Random random = new Random();
            double randomNumber = random.nextInt(101);
            System.out.println(randomNumber);

            square = Math.pow(randomNumber,2);        // Formula for square
            cube = Math.pow(randomNumber,3);          // Formula for cube
            squareRoot = Math.sqrt(randomNumber);     // Formula for square root
            naturalLog = Math.log(randomNumber);      // Formula for natural log
            base10Log = Math.log10(randomNumber);     // Formula for base 10 log

            System.out.println("The square of " + randomNumber + " is = " + square);
            System.out.println("The cube of " + randomNumber + " is = " + cube);
            System.out.println("The square root of " + randomNumber + " is = " + squareRoot);
            System.out.println("The natural log of " + randomNumber + " is = " + naturalLog);
            System.out.println("The base 10 log of " + randomNumber + " is = " + base10Log);
      }
}
