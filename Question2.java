import java.util.*;
/*
  This program calculates the total amount to be
  paid after calulating the tax (TPS + TVQ)
*/
public class Question2 {

      public static void main(String[] args){

            double price, total, tpsValue, tvqValue, tipsValue;

            Scanner sc = new Scanner(System.in);

            System.out.println("\n*****This program will caculate the total amount after including tax and tips*****");

            final double TPSR = 5;
            final double TVQR = 9.975;
            final double TIPSR = 15;

            System.out.println("\nWhats the price of the product in CAD?");
            price = sc.nextDouble();

            tpsValue = (TPSR * price)/100;
            tvqValue = (TVQR * price)/100;
            tipsValue = (TIPSR * price)/100;

            total = price + tpsValue + tvqValue + tipsValue;

            System.out.printf( "\n          ************************");
            System.out.printf( "\n          *1 Product      $%.2f *", price);
            System.out.printf( "\n          *  T.P.S         $%.2f *", tpsValue);
            System.out.printf( "\n          *  Tips          $%.2f *", tipsValue);
            System.out.printf( "\n          *  T.V.Q         $%.2f *", tvqValue);
            System.out.printf( "\n          *TOTAL          $%.2f *", total);
            System.out.printf( "\n          ************************");

      }
}
