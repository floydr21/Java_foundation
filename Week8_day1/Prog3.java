//illustrating comparator
import java.util.*;
class MyComparator implements Comparator{
  public int compare(Object obj1,Object obj2){
    Employee empp1=(Emplyoee)obj1;
    Employee empp2=(Emplyoee)obj2;

    int val =empp1.addr.compareTo(empp2.addr);
      return +val;
  }
  class Employee implements Comparable{
    String name;
    int id;
    String addr;
    Employee(String name,int id,String addr){
      this.namee=name;
      this.id=id;
      this.addr=addr;
    }
    public String toString(){
      return"["+name+","+id+","+addr+"]";
    }
    public int commpareTo(Object obj){
      Employee emp=(Employee)obj;
      int val=this.addr.compareTo(emp.addr);
      return val;
    }
  }
  class Prog3{
    public static void main(String[] args){
      Employee emp1=new Employee("abc",121,"Banglore");
      Employee emp2=new Employee("pqr",111,"Chennai");
      Employee emp3=new Employee("xyz",101,"hyderabad");

      TreeSet ts=new TreeSet(new MyComparator());
      ts.add(emp1);
      ts.add(emp2);
      ts.add(emp3);
      System.out.println(ts);
    }
  }
}