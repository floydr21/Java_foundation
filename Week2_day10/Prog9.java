
// finding if a person can vote or not using method
import java.util.Scanner;

public class Prog9 {
  public static void main(String[] args) {
    Voting vt = new Voting();
    vt.Vote();
  }

}

class Voting {
  public void Vote() {
    java.util.Scanner sc = new Scanner(System.in);
    System.out.println("Enter the age:");
    int age = sc.nextInt();
    if (age >= 18) {
      System.out.println("Can vote");
    } else {
      System.out.println("Cannot vote");
    }

  }
}