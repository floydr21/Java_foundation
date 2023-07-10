//Bubble Sort
import java.util.*;
class Sort{
  public void bubbleSort(int arr[]){
    int n=arr.length;
    for(int i=0;i<n-1;i++){
      for(int j=0;j<n-(i+1);j++){
        if(arr[j]>arr[j+1]){
          int temp=arr[j];
          arr[j]=arr[j+1];
          arr[j+1]=temp;
        }
      }
    }
     System.out.println("Array After sorting");
    for(int i=0;i<n;i++){
      System.out.print(arr[i]+" ");
    
  }
  
}
}
public class Prog1{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    Sort sort=new Sort();
    sort.bubbleSort(arr);
  }
}