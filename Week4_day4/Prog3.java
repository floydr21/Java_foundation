// largest palindrome word in the string
import java.util.Scanner;
public class Prog3{
  public static void main(String[] args){
    Palindrome p=new Palindrome();
    p.isPalindrome();
  }
}
class Palindrome {
  public void isPalindrome() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string:");
    String str=sc.nextLine();
    StringBuffer sb=new StringBuffer(str);
    String w[]=sb.split(" ");
    StringBuffer substr=new StringBuffer("");
    StringBuffer rev=new StringBuffer("");
    for(int i=0;i<w.length();i++)
      {
        substr=w.subString(0,w.l);
        rev=substr.reverse();
        if(substr==rev)
          System.out.println(rev+"Palindrome"+substr);
      }
  }
}