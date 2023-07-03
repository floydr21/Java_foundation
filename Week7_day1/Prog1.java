// mulithreading
class mythread extends Thread {
  public void run(){
    for(int i=0;i<5;i++){
      System.out.println("Child Thread");
    }
  }
}
class Prog1{
  public static void main(String[] args){
    mythread t=new mythread();
   /* for(int i=0;i<5;i++){
      System.out.println("Main Thread");
    } */
    t.start();
   // t.run();
    for(int i=0;i<5;i++){
      System.out.println("Main Thread");
    }
  }
}