import java.util.*;

class Prog1 {
  public static void main(String[] args) {
    Vector<String> vector = new Vector<>();
    vector.add("A");
    vector.add("B");
    vector.add("C");
    System.out.println(vector);
    System.out.println(vector.get(2));
    vector.set(0, "D");
    System.out.println(vector);
    System.out.println(vector.size());
    System.out.println(vector.capacity());
  }
}