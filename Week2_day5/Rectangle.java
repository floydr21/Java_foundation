// Area of Rectangle
import java.util.Scanner;

public class Rectangle {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int length, breadth, area;
    System.out.println("Enter the length");
    length = sc.nextInt();
    System.out.println("Enter the breadth");
    breadth = sc.nextInt();
    area = length * breadth;
    // area
    System.out.println("Area of Rectangle is " + area);
  }
}