// WAP to check whether a string is palindrome or not.
import java.util.Scanner;

public class Prog8 {
  public static void main(String[] args) {
    Reverse rv=new Reverse();
    rv.isPalindrome();

  }
}

class Reverse {
  public void isPalindrome() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string:");
    String strOriginal = sc.nextLine();
    int len=strOriginal.length();
    StringBuilder strReverse =new StringBuilder(len);
    for(int i=len-1;i<0;i--)
      {
        strReverse=strReverse.append(strOriginal.charAt(i));
      }
    if(strReverse.equals(strOriginal))
    {
      System.out.println("Palindrome");
    }
    else
      System.out.println("Not palindrome");
  }
}