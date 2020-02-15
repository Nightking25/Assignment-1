import java.util.*;

public class Question1 {
// This calculates the total cost of the roadtrip taken by the User
      public static void main(String[] args){
            double totalCost;
            final double GAS = 1.16;
            Scanner sc = new Scanner(System.in);

            System.out.println("*****This Program will calcualte the cost of your Roadtrip****");

            //Ask the user for how many kilometers will be travelled

            System.out.println("How many kilometers are you travelling?");
            double distTravelled = sc.nextDouble();

            //Ask the user for the average distance that the vehicle runs with 1 liter of gas
            sc = new Scanner(System.in);
            System.out.println("Whats the average distance the vechicle runs with 1L of gas?");
            double avgDist = sc.nextDouble();

            totalCost = (distTravelled/avgDist)*GAS;
            System.out.printf("The Total Cost for your Road trip is: %.2f" + "$", totalCost);
      }
}
