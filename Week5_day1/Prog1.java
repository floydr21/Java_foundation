
// If two strings are anagram
import java.util.Scanner;
import java.util.Arrays;

public class Prog1 {
  public static void main(String[] args) {
    Anagram a = new Anagram();
    a.isAnagram();

  }
}

class Anagram {
  public void isAnagram() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the 1st String:");
    String str1 = sc.nextLine();
    System.out.println("Enter the 2nd String:");
    String str2 = sc.nextLine();
    
    str1=str1.toLowerCase();
    str2=str2.toLowerCase();

    char ch1[] = str1.toCharArray();
    char ch2[] = str2.toCharArray();

    if (ch1.length == ch2.length) {
      Arrays.sort(ch1);
      Arrays.sort(ch2);
      
      if (Arrays.equals(ch1,ch2)) {
        System.out.println("They are anagram");
      } else {
        System.out.println("Not anagram");
      }
    }
  }
}