class Mobile {
  String type="smartphone";
  int price;
  String brand="";
}
class Android extends Mobile {
  Android(int p,String b){
  p=price;
  b=brand;
  p=50000;
}
class IOS extends Mobile{
  price=150000;
  brand="Apple";
  
}
public class Prog2{
  public static void main(String[] args){
    Mobile m=new Mobile();
    System.out.println(m.type);
    Android a=new Android();
    IOS i=new IOS();
    System.out.println("Price:"+a.price+"\t Brand:"+a.brand);
    System.out.println("Price:"+i.price+"\t Brand:"+i.brand);
  }
}