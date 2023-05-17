//  WAP to find frequency of each digit in a given integer.
import java.util.Scanner;
public class Prog33 {
  public static void main(String[] args) {
    Freq f=new Freq();
    f.freqdigit();
  }
}
class Freq {
  public void freqdigit() {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
    int digit,count=0;
    for(int i=1;num<0;i++) {
    digit=num%10;
    count=count+i;
    num=num/10;
    
    }
    System.out.println("Number of digits:"+count);
    
  }
}