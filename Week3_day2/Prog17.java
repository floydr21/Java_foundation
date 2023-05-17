//  WAP to print all natural numbers from 1 to n. - using while loop
import java.util.Scanner;
public class Prog17 {
  public static void main(String[] args) {
    Naturals nt = new Naturals();
    nt.NaturalNUmbers();

  }
}

class Naturals {
  public void NaturalNUmbers() {
    Scanner sc = new Scanner(System.in);
    int i = 1;
    System.out.println("Enter the number:");
    int num = sc.nextInt();
    while (i <= num){
      System.out.println(i);
      i++;
    }
  }

}