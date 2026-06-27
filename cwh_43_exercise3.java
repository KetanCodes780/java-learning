  /*
    create a class Game,which allows a user to play "Guess the no"game once.
    Game should have the following methods:
    1.constructor to generate the random no
    2.takeUserInput() to take a user input of no
    3.isCorrectNumber() to detect whether the no entered by the user is true
    4.getters and setter for noOfGuesses
    Use properties such as noOfGuesses(int),etc to get this task done!
    */
import java.util.*;

class Guess_Game{
    private int computer_num;
    private int user_num;
    private int chances;

    Guess_Game(){
        System.out.println("welcome to guess no game:");
        System.out.println("Choose any no bw 1 to 100:");
        Random r=new Random();
        computer_num=r.nextInt(100);//generate 0 to 99
        chances=0;
    }

    void takeUserInput() {
     Scanner sc = new Scanner(System.in);
     user_num = sc.nextInt();
}


    void isCorrect_Number(){
        if(user_num>computer_num){
            System.out.println("Your guess is too high.");
            chances++;
        }
        else if(user_num<computer_num){
            System.out.println("Your guess is too low.");
            chances++;
        }
        else{
            System.out.println("You got it right.");
            chances++;
            System.out.println("You guess the number in " + chances +" attempts.");
        }

    }

}
public class cwh_43_exercise3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Guess_Game player1=new Guess_Game();
        while(true){
            player1.takeUserInput();
            player1.isCorrect_Number();
        }
    }
  

}
