
import java.util.Arrays;
import java.util.Scanner;

public class Prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 1st String:");
    String str1 = sc.nextLine();
    System.out.println("Enter the 2nd String:");
    String str2 = sc.nextLine();
    String sortedstr1 = sortString(str1);
    String sortedstr2 = sortString(str2);
    if (str1.length() == str2.length()) {
      if (sortedstr1 == sortedstr2) {
        System.out.println("Is Anagram");
      } else {
        System.out.println("not Anagram");
      }
    }

  }
}

class Anagram {
  public static String sortString(String str1) {
    char[] ch1 = str1.toCharArray();
    Arrays.sort(ch1);
    return new String(ch1);
  }
}