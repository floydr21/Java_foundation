
// write a java program to print all prime numbers from 1 to n where n is an integer 
import java.util.Scanner;

public class Prog1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Prime p = new Prime();
    int num,i;
    boolean b;
    System.out.println("Enter the integer:");
    num = sc.nextInt();
    b = p.isPrime(i);
    if (b) {
      for ( i = 2; i <= num; i++) {
        System.out.println(i);
      }
    }
  }
}

class Prime {
  public boolean isPrime(int n) {
    int i;
    if (n <= 1) 
      return false;
    else {
    for ( i = 2; i < n; i++) 
      if (n % i == 0) 
        return false;
      return true;
      }
  }
}



