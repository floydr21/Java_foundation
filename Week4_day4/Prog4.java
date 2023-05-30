/* write the method BracketMatcher(str) take the str parameter being passed and return 1 if the brackets are correctly
matched and each one is accounted for. Otherwise return 0. For example: if str is "(hello (world))", 
then the output should be 1, but if str is "((hello (world))" the the output should be 0
because the brackets do not correctly match up. Only "(" and ")" will be used as brackets. 
If str contains no brackets return 1. */
import java.util.Scanner;
public class Prog4 {
  public static void main(String[]args){
    Brack b=new Brack();
    b.bracketMaster();
  }
}
class Brack {
  public void bracketMaster(String str){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the string");
    String str=sc.nextLine();
    for(int i=0;i<str.length;i++)
      {
        char ch=str.charAt(i);
        if(ch=="(")
        {
          return 1;
        }
        else if(ch=="(" && ch=="((")
        {
          return 0;
        }
        else
        {
          return 1;
        }
      }
  }
}