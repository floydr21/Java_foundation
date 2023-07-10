
//Insertion Sort
import java.util.*;

class Sort {
  public void insertionSort(int arr[]) {
    int n = arr.length;
    for (int i = 1; i < n; i++) {
      int key=arr[i];
      int j=i-1;
      while(j>=0){
        if(key<arr[j]){
        arr[j+1]=arr[j];
        j--;
      }
      else {
        break;
      }
      }
      arr[j+1]=key;
      }
    
    System.out.println("Array After Sorting:");
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i] + " ");
    }
  }
}

public class Prog2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size:");
    int n = sc.nextInt();
    int arr[] = new int[n];
    System.out.println("Enter the array elements:");
    for (int i = 0; i < arr.length; i++) {
      arr[i] = sc.nextInt();
    }
    Sort sort = new Sort();
    sort.insertionSort(arr);
  }
}