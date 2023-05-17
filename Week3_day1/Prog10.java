
// WAP to find sum of all odd numbers between 1 to n.using for loop
import java.util.Scanner;

public class Prog10 {
  public static void main(String[] args) {
    Odd od = new Odd();
    od.sumOdd();
  }
}

class Odd {
  public void sumOdd() {
    Scanner sc = new Scanner(System.in);
    int num, sum, i;
    System.out.println("Enter a number:");
    num = sc.nextInt();
      for (i = 1, sum = 0; i <= num; i=i+2) {
        sum = sum + i;
      }
      System.out.println("The sum of n Odd numbers:" + sum);
    }
  
}
