// Create an application that takes a person's birthdate as input and calculates their current age. Use conditional statements to determine if they are a minor or an adult.
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class Prog2 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the date in the format YYYY-MM-DD");
    String BirthDateString=sc.nextLine();
    // coverting string into date format
    LocalDate BirthDate= LocalDate.parse(BirthDateString);
    // calculating current date
    LocalDate CurrentDate=LocalDate.now();
    // age cal current-birthdate
    Period age=Period.between(BirthDate, CurrentDate);
    System.out.println("Year-"+age.getYears()+"Months-"+age.getMonths()+"Days-"+age.getDays());
    if(age.getYears()>=18)
    {
      System.out.println("Adult");
    }
    else{
      System.out.println("Minor");
    }
  }
}