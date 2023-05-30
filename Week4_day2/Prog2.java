
// find the number of characters numbers and special characters in a string
import java.util.Scanner;

public class Prog2 {
  public static void main(String[] args) {
    StringClass st = new StringClass();
    st.stringChecker();
  }
}

class StringClass {
  public void stringChecker() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String");
    String str = sc.nextLine();

    int numbercount = 0;
    int charactercount = 0;
    int specialcount = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
        charactercount++;
      else if (ch >= '0' && ch <= '9')
        numbercount++;
      else
        specialcount++;
    }
    System.out.println("Character count:" + charactercount);
    System.out.println("Number count:" + numbercount);
    System.out.println("Special count:" + specialcount);
  }
}