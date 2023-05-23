// matrix addition
import java.util.Scanner;
public class Prog7 {
  public static void main(String[] args) {
    Matrix m=new Matrix();
    m.addMatrix();
  }
}
class Matrix {
  public void addMatrix(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the rows for matrix:");
    int rows=sc.nextInt();
    System.out.println("Enter the column for  matrix:");
    int column=sc.nextInt();
    int a[][]=new int[rows][column];
    int b[][]=new int[rows][column];
    int sum[][]=new int[rows][column];

    System.out.println("Enter the elements for A Matrix:");
    for(int i=0;i<a.rows;i++)
      for(int j=0;j<a.column;j++)
        a[i][j]=sc.nextInt();

    System.out.println("Enter the elements for B Matrix:");
    for(int i=0;i<rows;i++)
      for(int j=0;j<column;j++)
        b[i][j]=sc.nextInt();

    for(int i=0;i<rows;i++)
      for(int j=0;j<column;j++)
        sum[i][j]=a[i][j]+b[i][j];

    System.out.println("The sum of matrix a n b :");
     for(int i=0;i<rows;i++) {
      for(int j=0;j<column;j++)
        System.out.print("\t"+sum[i][j]);

    System.out.println();
     }
  }
}