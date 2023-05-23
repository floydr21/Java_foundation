import java.util.Scanner;
public class Prog1 {
  public static void main(String[] args) {
    Array a=new Array();
    a.inputArray();
  }
}
class Array {
  public void inputArray() {
    Scanner sc=new Scanner(System.in);
    int marks[]=new int[5];
    System.out.println("Enter the marks:");
    for(int i=0;i<marks.length;i++) {
      marks[i]=sc.nextInt();
    }
    System.out.println("The elements of array are:");
    for(int i=0;i<marks.length;i++) {
      
      System.out.println(marks[i]);
    }
    
  }
}