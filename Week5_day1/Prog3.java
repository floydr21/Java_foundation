
// write a java program to find the largest palindrome substring in a string
import java.util.Scanner;

public class Prog3 {
    public static boolean isPalindrome(String str) {
     // StringBuffer sb = new StringBuffer(str);
     // StringBuffer sub = new StringBuffer("");
     // StringBuffer rev = new StringBuffer("");
      for (int i = 0; i < str.length(); i++) {
        for (int j = i + 1; j <= str.length(); j++) {
         String sub = str.substring(i, j);
         StringBuffer strigbuff=new StringBuffer(sub);
         StringBuffer rev = strigbuff.reverse();
          if (rev != strigbuff) {
            return false;
          }
        }
      }
      return true;
    }

    public static String largestPaliSub(String str) {
      String largestpali = "";
      int max = 0;
      int length = str.length();
      for (int i = 0; i < length; i++) {
        for (int j = i + 1; j <= length; j++) {
          String sub = str.substring(i, j);
          if (isPalindrome(sub) && sub.length() > max) {
            largestpali = sub;
            max = sub.length();
          }

        }

      }
      return largestpali;
    }
  

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string:");
    String str = sc.nextLine();
    String largestpali = largestPaliSub(str);
    System.out.println("Input string:" + str);
    System.out.println("Largest Palindrome:" + largestpali);
  }

}
