import java.util.Scanner;
import java.util.Random;
/**
 * random number game
 * @author Darian
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  Random rand = new Random();

  // get the random number to guess
  int randInt = rand.nextInt(100) + 1;

  // declare the guess variable
  int guess;

  // create a loop to keep guessing
  do {
    // get the user's guess
    System.out.println("Please enter your guess between 1 and 100");
    guess = input.nextInt();

    // check to see how the guess compares to the random integer
    if (guess == randInt){
      System.out.println("You are correct! Good job!");
    } else if (guess > randInt){
      System.out.println("You are too high, try again!");
    }else{
      System.out.println("You are too low, try again!");
    }
  }while (guess != randInt);




  }
}
