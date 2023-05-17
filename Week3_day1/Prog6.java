//  WAP to calculate product of digits of a number.
import java.util.Scanner;
public class Prog6 {
  public static void main(String[] args) {
    Digit dt=new Digit();
    dt.ProductDigit();
  }
}
class Digit {
  public void ProductDigit() {
     Scanner sc=new Scanner(System.in);
    int num,pd=1,digit;
    System.out.println("Enter a number:");
    num=sc.nextInt();
    if(num>0) {
      do {
        digit=num%10;
        pd=pd*digit;
        num=num/10;
      
      }
      while(num!=0);
    }
    System.out.println("The Product:"+pd);
  }
}