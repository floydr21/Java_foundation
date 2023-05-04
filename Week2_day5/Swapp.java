
// swapping without temp variable
import java.util.Scanner;

public class Swapp {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a,b;
    System.out,println("Enter the integers:");
    a=sc.nextInt();
    b=sc.nextInt();
    System.out.println("Values before Swapp: a="+a+"b="+b);
    a=a+b;
    b=a-b;
    a=a-b;
    System.out.println("Values after Swapp: a="+a+"b="+b);
  }
}