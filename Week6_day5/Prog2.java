// custom expection handling for checking insufficient bal
import java.util.Scanner;
public class Prog2{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    Withdraw wc = new Withdraw();
    System.out.println("enter amount :");
    double amount = sc.nextDouble();
    wc.withdraw(amount);
  }
}
class InsufficientFundsException extends Exception
  {
    InsufficientFundsException(String msg){
      super(msg);
    }
  }
class Withdraw{
  double balance =10000;
  public void withdraw(double amount){
    try{
    if(balance<amount)
      throw new InsufficientFundsException("amount is greater than the balance");
      else{
        System.out.println("Withdrawn successfully");
        System.out.println("Balance amount is "+(balance - amount));
      }
    }
    catch(InsufficientFundsException e){
      System.out.println("Exception caught :"+e.getMessage());
    }
  }
}