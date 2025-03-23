package ex_11_While_loop;

import java.awt.desktop.AboutEvent;
import java.util.Random;
import java.util.Scanner;

//import static com.sun.beans.introspect.PropertyInfo.Name.bound;


public class Lab105_While_Guessing_Game {
    public static void main(String[] args) {
        // Guess a number between 1 and 10

        Random random = new Random();
        int numberToGuess = random.nextInt(10)+1;
        System.out.println(numberToGuess);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int guess;
        int attempts = 0;
        while(true){
            guess = scanner.nextInt();
            attempts++;
            if(guess<numberToGuess){
                System.out.println("Too low try agiain");
            }else if(guess>numberToGuess){
                System.out.println("Too high, try again");
            }else{
                System.out.println("Correct! You guessed it in" + attempts +  "attempts" );
            }
        }

    }
}
