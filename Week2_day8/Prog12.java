// WAP to print all natural numbers from 1 to n. - using while loop
import java.util.Scanner;
public class Prog12 {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num;
    System.out.println("Enter the number:");
    num=sc.nextInt();
    while(num>0)
      {
        System.out.println(""+num);
        num--;
      }
  }
}