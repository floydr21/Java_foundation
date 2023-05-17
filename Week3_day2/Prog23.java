//  WAP to find sum of all even numbers between 1 to n.
import java.util.Scanner;

public class Prog23 {
  public static void main(String[] args) {
    Even ev=new Even();
    ev.EvenSum();

  }
}

class Even {
  public void EvenSum() {
    Scanner sc = new Scanner(System.in);
    int num, sum = 0, i = 2;
    System.out.println("Enter a integer:");
    num = sc.nextInt();
    if (i % 2 == 0) {
      do {
        sum = sum + i;
        i++;
      } while (i <= num);
    }
    System.out.println("The sum:" + sum);
  }
}