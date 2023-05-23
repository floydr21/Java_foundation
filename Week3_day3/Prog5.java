// checking if the key elements is equal to sum of certain array elements
import java.util.Scanner;
public class Prog5 {
  public static void main(String[] args) {
    Array a=new Array();
    a.sumArray();
  }
}
class Array {
  public void sumArray() {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<arr.length;i++)
      {
        arr[i]=sc.nextInt();
      }
    System.out.println("Enter the key element:");
    int key=sc.nextInt();
    int start=arr[0];
    int sum1=0,sum2=0;
    for(int i=0;i<arr.length;i++)
      {
        sum1=start+arr[i];
        for(int j=0;j<arr.length;i++)
          {
            sum1=arr[1]+arr[j];
            
          }
      }
    if(sum1==key || sum2==key)
            {
              System.out.println("the key value"+key+"is equal to elements");
            }
    else {
      System.out.println("Not equal:");
    }
  }
}