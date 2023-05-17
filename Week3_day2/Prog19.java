// WAP to print all alphabets from a to z. - using while loop
public class Prog19 {
  public static void main(String[] args) {
    Alpha a=new Alpha();
    a.aTOz();

  }
}
class Alpha {
  public void aTOz() {
    char ch='a';
    while(ch>='a' && ch<='z') {
      System.out.println(ch);
      ch++;
    }
  }
}