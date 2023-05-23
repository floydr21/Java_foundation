// findind the number of negative and posotive elements in an array
import java.util.Scanner;
public class Prog3 {
  public static void main(String[]args) {
    Array a=new Array();
    a.arrayele();
  }
}
class Array {
  public void arrayele() {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    int count=0,count2=0;
    System.out.println("Enter the elements in an array:");
    for(int i=0;i<arr.length;i++) {
      arr[i]=sc.nextInt();
    }
    for(int i=0;i<arr.length;i++) {
      if(arr[i]>0) {
        count=count+1;
      }
      else {
        count2=count2+1;
      }
    }
    System.out.println("The number of positive elements:"+count);
    System.out.println("The number of negative elements:"+count2);
  }
}