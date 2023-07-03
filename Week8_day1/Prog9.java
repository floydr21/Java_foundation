//illustarting treeset
import java.util.*;
public class Prog9{
  public static void main(String[] args){
    TreeSet ts=new TreeSet();
    ts.add(1);
    ts.add(2);
    ts.add(5);
    ts.add(9);
    ts.add(3);
    ts.add(7);
    ts.add(10);
    System.out.println(ts);
    ts.remove(10);
    System.out.println(ts);
  }
}