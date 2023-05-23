//  WAP to count total number of duplicate elements in an array.
import java.util.Scanner;
public class Prog4
  {
    public static void main(String[] args)
    {
      ArrayUnique a =new ArrayUnique();
      a.arrayunique();
    }
  }
class ArrayUnique
  {
    public void arrayunique()
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the number of elements");
       int length = sc.nextInt();
      int a[] = new int[length];
       System.out.println("enter the number");
      int count;
      for(int i=0;i<length;i++)
        {
          a[i] = sc.nextInt();
        }
      
      boolean visited[] =new boolean[length];
      for(int i=0;i<length;i++)
        {
          if(visited[i]==true)
          {
            continue;
          }
          count =1;
          for(int j=i+1;j<length;j++)
            {
              if(a[i]==a[j])
              {
                count++;
                visited[j]=true;
              }
            }
          if(count>2)
          {
             System.out.println("total dublicates :"+ a[i]);
          }
        }
     
    }
  }