
// // Write a Java program that prompts the user to enter three numbers and finds the maximum and minimum values using math class
import java.util.Scanner;
import java.lang.Math;

public class Prog4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n1, n2, n3;
    System.out.println("Enter 3 numbers:");
    n1 = sc.nextInt();
    n2 = sc.nextInt();
    n3 = sc.nextInt();

    int maxnum1 = Math.max(n1, n2);
    int maxnum2 = Math.max(maxnum1, n3);
    System.out.println("max num:" + maxnum2);
    int minnum1 = Math.min(n1, n2);
    int minnum2 = Math.min(minnum1, n3);
    System.out.println("min num:" + minnum2);
  }
}
