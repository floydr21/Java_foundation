
// Write a program that takes in a number as input and outputs whether it is a perfect square or not. Use conditional statements to implement this program
import java.util.Scanner;
import java.lang.Math;

public class Prog3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a integer:");
    double n = sc.nextDouble();
    double nsqrt = Math.sqrt(n);

    if (nsqrt == (int) nsqrt) {
      System.out.println("Perfect square:");
    } 
    else {
      System.out.println("Not a Perfect square:");
    }
  }
}