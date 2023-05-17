// WAP to find sum of all odd numbers between 1 to n.
import java.util.Scanner;

public class Prog24 {
  public static void main(String[] args) {
    Odd od = new Odd();
    od.OddSum();
  }
}

class Odd {
  public void OddSum() {
    Scanner sc = new Scanner(System.in);
    int num, sum = 0, i = 1;
    System.out.println("Enter a number:");
    num = sc.nextInt();
    if (i % 2 != 0) {
      do {
        sum = sum + i;
        i++;
      } while (i <= num);
    }
    System.out.println("The sum:" + sum);
  }
}