//  WAP to find power of a number using for loop.
import java.util.Scanner;
public class Prog36 {
  public static void main(String[] args) {
    Power p=new Power();
    p.powerCal();
  }
}
class Power {
  public void powerCal() {
    Scanner sc=new Scanner(System.in);
    int n,exponent,power=1;
    System.out.println("Enter the base number:");
    n=sc.nextInt();
    System.out.println("Enter the exponent:");
    exponent=sc.nextInt();
    for(int i=1;i<=exponent;i++)
      {
        power=power*n;
        
      }
    System.out.println("the power is"+power);
    
  }
}