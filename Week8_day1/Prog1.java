//list interface
import java.util.ArrayList;
class Book{
 private String title;
 private double price;
 private String authorname;

  public Book(String title,double price,String authorname ){
    this.title=title;
    this.price=price;
    this.authorname=authorname;
  }
  public String getName(){
    return title;
  }
  public double getPrice(){
    return price;
  }
  public String getAuthorname(){
    return authorname;
  }
}
public class Prog1{
  public static void main(String[] args){
    ArrayList<Book> bk=new ArrayList<Book>();

    Book bk1=new Book("novel",149,"xyz");
    Book bk2=new Book("abc",189,"pqr");
    Book bk3=new Book("qwerty",890,"lmn");
    bk.add(bk1);
    bk.add(bk2);
    bk.add(bk3);

    for(int i=0;i<bk.size();i++){
      Book b=bk.get(i);
      System.out.println("title: "+b.getName());
      System.out.println("price: "+b.getPrice());
      System.out.println("Author name: "+b.getAuthorname());
    }
  }
}