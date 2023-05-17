//  Employee Salary Calculator: Create an application that takes an employee's salary and calculates their annual salary, tax and net salary. Use conditional statements to determine the tax bracket and calculate the tax accordingly.
import java.util.Scanner;
public class Prog8 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the salary of employee:");
    float salary=sc.nextFloat();
    float annual_salary=(salary)*12;
    System.out.println("Annual Salary:"+annual_salary);
    
}
}