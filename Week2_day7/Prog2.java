// to check if entered element is digit,number or special symbol
import java.util.Scanner;
public class Prog2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char ch;
    System.out.println("Enter any character:");
    ch=sc.next().charAt(0);
    if((ch>='a' && ch<='z')||(ch>='A'&& ch<='Z'))
      {
        System.out.println("Entered element is character");
      }
    else if(ch>=0 && ch<=9)
    {
      System.out.println("Entered element is number");
    }
    else
    {
      System.out.println("Entered element is symbol");
    }
  }
}