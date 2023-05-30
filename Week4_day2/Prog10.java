//  WAP to find last occurrence of a character in a given string.
import java.util.Scanner;

public class Prog9 {
  public static void main(String[] args) {
    Occur o=new Occur();
    o.noOccur();

  }
}

class Occur {
  public void noOccur() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string:");
    String str=sc.nextLine();
    System.out.print(str.lastIndexOf('a'));
  }
}