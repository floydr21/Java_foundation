/* You are working on a project that involves analyzing data from sensors installed on a wind turbine. The data is stored in an array, and you have noticed that the data has a periodic pattern that repeats every n data points, where n is a positive integer. To better analyze the data, You need to shift the elements in the array to the left by m positions, such that the first m elements are moved to the end of the array, and the remaining elements are shifted to the left by m positions, such that the original mth element becomes the first element in the new array.
 
Implement a Java program to achieve above?
 
Input Format
 
The input consists of Three lines  
 
The first line contains integer n, where n is the length of the array (1 ≤ n ≤ 10^5)  
 
The Second line contains n space-separated integers a1, a2, ..., an representing the array of integers (-10^9 ≤ ai ≤ 10^9).
 
The Third line contains integer  m(1 ≤m ≤ 10^5),
 
Output Format
 
The output is the modified Array satisfying the above requirements.
 
Sample Input1 :
 
10
 
1 2 3 4 5 6 7 8 9 10
 
4
 
Sample Output1:
 
5 6 7 8 9 10 1 2 3 4
 
Sample Input2 :
 
10
 
1 2 3 4 5 6 7 8 9 10
 
2
 
Sample Output2
 
3 4 5 6 7 8 9 10 1 2 */
import java.util.Scanner;
public class Prog4{
  public static void main(String[] args){
    Turbine tb=new Turbine();
    tb.mix();
  }
}
class Turbine{
  public void mix(){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the size of the array");
    int size=sc.nextInt();
    int arr[] =new int[size];
    System.out.println("enter tye array elements");
    for(int i=0;i<arr.length;i++){
      arr[i]=sc.nextInt();
    }
    System.out.println("enter the value of k to shift elements");
    int k=sc.nextInt();
    int a[]=new int[size-k];
    int b[]=new int[k];
    System.out.println("after changing array elements are");
    for(int i=0,j=k;i<a.length;i++){
      a[i]=arr[j];
      j++;
    }
    for(int i=0,j=0;i<b.length;i++){
      b[i]=arr[j];
      j++;
    }
    for(int i=0;i<a.length;i++){
      System.out.print(a[i]+"  ");
    }
    for (int i=0;i<b.length;i++){
      System.out.print(b[i]+"  ");
    }
  }
}
  