// Given an integer n, return the number of prime numbers that are strictly less than n.
 
/*Input: n = 10
Output: 4
Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7. */
import java.util.Scanner;
public class Prog2{
  public static void main(String[]args){
    Prime p=new Prime();
    p.isPrime();
  }
}
class Prime{
  public void isPrime(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the n value:");
    int n=sc.nextInt();
    int nf=0;
    for(int i=2;i<=n;i++)
      {
        int count=0;
        for(int j=1;j<n;j++)
          {
            if(i%j==0)
              count++;
            
          }
        if(count==2)
          nf++;
      }
    System.out.println("The count of prime nums are: "+nf);
  }
}