
//import java.util.*;  (import all classes inside that package )
import java.util.Scanner; // Importing  the Scanner class

public class cwh_05_TakingInput {
    public static void main(String[] args) {
        System.out.println("Taking Input From the User");
        Scanner sc = new Scanner(System.in); // Creating an object named "sc" of the Scanner class.
        // System.out.println("Enter number 1");
        // int a = sc.nextInt(); //(Method to read from the keyboard)
        // float a = sc.nextFloat();
        // System.out.println("Enter number 2");
        // int b = sc.nextInt();
        // float b = sc.nextFloat();

        // int sum = a +b;
        // float sum = a +b;
        // System.out.println("The sum of these numbers is");
        // System.out.println(sum);
        // boolean b1 = sc.hasNextInt();
        // System.out.println(b1);
        // String str = sc.next(); -- Reads only one word Stops at space, tab, or
        // newline
        // String str = sc.next();

        String str = sc.nextLine();
        System.out.println(str);// read full line

        sc.close(); // ✅ close the Scanner

    }

}
