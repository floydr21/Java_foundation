
// WAP to find reverse of a string.
import java.util.Scanner;

public class Prog7 {
  public static void main(String[] args) {
    Reverse rv=new Reverse();
    rv.reverseString();

  }
}

class Reverse {
  public void reverseString() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string:");
    String strOriginal = sc.nextLine();
    int l = strOriginal.length();
    StringBuilder revString=new StringBuilder(l);
    for (int i = l - 1; i >= 0; i--) {
     revString=revString.append(strOriginal.charAt(i));
    }
    System.out.println(revString);

  }
}