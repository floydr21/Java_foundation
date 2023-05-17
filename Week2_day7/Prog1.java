 /* WAP to input marks of five subjects Physics, Chemistry, Biology,     Mathematics and Computer. Calculate percentage and grade according to     following:
    Percentage >= 90% : Grade A
    Percentage >= 80% : Grade B
    Percentage >= 70% : Grade C
    Percentage >= 60% : Grade D
    Percentage >= 40% : Grade E
    Percentage < 40% : Grade F*/
import java.util.Scanner;
public class Prog1 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the marks in Physics:");
    int Physics=sc.nextInt();
    System.out.println("Enter the marks in Chemistry:");
    int Chemistry=sc.nextInt();
    System.out.println("Enter the marks in Biology:");
    int Biology=sc.nextInt();
    System.out.println("Enter the marks in Mathematics:");
    int Mathematics=sc.nextInt();
    System.out.println("Enter the marks in Computer:");
    int Computer=sc.nextInt();
    int total_marks=(Physics+Chemistry+Biology+Mathematics+Computer)/5;
    float percentage=(int)(total_marks*100)/100;
    System.out.println("Percentage:"+percentage);
    if(percentage>=90)
    {
      System.out.println("garde A");
    }
    else if(percentage>=80)
    {
      System.out.println("grade B");
    }
    else if(percentage>=70)
    {
      System.out.println("grade C");
    }
    else if(percentage>=60)
    {
      System.out.println("grade D");
    }
    else if(percentage>=40)
    {
      System.out.println("grade E");
    }
    else
    {
      System.out.println("grade F");
    }
 }
}