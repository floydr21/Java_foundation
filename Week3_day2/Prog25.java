// WAP to print multiplication table of any number
import java.util.Scanner;

public class Prog25 {
  public static void main(String[] args) {
    Table t=new Table();
    t.MultTable();
 
  }
}

class Table {
  public void MultTable() {
    Scanner sc = new Scanner(System.in);
    int num, i = 1, range;
    System.out.println("Enter the any number for its Multiplication table:");
    num = sc.nextInt();
    System.out.println("Enter the range:");
    range = sc.nextInt();
    if(num>0)
    {
    do {
      System.out.println(num + "*" + i + (num * i));
      i++;
    } while (num <= range);
    }
  }
}