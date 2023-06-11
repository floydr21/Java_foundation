// Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 
/* Note that you must do this in-place without making a copy of the array.
 
 
Example 1:
 
Input: nums = [0,1,0,3,12]
Output: [1,3,12,0,0] */
import java.util.Scanner;
public class Prog3{
  public static void main(String[] args) {
    ArrayZero az=new ArrayZero();
    az.isZero();
  }
}

 

class ArrayZero{
  public void isZero() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of the array");
    int size=sc.nextInt();
    System.out.println("Enter the elements of the array:");
    int arr[]=new int[size];
    int nonzero=0;
    for(int i=0;i<size;i++)
      {
        arr[i]=sc.nextInt();
      }
    for(int i=0;i<size;i++)
      {
        if(arr[i]!=0)
        {
          arr[nonzero++]=arr[i];
        }
      }
    while(nonzero<size)
      {
        arr[nonzero++]=0;
      }
    for(int i=0;i<arr.length;i++)
      {
        System.out.print(arr[i]);
      }
  }
}
   