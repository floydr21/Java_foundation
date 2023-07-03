//illustrating list interface
import java.util.*;
public class Prog2{
  public static void main(String[] args) throws Exception{
    ArrayList<String> a1=new ArrayList<String>();
    a1.add("A");
    a1.add("B");
    a1.add("C");
    a1.add("B");
    
    System.out.println("orginal Array list:");
  
      for(String s:a1){
      System.out.print(s+" ");
    }
    a1.add(4,"E");
    a1.add(5,"F");
    System.out.println();
    System.out.println("List in Forward direction");
    ListIterator ir=a1.listIterator();
    while(ir.hasNext()){
      System.out.print(ir.next()+" ");
    }
    System.out.println();
    System.out.println("List In backward direction");
    while(ir.hasPrevious()){
      System.out.print(ir.previous()+" ");
    }
  }
}
    