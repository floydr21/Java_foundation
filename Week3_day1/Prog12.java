//  write a java program to check whether a positive integer is prime or not 
import java.util.Scanner;
public class Prog12 {
  public static void main(String[] args) {
    Prime p=new Prime();
    Scanner sc=new Scanner(System.in);
    int n,i,sum=0;
    System.out.println("Enter a number:");
    n=sc.nextInt();
    Boolean b=p.isPrime(n);
    
      {
        if(b)
        {
          System.out.println(n+"is Prime:");
        }
        else
        {
          System.out.println(n+"is Not Prime:");
        }
        
      }
    
}
}
class Prime{
  public boolean isPrime(int num){
    int i,nf;
    for(i=1,nf=0;i<=num;i++)
      {
        if(num%i==0)
          nf = nf+1;
      }
    if(nf==2)
      return true;
    else
      return false;
  }
}