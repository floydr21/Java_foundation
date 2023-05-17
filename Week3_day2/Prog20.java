// WAP to print all even numbers between 1 to 100. - using while     loop
public class Prog20 {
  public static void main(String[] args) {
    Even e = new Even();
    e.evenNUm();
  }
}

class Even {
  public void evenNUm() {
    int i = 2;

    while (i <= 100) {
      System.out.println(i);
      i = i + 2;
    }

  }
}