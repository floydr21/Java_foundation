//program to find the frequency of array elements
import java.util.Scanner;
 
public class Example3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[8];
    System.out.println("enter the array elements");
    for (int i = 0; i < 8; i++)
      arr[i] = sc.nextInt();
    int count;
    System.out.println("element\t\tcount");
    boolean visited[] = new boolean[8];
    for (int i = 0; i < 8; i++) {
      if (visited[i] == true)
        continue;
      count = 1;
      for (int j = i + 1; j < 8; j++) {
        if (arr[i] == arr[j]) {
          count = count + 1;
          visited[j] = true;
        }
      }
      System.out.println(arr[i] + "\t\t" + count);
 
    }
 
  }
}