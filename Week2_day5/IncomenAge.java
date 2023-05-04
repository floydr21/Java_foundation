// to check if income > 50k nd age>23
import java.util.Scanner;
public class IncomenAge {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the income:");
    int income=sc.nextInt();
    System.out.println("Enter the age:");
    int age=sc.nextInt();
    if(income>50000 && age>23)
    {
      System.out.println("Both conditions are True");
    }
    else
    {
      System.out.println("Both conditions are false");
    }
    if(income>50000 || age>23)
    {
      System.out.println("atleast one conditions are True");
    }
    else
    {
      System.out.println("Both conditions are false");
    }
  }
}