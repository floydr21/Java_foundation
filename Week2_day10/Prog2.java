
// Write a Java program that prompts the user to enter their age and prints out the number of years left until they can retire (assuming retirement age is 65)
import java.util.Scanner;

public class Prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int age;
    System.out.println("Enter the age of the user:");
    age = sc.nextInt();
    if (age < 65) {
      System.out.println("Remaining years for retirement:" + (65-age));
    } else {
      System.out.println("retired");
    }
  }
}