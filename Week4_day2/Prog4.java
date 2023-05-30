
// check if character is present in the string and which index
import java.util.Scanner;

public class Prog4 {
  public static void main(String[] args) {
    Charrr c = new Charrr();
    c.charCheck();

  }
}

class Charrr {
  public void charCheck() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string:");
    String str = sc.nextLine();
    System.out.println("Enter the character to search:");
    int index;
    char ch = sc.next().charAt(0);
    for (int i = 0; i < str.length(); i++) {
      index = str.charAt(i);
      if (ch == index)
        System.out.println("Character" + ch + " found at index" + i);
  
      
    }
  }
}