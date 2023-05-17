// WAP to find first and last digit of a number
import java.util.Scanner;

class Prog27 {
  public static void main(String[] args) {
    SumDigit sd=new SumDigit();
    sd.firstLast();

  }
}

class SumDigit {
  public void firstLast() {
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
    System.out.println("The  first digit:"+fdigit+"last digit is:" +ldigit);
  }
}