/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumberGuessingGame;

/**
 *
 * @author HP
 */
import java.util.Scanner;
import java.util.Random;
public class NumberGuessingGame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain;
        
        do{
            int randomNumber = random.nextInt(100) + 1, attempts = 0, maxAttempts = 10;
            boolean guessedCorrectly = false;
            
            System.out.println("Guess the number (1-100). You have" + maxAttempts + "attempts.");
            
            while(attempts < maxAttempts && !guessedCorrectly){
                System.out.println("Your guess:");
                int userGuess = scanner.nextInt();
                attempts++;
                
                if(userGuess == randomNumber){
                    guessedCorrectly = true;
                    System.out.println("Correct! Guessed in" + attempts +"attempts.");
                }else{
                    System.out.println(userGuess < randomNumber? "Too low!" : "Too high!");
                }
            }
            if(!guessedCorrectly){
                System.out.println("Out of attemps. The number was" + randomNumber + ".");
            }
            
            System.out.println("Play again? (yes/no):");
            playAgain = scanner.next().equalsIgnoreCase("yes");
            
        }while(playAgain);
        System.out.println("Thanks for playing!");
        scanner.close();
    }
}

