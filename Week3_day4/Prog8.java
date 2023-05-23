//  write a java program to find multiplication of two matrices
import java.util.Scanner;
public class Prog8.java {
  public static void main(String[]args) {
    
  }
}
class Matrix {
  public void multMatrix() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the row:");
    int row=sc.nextInt();
    System.out.println("Enter the size of the column:");
    int column=sc.nextInt();
    int a[][]=new int[rows][column];
    int b[][]=new int[rows][column];
    int mult=new int[row][column];

    for(int i=0;i<row;i++)
      for(int j=0;j<column;j++)
        a[i][j]=sc.nextInt();

    for(int i=0;i<row;i++)
      for(int j=0;j<column;j++)
        b[i][j]=sc.nextInt();

    for(int i=0;i<row;i++)
      for(int j=0;j<column;j++)
        mult[i][j]=a[i][j]*b[i][j];

    for(int i=0;i<row;i++)
      for(int j=0;j<column;j++)
        mult[i][j]=a[i][j]*b[i][j];

    System.out.println("The multiplication of matrixes are:");
    for(int i=0;i<row;i++) {
      for(int j=0;j<column;j++)
        System.out.print("\t"+mult[i][j]);
      System.out.println();
        }
    
  }
}