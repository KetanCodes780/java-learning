import java.util.Scanner;
public class cwh_18_elseif {
    public static void main(String[] args) {
        int age;
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter your age:");
        age =sc.nextInt();

        switch (age) {
            case 18:
                System.out.println("you are going to become adult");
                break;
            case 23:
                System.out.println("yor are goning to join job");
                break;
            case 60:
                System.out.println("yor are going to retired");
                break;
        
            default:
                System.out.println("enjoy your life.");
                break;
        }
        System.out.println("Thanks for using my java code.");






        //if else if -else  ladder.
       /*  if(age>56){
            System.out.println("You are experienced ");
        }
        else if(age>46){
            System.out.println("You are  semi -experienced ");
        }
        else if (age>36){
            System.out.println("You are  semi-semi  experienced ");
        
        }
        else{
            System.out.println("You are not experienced ");
        }*/
       sc.close();
    }
    
}
