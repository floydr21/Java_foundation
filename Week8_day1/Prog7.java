//hashset and linked hashset
import java.util.*;
public class Prog7{
  public static void main(String[] args) throws Exception{
    HashSet hs=new HashSet();
    hs.add("India");
    hs.add("Usa");
    hs.add("china");
    hs.add(142);
    hs.add("India");
    System.out.println("hashset:"+hs);
    LinkedHashSet ls=new LinkedHashSet();
    ls.add("India");
    ls.add("usa");
    ls.add("china");
    System.out.println("linked hash set:"+ls);
  }
}