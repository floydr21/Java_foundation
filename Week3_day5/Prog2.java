// WAP to find frequency of each digit in a given integer
import java.util.Scanner;
public class Prog2 {
  public static void main(String[]args) {
    
  }
}
class Frequency {
  public void freqDigit() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the integer:");
    int n=sc.nextInt();
    int digit;
    do{
      digit=n%10;
      n=n/10;
    }
      while(n!=0);
    for(int i=0;i<10;i++)
      {
        if(digit(i)>0)
        {
          
        }
      }
  }
}