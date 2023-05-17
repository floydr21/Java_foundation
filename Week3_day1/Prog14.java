/* write a java program that reads a integer. you need to display a menu
 
   1. checking whether number is odd
   2. checking whether number is even
   3. checking whether number is prime
   4. checking whether number is perfect
   5. quit */
import java.util.Scanner;
public class Prog14 {
  public static void main(String[] args) {
    Menu mn=new Menu();
    mn.menuDisplay();
  }
}
class Menu {
  public void menuDisplay() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your choice:");
    System.out.println("1. Odd Checker 2. Even Checker 3. Prime Checker 4. Perfect Checker 5. Exit");
    int choice=sc.nextInt();
    switch(choice) {
      case 1:
        System.out.println("You have selected Odd checker");
        System.out.println("Enter a integer:");
        int num1=sc.nextInt();
        if(num1%2!=0)
        {
          System.out.println(num1+"is Odd");
        }
        else
          {
            System.out.println("Not");
          }
        break;
      case 2:
        System.out.println("You have selected Even checker");
        System.out.println("Enter a integer:");
        int num2=sc.nextInt();
        if(num2%2==0)
        {
          System.out.println(num2+"is Even");
        }
        else
          {
            System.out.println("Not");
          }
        break;
      case 3:
        System.out.println("You have selected Odd checker");
        System.out.println("Enter a integer:");
        int num3=sc.nextInt();
        int i,nf;
        for(i=1,nf=0;i<=num3;i++) {
          if(num3%i==0)
          nf = nf+1;
        }
        if(nf==2)
        {
          System.out.println(num3+"is Prime");
        }
        else
          {
            System.out.println("Not");
          }
       
    
        break;
      case 4:
        System.out.println("You have selected perfeect checker");
        System.out.println("Enter a integer:");
        int num4=sc.nextInt();
        int j,quotient=0;
        
        
          for(j=1;j<num4;j++)
            {
              if(num4%j==0)
              {
                quotient=quotient+j;
              }
            }
          if(num4==quotient)
          {
          System.out.println(num4+"is a perfect number"+quotient+"is the sum");
          }
          else
          {
            System.out.println("Not");
          }
        
        
        break;
      case 5:
        return;
      default:
        return;
    }
  }
}