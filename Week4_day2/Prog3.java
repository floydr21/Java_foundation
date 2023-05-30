
// check the number of vowels and 
import java.util.Scanner;

public class Prog3 {
  public static void main(String[] args) {
    Vowels v = new Vowels();
    v.vowelsCheck();

  }
}

class Vowels {
  public void vowelsCheck() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:");
    String str = sc.nextLine();

    int vowelcount = 0;
    int simplechar = 0;
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
        vowelcount++;
      else
        simplechar++;

    }
    System.out.println("The number of vowels:" + vowelcount);
    System.out.println("The number of consonants:" + simplechar);
  }
}