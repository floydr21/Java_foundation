// WAP to find sum of first and last digit of a number.
import java.util.Scanner;

class Prog8 {
  public static void main(String[] args) {
    SumDigit sd=new SumDigit();
    sd.sumOfFirstLast();

  }
}

class SumDigit {
  public void sumOfFirstLast() {
    Scanner sc = new Scanner(System.in);
    int num, fdigit = 0, ldigit = 0;
    System.out.println("Enter the positive integer:");
    num = sc.nextInt();
    ldigit = num % 10;
    if (num > 0) {
      do {
        fdigit = num % 10;
        num = num / 10;

      } while (num != 0);
    }
    System.out.println("The sum of first and last digit is:" + (fdigit + ldigit));
  }
}