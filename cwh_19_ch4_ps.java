import java.util.Scanner;
public class cwh_19_ch4_ps {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //Question 1
        
        // :gives error because equal op is not in conditional.
//        int a = 11;
//        if(a=11){
//
//        }


           //question 2
    //        byte m1, m2, m3;
    //    System.out.println("Enter your marks in Physics");
    //    m1 = sc.nextByte();

    //    System.out.println("Enter your marks in Chemistry");
    //    m2= sc.nextByte();

    //    System.out.println("Enter your marks in Mathematics");
    //    m3 = sc.nextByte();
    //    float avg = (m1+m2+m3)/3.0f;
    //    System.out.println("Your Overall percentage is: " + avg);
    //    if(avg>=40 && m1>=33 && m2>=33 && m3>=33){
    //        System.out.println("Congratulations, You have been promoted");
    //    } 
    // else{
    //        System.out.println("Sorry, You have not been promoted! Please try again.");
    //    }


           // Question 3
    //    System.out.println("Enter your income in Lakhs per annum:");
    //    float tax = 0;
    //    float income = sc.nextFloat();
    //    if(income<=2.5){
    //        tax = tax + 0;
    //    }
    //    else if(income>2.5f && income <= 5f){
    //        tax = tax + 0.05f * (income - 2.5f);
    //    }
    //    else if(income>5f && income <= 10.0f){
    //        tax = tax + 0.05f * (5.0f - 2.5f);
    //        tax = tax + 0.2f * (income - 5f);
    //    }
    //    else if(income>10.0f){
    //        tax = tax + 0.05f * (5.0f - 2.5f);
    //        tax = tax + 0.2f * (10.0f - 5f);
    //        tax = tax + 0.3f * (income - 10.0f);
    //    }

    //    System.out.println("The total tax paid by the employee is: " + tax);
  


     


    //question 4
    // System.out.println("Enter a number for day: ");
    // int day=sc.nextInt();
    // switch (day) {
    //     case 1:System.out.println("Monday");
    //      break;
    //     case 2:System.out.println("Tuesday");
    //      break;
    //     case 3:System.out.println("Wednesday");
    //      break;
    //     case 4:System.out.println("Thursday");
    //      break;
    //     case 5:System.out.println("Friday");
    //      break;
    //     case 6:System.out.println("Saturday");
    //      break;
    //     case 7:System.out.println("Sunday");
    //      break;
            
           
    
    //     default:
    //         System.out.println("Invalid day");
    //         break;
    // }


    //question 5
    // System.out.println("Enter the year:");
    // int year=sc.nextInt();

    // if(( year%4==0 && year%100!=0)||(year%400==0)){
    //     System.out.println(year+" is a leap year");

    // }
    // else 
    //     System.out.println(year+"Not a leap year");




    //question 6
       String website = sc.next();
       if(website.endsWith(".org")){
           System.out.println("This is an organizational website");
       }
       else if(website.endsWith(".com")){
           System.out.println("This is a Commercial website");
       }
       else if(website.endsWith(".in")){
           System.out.println("This is an Indian website");
       }


           sc.close();
    }
}
