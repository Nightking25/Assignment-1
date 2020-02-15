import java.util.*;

// This Program verifies if the inputed URL is valid and secure or not.
public class Question4 {
      public static void main(String[] args) {
            int stringLength;
            Scanner scanner = new Scanner(System.in);
            String http = "https://"; //Pattern to Compare
            boolean match;

            System.out.println("\n*****This program will Verify if a given URL is Valid or Not?*****");
            //Ask user for URL
            System.out.println("Enter the URL");
            String url = scanner.nextLine();

            stringLength = url.length();
            System.out.println("Verifying an URL with " + stringLength + " characters...");

            match = (url.regionMatches(0, http, 0, 8));
            //To check if the URL is valid or not.
            if(match){
              System.out.println("Is this a valid and secure URL? " + match + ".");
            } else {
              System.out.println("Is this a valid and secure URL? " + match + ".");
            }

      }

}
