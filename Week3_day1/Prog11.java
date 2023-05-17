// WAP to find sum of all natural numbers between 1 to n.
import java.util.Scanner;
public class Prog11 {
  public static void main(String[] args) {
    Naturals nt=new Naturals();
    nt.sumNatural();
  } 
}
class Naturals {
  public void sumNatural() {
    Scanner sc=new Scanner(System.in);
    int num,sum,i;
    System.out.println("Enter a number:");
    num=sc.nextInt();
    for(i=1,sum=0;i<=num;i++) {
      sum=sum+i;
    }
    System.out.println("The of n natural numbers:"+sum);
  }
}