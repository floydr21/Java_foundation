// WAP to count total number of words in a string.
import java.util.Scanner;
public class Prog6 {
  public static void main(String[]args){
    Words w=new Words();
    w.wordCount();
  }
}
class Words {
  public void wordCount() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String str=sc.nextLine();
    System.out.println("The total number of words in a string are:"+str.length());
  }
}