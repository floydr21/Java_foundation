// swapping of two numbers
import java.util.Scanner;
public class NumberSwap {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int temp;
    System.out.println("Enter the two integers:");
    int num1=sc.nextInt();
    int num2=sc.nextInt();
    System.out.println("Integers before swapping"+num1 +num2);
    temp=num1;
    num1=num2;
    num2=temp;
    System.out.println("Integers after swapping"+num1 +num2);
  }
}