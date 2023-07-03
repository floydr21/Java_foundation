// multithreading using interface
class MyThread implements Runnable{
  public void run(){
    for(int i=0;i<5;i++){
      System.out.println(i);
    }
  }
}
public class Prog2{
  public static void main(String[] args){
    MyThread t=new MyThread();
    Thread s=new Thread(t);
    s.start();
    for(int i=0;i<5;i++){
      System.out.println("Main Thread");
    }
  }
}