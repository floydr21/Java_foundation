import java.util.Scanner;

public class SecondProg {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a, b;
    System.out.println("Enter the integer");
    a = sc.nextInt();
    b = sc.nextInt();

    // addition
    System.out.println("a+b=" + (a + b));

    //sub
    System.out.println("a-b=" + (a - b));

    //mult
    System.out.println("a*b=" + (a * b));

    //div
    System.out.println("a/b=" + (a / b));

    //remainder
    System.out.println("a%b=" + (a % b));
  }
}