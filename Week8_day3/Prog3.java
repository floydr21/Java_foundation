// selection sort
import java.util.*;
class Sort {
  public void selectionSort(int arr[]){
    int n=arr.length;
   for(int i=0;i<n-1;i++){
      int min=i;
      for(int j=i+1;j<n;j++){
      if(arr[j]<arr[min]){
        min=j;
     }
    }
    int temp=arr[min];
    arr[min]=arr[i];
    arr[i]=temp;
    
  }
    System.out.println("The sorted array:");
    for(int i=0;i<n;i++)
      {
        System.out.println(arr[i]+" ");
      }
}
  
}
public class Prog3 {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Sort sort=new Sort();
    System.out.println("Enter the size of the array:");
    int n=sc.nextInt();
    int arr[]=new int[n];
    System.out.println("Enter the array elements:");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    sort.selectionSort(arr);
  }
}