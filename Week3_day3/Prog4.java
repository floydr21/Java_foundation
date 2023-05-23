// finding if the key element is there in the array or not using linnear search
import java.util.Scanner;
public class Prog4 {
  public static void main(String[] args) {
    Linnear l=new Linnear();
    l.linnearSearch();
  }
}
class Linnear {
  public void linnearSearch() {
    Scanner sc=new Scanner(System.in);
    int arr[]=new int[5];
    int key,count=0;
    System.out.println("Enter the elements in the array:");
    for(int i=0;i<arr.length;i++) {
      arr[i]=sc.nextInt();
    }
    System.out.println("Enter the key element to be searched:");
    key=sc.nextInt();
    for(int i=0;i<arr.length;i++) {
      if(key==arr[i])
      {
        System.out.println("Element found at index:"+arr[i]);
        count++;
      }
      
    }
    if(count==0)
    {
      
        System.out.println("Element not found");
      
    }
  }
}