
// Write a Java program that prompts the user to enter three numbers and finds the maximum and minimum values.
import java.util.Scanner;

public class Prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1, n2, n3;
    System.out.println("Enter 3 numbers:");
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    n3 = sc.nextInt();
    if ((n1 > n2) && (n1 > n3)) {
      System.out.println("Maximum Value:" + n1);
    } else if ((n2 > n1) && (n2 > n3)) {
      System.out.println("Maximum Value" + n2);
    } else {
      System.out.println("Maximum Value" + n3);
    }
    if ((n1 < n2) && (n1 < n3)) {
      System.out.println("Minimum Value:" + n1);
    } else if ((n2 < n1) && (n2 < n3)) {
      System.out.println("Minimum Value" + n2);
    } else {
      System.out.println("Minimum Value" + n3);
    }

  }
}