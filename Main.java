
//Imports
import java.util.Scanner;


public class Main{
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int randomNum = (int)(Math.random() * 100);
        int guess = input.nextInt();
        
        
        int turns = 1;
        System.out.println("Turns: " + turns);
        while(turns <= 6){
            if(guess != randomNum){
                
                if(guess > randomNum){
                    System.out.println("Too high!");
                }

                if(guess < randomNum){
                    System.out.println("Too low!");
                }

            }
            turns++;
            guess = input.nextInt();
            System.out.println("Turns: " + turns);
            if(guess == randomNum){
                
                System.out.println("You are right on brother!");
                break;
            }

        }

        if(turns == 7){
            
            System.out.println("Game over! You ran out of turns...");
        }
        

    }
}