// WAP to delete an element from an array at specified position. 
import java.util.Scanner;
public class Prog3 {
  public static void main(String[]args) {
    Unique q=new Unique();
    q.uniArray();
  }
}
class Unique {
  public void uniArray() {
    Scanner sc=new Scanner(System.in);
    int size,count;
    System.out.println("Enter the size of the array");
    size=sc.nextInt();
    int arr[]=new int[size];
    System.out.println("Enter the elements of the array:");
    for(int i=0;i<size;i++)
      arr[i]=sc.nextInt();
    boolean visited[]=new boolean[size];