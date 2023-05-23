// movie ratings in 2-d array
import java.util.Scanner;
public class Prog6 {
  public static void main(String[]args){
    Array a=new Array();
    a.array2();
  }
}
class Array {
  public void array2() {
    Scanner sc=new Scanner(System.in);
    int arr[][]=new int[2][3];
    int sum=0,average=0,max=0;
    System.out.println("Enter the elements:");
    for(int i=0;i<2;i++)
      for(int j=0;j<3;j++)
        arr[i][j]=sc.nextInt();
    for(int i=0;i<2;i++){
      for(int j=0;j<3;j++)
        System.out.print("\t"+arr[i][j]);
      System.out.println();
    }
    for(int i=0;i<2;i++){
      for(int j=0;j<3;j++)
        {
          sum=sum+arr[i][j];
          
        }
    }
    average=sum/12;
    System.out.println("sum of the :"+sum);
    System.out.println("average of the :"+average);
    max=arr[0][1];
    for(int i=0;i<arr.length;i++){
      if(max<arr[i][1])
        max=arr[i][1];
    }
    System.out.println("max rating:"+max);
  }
}