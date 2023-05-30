// //write a java program to find maximum and minimum element of 2d array along with index values
import java.util.Scanner;
public class Prog1{
  public static void main(String[] args){
    ArrMax am=new ArrMax();
    am.max();
  }
}
class ArrMax{
  public void max(){
    Scanner sc=new Scanner(System.in);
    int r,c;
    int maxR=0,maxC=0,minR=0,minC=0;
    System.out.println("enter the number of rows");
    r=sc.nextInt();
    System.out.println("enter the number of coloumns");
    c=sc.nextInt();
    int arr[][]=new int[r][c];
    System.out.println("enter the array elements");
    for(int i=0;i<arr.length;i++)
      for(int j=0;j<arr[i].length;j++)
        arr[i][j]=sc.nextInt();
    int max=arr[0][0];
    int min=arr[0][0];
    for(int i=0;i<arr.length;i++){
      for(int j=0;j<arr[i].length;j++){
        if(max<arr[i][j]){
          max=arr[i][j];
          maxR=i;
          maxC=j;
        }
        if(min>arr[i][j]){
          min=arr[i][j];
          minR=i;
          minC=j;
        }
  }
}
    System.out.println("max array element is "+max+"at the index"+maxR+"and"+maxC);
    System.out.println("min array element is "+min+"at the index"+minR+"and"+minC);
}
}