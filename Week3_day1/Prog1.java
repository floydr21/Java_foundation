
// WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;

public class Prog1 {
  public static void main(String[] args) {
    Naturals n = new Naturals();
    n.NaturalNUmbers();
  }
}

class Naturals {
  public void NaturalNUmbers() {
    Scanner sc = new Scanner(System.in);
    int i = 1, sum = 0;
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    if (num > 1) {
      do {
        sum = sum + i;
        i++;

      } while (i <= num);
      System.out.println("The sum is:" + sum);
    }
  }
}