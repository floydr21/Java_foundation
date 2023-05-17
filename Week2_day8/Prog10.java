// write a java program to check whether a character is digit or not
import java.util.Scanner;
public class Prog10 {
  public static void main(String[] args) {
    char ch;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a character:");
    ch=sc.next().charAt(0);
    if(ch>=0 && ch<=9)
    {
      System.out.println("Character is a digit");
    }
    else
    {
      System.out.println("Entered character");
    }
  }
}