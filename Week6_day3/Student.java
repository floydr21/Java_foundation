class StudentData{
  int rollno;
  String name;
  static String clgname="Bosco";
StudentData(int r,String n){
  r=rollno;
  n=name;
}
static void change(){
  clgname="AIMIT";
}
void display(){
  System.out.println("RollNo:"+rollno+"Name"+name+"College Name:"+clgname);
}
  
}
public class Student{
public static void main(String[] args){
  StudentData s1=new StudentData(111,"Figo");
  StudentData s2=new StudentData(222,"Ben");
  StudentData s3=new StudentData(333,"Kane");
  s1.display();
  s2.display();
  s3.display();
  StudentData.change();
  s1.display();
  s2.display();
  s3.display();
}
  
}