//illustarting comparable
import java.util.*;
public class Prog4{
  public static void main(String[] args){
    TreeSet t=new TreeSet(new MyComparator());
    t.add("A");
    t.add("Z");
    t.add("B");
    t.add("L");
    t.add("C");

    System.out.println(t);
  }
}
class MyComparator implements Comparator{
  public int compare(Object obj1,Object obj2){
    String S1=(String)obj1;
    String S2=(String)obj2;
    return -S1.compareTo(S2);
  }
}