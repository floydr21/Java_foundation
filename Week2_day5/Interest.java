
// Interest
import java.util.Scanner;

public class Interest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    float da, hra, groos_salary;
    System.out.println("Enter the Salary:");
    float salary = sc.nextFloat();
    da = (salary) * 50 / 100;
    System.out.println("The da=" + da);
    hra = (salary) * 20 / 100;
    System.out.print("the hra=" + hra);
    groos_salary = salary + da + hra;
    System.out.println("The gross salary=" + groos_salary);
  }
}