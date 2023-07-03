//employee treeset
import java.util.TreeSet;
import java.util.*;
import java.lang.*;
class Employee implements Comparable{
  String name;
   int id;
   double salary;

  public Employee(String name, int id, double salary) {
    this.name=name;
    this.id=id;

    this.salary=salary;

  }

  public String getName() {
    return name;
  }

  public int getId() {
    return id;
  }

  public double getSalary() {
    return salary;
  }

  public int compareTo(Object obj) {
    Employee emp=(Employee)obj;
    if(this.id<emp.id)
      return -1;
    return this.name.compareTo(emp.name);
  }
  
}

public class Prog6 {
  public static void main(String[] args) {
    
    Employee emp1=new Employee("tahir", 101, 50000);
    Employee emp2=new Employee("abc", 102, 40000);
    Employee emp3=new Employee("pqr", 103, 30000);
    Employee emp4=new Employee("lmn", 104, 20000);
    TreeSet ts=new TreeSet(new MyComparator());
    ts.add(emp1);
    ts.add(emp2);
    ts.add(emp3);
    ts.add(emp4);
   System.out.println(ts);
    class MyComparator implements Comparator{
  public int compare(Object obj){
    return this.id.compareTo(emp.id);
  }
    }
    for(Object obj:ts){
      Employee emp=(Employee)obj;
      System.out.println(emp);
    }
  
  }
}