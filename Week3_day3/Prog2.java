// display cities using Array
import java.util.Scanner;
public class Prog2 {
  public static void main(String[] args) {
    Array a=new Array();
    a.stringArray();
  }
}
class Array {
  public void stringArray() {
    Scanner sc=new Scanner(System.in);
    String cities[]=new String[5];
    System.out.println("Enter the names of the cities:");
    
    for(int i=0;i<cities.length;i++) {
      cities[i]=sc.next();
    }
    System.out.println("The entered cities are:");
    for(int i=0;i<cities.length;i++) {
      System.out.println(cities[i]);
    }
  }
}