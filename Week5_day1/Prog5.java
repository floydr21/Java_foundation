// array rotation as per the value
import java.util.Scanner;
import java.util.Arrays;
public class Prog5 {
  public static void arrayRotation(int arr[],int rotate){
    int length=arr.length;
    int temp[]=new int[rotate];

    // copying first count elements to temp array
    for(int i=0;i<rotate;i++)
      {
        temp[i]=arr[i];
      }
    // shifting the remaining in the start
    for(int i=rotate;i<length;i++)
      {
        arr[i-rotate]=arr[i];
     }
    // copying the duplicate array elements to the original array
    for(int i=0;i<length;i++)
      {
        arr[length-rotate+i]=temp[i];
      }
  }
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the rotation value:");
    int rotate=sc.nextInt();
    arrayRotation(arr, rotate);
    System.out.println("The rotated array:"+Arrays.toString(arr));
   
    
  }
}
  