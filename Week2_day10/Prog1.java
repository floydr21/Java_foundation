// Write a Java program that prompts the user to enter their weight in kilograms and height in meters, and calculates their body mass index (BMI) using conditional statements and you need to print underweight,healthy ,overweight and obessity according to the following
  /*  bmi <18                underweight
    bmi >=18 and bmi<25    healthy
    bmi>=25 and bmi<30     overweight
    bmi>=30                obessity */
import java.util.Scanner;
public class Prog1 {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    double weight,height,bmi;
    System.out.println("Enter the weight");
    weight=sc.nextDouble();
    System.out.println("Enter the height");
    height=sc.nextDouble();
    // cal body mass index
    bmi=weight/(height*height);
    if(bmi<18)
    {
      System.out.println("Underweight");
    }
    else if(bmi>=18 && bmi<25)
    {
      System.out.println("Healthy");
    }
    else if(bmi>=25 && bmi<30)
    {
      System.out.println("Overweight");
    }
    else 
    {
      System.out.println("Obessity");
    }
  }
}