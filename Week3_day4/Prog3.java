//  WAP to print all unique elements in the array.
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
    for(int i=0;i<size;i++) {
      if(visited[i]==true)
        continue;
      count=1;
      for(int j=i+1;j<size;j++)
        {
          if(arr[i]==arr[j])
          {
            count++;
            visited[j]=true;
          }
        }
      
      
    if(count==1)
          System.out.println("unique value is :"+arr[i]);
    }
    
      
  }
}