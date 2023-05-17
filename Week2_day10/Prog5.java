
// write a java program to read two integers and calculate absolute value ,square root of two integers
import java.util.Scanner;
import java.lang.Math;

public class Prog5 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n1, n2;
    System.out.println("Enter the 2 integers:");
    n1 = sc.nextDouble();
    n2 = sc.nextDouble();
    double absolutevaln1 = Math.abs(n1);
    System.out.println("Absolute val of n1:" + absolutevaln1);
    double absolutevaln2 = Math.abs(n2);
    System.out.println("Absolute val of n2:" + absolutevaln2);
    double sqrtn1 = Math.sqrt(n1);
    System.out.println("Sqrt val of n1:" + sqrtn1);
    double sqrtn2 = Math.sqrt(n2);
    System.out.println("Sqrt val of n2:" + sqrtn2);
  }
}