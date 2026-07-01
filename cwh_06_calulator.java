// Write a program to calculate the percentage of a given student in the CBSE board exam. His marks from 5 subjects must be taken as input from the keyboard. (Marks are out of 100)

import java.util.Scanner;

public class CWH_06_calulator {
     public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);// sc should be of any name like scn or...
          System.out.println("Enter marks of 5 subjects out of 100:");

          int m1 = scan.nextInt();
          int m2 = scan.nextInt();
          int m3 = scan.nextInt();
          int m4 = scan.nextInt();
          int m5 = scan.nextInt();

          int sum = m1 + m2 + m3 + m4 + m5;

          int per = (sum / 5);
          System.out.println("The percentage is " + per);

          scan.close(); // ✅ close the Scanner

          // another method

          // System.out.println("Enter your Physics marks : ");
          // int physics = scan.nextInt();
          // System.out.println("Enter your English marks : ");
          // int English = scan.nextInt();
          // System.out.println("Enter your Chemistry marks : ");
          // int chemistry = scan.nextInt();
          // System.out.println("Enter your Mathematics marks : ");
          // int mathematics = scan.nextInt();
          // System.out.println("Enter your Computer Science marks : ");
          // int computer = scan.nextInt();

          // float percentage = ((physics + English + chemistry + mathematics +
          // computer)/500.0f)*100;

          // System.out.println("percentage : ");
          // System.out.println(percentage);

     }

}
