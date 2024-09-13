import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100);
        int count=0;
  
        Scanner scan = new Scanner(System.in);
        int guess;
        int i=0;

        do { 
            //if guess is more than x 
            //count how many guesses
            //if count is less than 7, you print a very good response 
            //exit condition - guess = x;
           
            i++;
            System.out.println("Enter your "+i+" Guess:");
            guess = scan.nextInt();
            count++;
           if(guess<x){
                System.out.println("Too low!");
            }
            if(guess>x){
                System.out.println("Too high!");
            }

        } while (guess!=x);
         if(count <= 7){
            System.out.println("You got a impossibly good score!");
        }
        if(count > 7 && count <= 10){
            System.out.println("You did good job!");
        }
        if(count > 10){
            System.out.println("Try the divide and consequer strategy next time");
        }
    }
}