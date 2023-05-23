// write a java program to find the difference between sum of the digits and product of the digits of a positive integer
import java.util.Scanner;
public class Prog1 {
  public static void main(String[] args) {
    Simple s=new Simple();
    s.calc();
  }
}
class Simple {
  public void calc() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the integer:");
    int n=sc.nextInt();
    int digit=0,sum=0;
    int product=1;
    do {
      digit=n%10;
      product=product*digit;
      sum=sum+digit;
      n=n/10;
    }
      while(n!=0);
      
        
    
      System.out.println("The difference between product and sum of digits:"+(product-sum));
    
    
  }
}