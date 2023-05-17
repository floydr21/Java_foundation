
// addition of 2 numbers using methods
import java.util.Scanner;

public class Prog8 {
  public static void main(String[] args) {
    Addition ad = new Addition();
    ad.addNum();
  }
}

class Addition {
  public void addNum() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 2 integers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.println("Sum:" + (a + b));
  }
}