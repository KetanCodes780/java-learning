import java.util.Scanner;
import java.util.Random;
public class cwh_20_rock_paper_scissor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int playerScore = 0, compScore = 0;


        Random r = new Random();
        //int num = r.nextInt(3)+1;//generates random no bw 1 to 3
       // System.out.println(a);

        System.out.println("How many rounds you wants to play:");
        int n=sc.nextInt();

        while(n>0){
            System.out.println("Enter your choice: 1.Stone 2.Paper 3.Scissors.");
            int choice=sc.nextInt();
             int comp = r.nextInt(3)+1;// computer chooses each round
            

            if(choice==comp){
                System.out.println("Its a tie.");
            }

            else if((choice==1&&comp==3)||
            (choice==2&&comp==1)||
            (choice==3&&comp==2)){
                System.out.println("You won.");
                playerScore++;

            }
            else{
                System.out.println("Computer won.");
                compScore++;
            }
            n--;

        }

        System.out.printf("Final score:You = %d,and computer = %d.",playerScore,compScore);


        
        sc.close();
    }
}
