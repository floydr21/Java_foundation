class Person{
  static String name="Paul";
  int age;
  String gender="";
} 
class Employee extends Person{
  int empid=111;
  String joindate="22 May 2020";
 /* Employee(int e,String j){
  //  e=empid;
    j=joindate;
  } */
 void display(){
    System.out.println(empid+"\t"+joindate);
  }
  
}
class Manager extends Employee{
  int salary=10000;
  String level="assistant";
 /* Manager(int s,String l){
    s=salary;
    l=level;
  } */
  void display(){
    System.out.println(salary+"\t"+level);
  }
}
public class Prog1{
  public static void main(String[] args){
    Employee ep=new Employee();
    ep.display();
    Manager m=new Manager();
    m.display();
    
  }
}