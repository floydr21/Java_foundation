
// Create a number guessing game where the computer generates a random number and the user has to guess it. if user Guess is incorrect, then give hints (weather the actual number is less than/ greater than guess number).
import java.util.Scanner;
import java.util.Random;

public class Prog3 {
  public static void main(String[] args) {
    Randomval r = new Randomval();
    r.numRandom();
  }
}

class Randomval {
  public void numRandom() {
    Scanner sc = new Scanner(System.in);
    Random random = new Random();
    int guess;
    int randomnumber = random.nextInt(4);

    System.out.println("Guess a number from 1-10: ");
    guess = sc.nextInt();
    if (guess == randomnumber) {
      System.out.println("Yo u guessed it right!!"+randomnumber);
    } else if (guess < randomnumber) {
      System.out.println("the answer is greater than you guess"+randomnumber);
    } else {
      System.out.println("the answer is less than you guess"+randomnumber);
    }

  }
}