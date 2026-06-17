//1. Write a Java program to convert a string to lowercase.
//2.Write a Java program to replace spaces with underscores.
//3'Write a Java program to fill in a letter template which looks like below:
// letter = “Dear <|name|>, Thanks a lot”
// // Replace <|name|> with a string (some name)
// 4.Write a Java program to detect double and triple spaces in a string.
// 5.Write a program to format the following letter using escape sequence characters.
// Letter = “Dear Harry, This Java Course is nice. Thanks”

public class cwh_15_ps3 {
    public static void main(String[] args) {
        //problem 1
        // String str="HELLO WORLD ";
        // System.out.println(str.toLowerCase());

        // problem 2
        // String text = "To My     Friend";
        // text = text.replace(" ", "_");
        // System.out.println(text); 

        //problem 3
        // String letter = "Dear  <|name|>, Thanks a lot!";
        // letter=letter.replace(" <|name|>","gagan");
        // System.out.println(letter);

        // problem 4
        //   String myString = "This string contains double and  triple spaces";
        // System.out.println(myString.indexOf("  "));
        // System.out.println(myString.indexOf("   "));

        // Problem 5
        String myLetter = "Dear Harry,\n\tThis Java Course is Nice.\nThanks!";
        System.out.println(myLetter);



    }

}
