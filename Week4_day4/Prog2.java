// string buufer methods
import java.util.Scanner;
public class Prog2 {
  public static void main(String[] args){
    StringBufferClass s=new StringBufferClass();
    s.bufferMethods();
  }
}
class StringBufferClass {
  public void bufferMethods() {
    Scanner sc=new Scanner(System.in);
    StringBuffer sb=new StringBuffer("This");
    
    // insert
    sb.insert(4," is strong");
    System.out.println("After inserting:"+sb);
    // append
    sb.append("Wrong");
    System.out.println("After appending:"+sb);
    // replace
    int index=sb.indexOf("Wrong");
    sb.replace(index,sb.length(),"Message");
    System.out.println("after replacing:"+sb);
 
    //delete
    sb.delete(index,sb.length());
    System.out.println("after deleting:"+sb);
 
    //reversing the string
    sb.reverse();
    System.out.println("after reversing:"+sb);
  }
}