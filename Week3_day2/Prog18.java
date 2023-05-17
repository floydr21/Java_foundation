// WAP to print all natural numbers in reverse (from n to 1). -     using while loop
import java.util.Scanner;
public class Prog18 {
  public static void main(String[] args) {
    Naturals nt = new Naturals();
    nt.NaturalNUmbers();

  }
}

class Naturals {
  public void NaturalNUmbers() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    while (num!=0){
      System.out.println(num);
      num--;
    }
  }

}