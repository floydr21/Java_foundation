
// WAP to find sum of all even numbers between 1 to n. using for loop
import java.util.Scanner;

public class Prog9 {
  public static void main(String[] args) {
   Even ev=new Even();
   ev.sumEven();
  }
}

class Even {
  public void sumEven() {
    Scanner sc = new Scanner(System.in);
    int num, i, sum;
    System.out.println("Enter a number:");
    num = sc.nextInt();
    
      for (i = 2, sum = 0; i <= num; i=i+2) {
        sum = sum + i;
      }
      System.out.println("the sum of n even numbers:" +sum);
    }
    
  
}